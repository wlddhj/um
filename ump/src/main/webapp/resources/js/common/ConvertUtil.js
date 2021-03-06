var Convert = {
	/*把 JSON 对象转化为字符串 */
    ToJSONString: function(obj) {
        switch(typeof(obj)) 
        {
            case 'object':
                var ret = [];
                if (obj instanceof Array)  {
                    for (var i = 0, len = obj.length; i < len; i++) {
                        ret.push(Convert.ToJSONString(obj[i]));
                    }
                    return '[' + ret.join(',') + ']';
                } else if (obj instanceof RegExp) {
                    return obj.toString();
                } 
                else {
                    for (var a in obj){
                        ret.push(a + ':' + Convert.ToJSONString(obj[a]));
                    }
                    return '{' + ret.join(',') + '}';
                }
            case 'function':
                return 'function() {}';
            case 'number':
                return obj.toString();
            case 'string':
                return "\"" + obj.replace(/(\\|\")/g, "\\$1").replace(/\n|\r|\t/g, function(a) {return ("\n"==a)?"\\n":("\r"==a)?"\\r":("\t"==a)?"\\t":"";}) + "\"";
            case 'boolean':
                return obj.toString();
            default:
            	if(obj == undefined){
            		return "";
            	}
                return obj.toString();
            
        }
    },/*把 JSON 对象转化为字符串 */
    ToJSONSingleString: function(obj) {
        switch(typeof(obj)) 
        {
            case 'object':
                var ret = [];
                if (obj instanceof Array)  {
                    for (var i = 0, len = obj.length; i < len; i++) {
                        ret.push(Convert.ToJSONSingleString(obj[i]));
                    }
                    return '[' + ret.join(',') + ']';
                } else if (obj instanceof RegExp) {
                    return obj.toString();
                } 
                else {
                    for (var a in obj){
                    	if( a != "children" && obj[a]!=null && typeof(obj[a])!="object" )
                        ret.push(a + ':' + Convert.ToJSONSingleString(obj[a]));
                    }
                    return '{' + ret.join(',') + '}';
                }
            case 'function':
                return 'function() {}';
            case 'number':
                return obj.toString();
            case 'string':
                return "\"" + obj.replace(/(\\|\")/g, "\\$1").replace(/\n|\r|\t/g, function(a) {return ("\n"==a)?"\\n":("\r"==a)?"\\r":("\t"==a)?"\\t":"";}) + "\"";
            case 'boolean':
                return obj.toString();
            default:
            	if(obj==undefined){
            		return "";
            	}
                return obj.toString();
            
        }
    },
    /*获取可编辑表格所有更改的数据,返回json对象*/
    ToSaveJson:function(gridId){
    	var inserted = $('#'+gridId).datagrid('getChanges','inserted');
		var updated = $('#'+gridId).datagrid('getChanges','updated');
		var deleted = $('#'+gridId).datagrid('getChanges','deleted');
		var result ={'_inserted':inserted,'_updated':updated,'_deleted':deleted};
		return result;
    },
    /*获取可编辑表格所有更改的数据,返回格式为后台接收需要的格式*/
    ToSaveParam:function(gridId,parentId){
		var result = Convert.ToSaveJson(gridId);
		result = Convert.ToJSONString(result);
		var param = {'_easy_grid':result};
		if(parentId){
			param = {'_easy_grid':result,'parentId':parentId};
		}
		return param;
    },
    /*获取可编辑表格所有更改的数据,返回json对象*/
    ToSaveItemJson:function(gridId){
    	var inserted = Convert.onlyGetUpdatedData($('#'+gridId).datagrid('getChanges','inserted'));
		var updated = Convert.onlyGetUpdatedData($('#'+gridId).datagrid('getChanges','updated'));	
		var deleted = Convert.onlyGetUpdatedData($('#'+gridId).datagrid('getChanges','deleted'));
		var result ={'_inserted':inserted,'_updated':updated,'_deleted':deleted};
	
		return result;
		
    },onlyGetUpdatedData:function(data){
    	var items=new Array();
    	for(var i=0;data!=null && data!=undefined && i<data.length ; i++){
    		
    		var singleData=data[i];
    		if(singleData.children){
    			singleData.children=[];    			
    		}
    		items.push(singleData);
    	}
    	
    	return items;
    },
    
    /*获取可编辑表格所有更改的数据,返回格式为后台接收需要的格式*/
    ToSaveItemParam:function(gridId,parentId){
		var result = Convert.ToSaveItemJson(gridId);
		result = Convert.ToJSONString(result);
		var param = {'_easy_grid':result};
		if(parentId){
			param = {'_easy_grid':result,'parentId':parentId};
		}
		return param;
    },
    
   
    /*将子表(可编辑表格)更改的数据集中到主表表单中,以便一次性保存*/
    setChildren2Form:function(formId,gridId){
    	var result = Convert.ToSaveJson(gridId);
    	var childrenData = Convert.ToJSONString(result);
    	if($('#_easy_grid').length == 0){
    		$('#'+formId).append('<input type="hidden" id="_easy_grid" name="_easy_grid">');
    	}
    	$('#_easy_grid').val(childrenData);
    },
    /*将表单中的对象序列化*/
    getJson4Form:function(formId){
    	var array = $('#'+formId).serializeArray();
    	var obj = {};
    	$.each(array,function(i,n){
    		var name = n.name;
    		var key = n.value;
    		obj[name] = key;
    	});
    	return obj;
    },
    code2Name:function(ctx,v,f){
    	if(ctx){
    		_ctx=ctx
    	}
		var url = _ctx+'/com/code-name.action';
		var value = $.ajax({
			  url: url,
			  data : {value:v,field:f},
			  async: false
			 }).responseText;
		return value;
    },
    codeValidate:function(url,data){
		var value = $.ajax({
			  url: url,
			  data : data,
			  async: false
			 }).responseText;
		if('true' == value){
			return true;
		}else{
			return false;
		}
    },
    /*用户下拉选择框*/
    //<select id="userSelect" name="userCd" style="width:250px;"></select>
    initUserSelect:function(id){
    	$('#'+id).combogrid({
			url : _ctx+'/app-user!ajaxSearch.action',
			idField:'appUserId',
			textField:'userName',
			mode : 'remote',
			columns:[[
				{field:'userName',title:'姓名',width:80},
				{field:'orgName',title:'部门',width:80}
			]]
		});
    },
    initSubOrgUserListSelect:function(id){ 
    	$('#'+id).combogrid({
    		url : _ctx+'/admin/app/app-user!ajaxSubOrgUserList.action',
			idField:'appUserId',
			textField:'userName',
			mode : 'remote',
			columns:[[
				{field:'userName',title:'用户姓名',width:180},
				{field:'orgName',title:'机构名称',width:200}
			]],
			onSelect: function(){
				var record = $('#'+id).combogrid('grid').datagrid('getSelected');
				$('#'+id).val(record.appUserId);
			}
		});
    },
    search : function(searchFormId,gridId){
    	var param = Convert.getJson4Form(searchFormId);
		$('#'+gridId).datagrid('options').queryParams = param;
		$('#'+gridId).datagrid('reload');
    },
    specialChar2Html:function(sc)    {
	    var retVal=sc;
	    retVal=retVal.replace("&","&amp;"); 
	    retVal=retVal.replace("\"","&quot;"); 
	    retVal=retVal.replace("'","&quot;"); 
	    retVal=retVal.replace("<","&lt;"); 
	    retVal=retVal.replace(">","&gt;"); 
	    retVal=retVal.replace(" ","&nbsp;"); 
	    retVal=retVal.replace("  ","&nbsp;&nbsp;"); 
	    retVal=retVal.replace("\t","&nbsp;&nbsp;");
	    retVal=retVal.replace("\r\n", "<br/>");
	    return retVal;
    }


};
