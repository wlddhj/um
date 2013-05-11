<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="com.hhz.ump.util.JspUtil"%>
<%@page import="com.hhz.ump.util.CodeNameUtil"%>
<%@page import="org.springside.modules.security.springsecurity.SpringSecurityUtils"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>附件管理</title>
	<%@ include file="/common/global.jsp" %>
	<meta http-equiv="Content-Type" content="text/html" />
	<link rel="stylesheet" type="text/css" href="${ctx}/css/content.css" />
	<link type="text/css" rel="stylesheet" href="${ctx}/resources/css/common/common.css"/>
	
	<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery.form.pack.js"></script>
	<script type="text/javascript" src="${ctx}/js/table.js"></script>
	<script type="text/javascript" src="${ctx}/js/prompt/ymPrompt.js"></script>

</head>
<body>
	<s:form id="mainForm" action="bid-app-attachment!upload"  method="post" enctype="multipart/form-data">
	<div id="tipUploadPorcess" style="display:none;width:100%;color:red;text-align: center;">正在上传中...</div>
	<div id="operationUploadDiv" style="padding:3px;">
		<fieldset style="padding:3px;">
		    <legend><s:text name="common.upload" /></legend>
		    <div>
			    <div>
				    <input type="hidden" name="bizModuleCd" value="${bizModuleCd}" />
				    <input type="hidden" name="bizEntityId" value="${bizEntityId}" />
				    <input type="hidden" name="filterType" value="${filterType}" />
				    <input type="hidden" name="bizEntityName" value="${bizEntityName}" />
				    <input type="hidden" name="attachModelType" value="${attachModelType}" />
				    <input type="hidden" name="uiid" value="${uiid}" />
				    <table id="downTable" class="editTable"  >
				    	<tr id="trUpload">
				    	<td><input type="file" id="file" style="line-height:22px;height:22px;margin-bottom:3px;" name="upload"/></td></tr>
				    </table>
			    </div>
			    <div>
			     	<!-- 默认允许多个上传 -->
				    <s:if test="attachModelType == null || attachModelType == ''">
				   	 	<input onclick="addNewFile();" type="button" style="line-height:22px;height:22px;" value="<s:text name="appAttachment.add"/>"/>
				    </s:if>
				    <input type="button" style="line-height:22px;height:22px;" value="<s:text name="common.upload"/>" onclick="submitAttachment()"/>
			    </div>
		    </div>
		</fieldset>
	</div>
	</s:form>
	
	<div style="padding:3px;">
		<fieldset style="padding:3px;">
		    <legend><s:text name="common.download" /></legend>
		    <div>
		    <table align="left" width="100%">
				    <s:iterator value="page.result">
				    <tr>
				    <td width="60%">
				     	<s:url id="down" action="download" namespace="/app">
						  	  <s:param name="fileName">${fileName}</s:param>
						  	  <s:param name="realFileName">${realFileName}</s:param>
						  	  <s:param name="bizModuleCd">${bizModuleCd}</s:param>
						  	  <s:param name="filterType">${filterType}</s:param>
						  	  <s:param name="id">${appAttachFileId}</s:param>
						</s:url>
						<s:set var="loginUser" ><%=SpringSecurityUtils.getCurrentUiid() %></s:set>
						<s:if test="creator==#loginUser">
							<a href="${down}">${realFileName}</a>
						</s:if>
						<s:else>
							<a href="#" title="你没有权限下载该文件" >${realFileName}</a>
						</s:else>
				    </td>
				    <td width="30%">
						<%=CodeNameUtil.getUserNamesByUiids(JspUtil.findString("creator"),";") %>
			    		<s:property value="createdDate" />
				    </td>
				    <td width="10%">
				    	<!-- 如果是共享人 或不是自己上传的文件,则不允许删除;否则,可删除 -->
						<s:set var="entityId" value="bizEntityId"></s:set>
						<s:set var="isSharedUser" value="%{isSharedUser(#entityId)}"></s:set>
						<s:set var="curUser" ><%=SpringSecurityUtils.getCurrentUiid() %></s:set>
						<s:if test="creator==#loginUser">
							<a href="app-attachment!delete.action?id=${appAttachFileId}&bizModuleCd=${bizModuleCd}&bizEntityId=${bizEntityId}&bizEntityName=${bizEntityName}&filterType=${filterType}&attachModelType=${attachModelType}&uiid=${uiid}">
				    		<font style='color:red;font-weight:bold;cursor:pointer;'>×</font></a>
						</s:if>
				    </td>
				    </tr>
				    </s:iterator>
		    </table>
		    </div>
		</fieldset>
<!--		<input type="button" value="完成"  class="btn_green_55_20" style="border:none;" onclick="doClose();" />-->
	</div>
<script type="text/javascript">
	function doClose(){
		ymPrompt.close();
	}
	function addNewFile() {
		var trUpload = $("#trUpload").clone();
		trUpload.appendTo("#downTable");
		trUpload.append("<td onclick='remove(this);' style='cursor: pointer;'><font style='color:red;font-weight:bold;cursor:pointer;'>×</font></td>");
		//$("#file").click();
		//$("#upload").css("display","block");
		//$("#upload").attr("id","");
		//$("#trUpload").css("display","block");
		//$("#trUpload").attr("id","");
	}
	function remove(dom){
		$(dom).parent().remove();
	}

	function submitAttachment(){
		
		if($("#mainForm").find("input[name='bizModuleCd']").val() == 'resContract'){ 
			var fileName = 	$("#file").val();
		    var suffix = fileName.substring(fileName.lastIndexOf('.')+1,fileName.length).toLowerCase();
		    if( suffix!= 'docx'){
				alert("请上传2007版word格式合同文件,谢谢!");
				event.preventDefault();
				$("#file").val("");
				return;
		    }
		} 
		
		$("#tipUploadPorcess").show();
		$("#operationUploadDiv").hide();
		
		$("#mainForm").ajaxSubmit(function(result){
			
			$("#tipUploadPorcess").hide();
			$("#operationUploadDiv").show();
			
			if(result.indexOf("maxSizeError") == 0){
				var max = result.split("-")[1];
				alert("上传文件最大不能超过 " + max + " M");
				//ymPrompt.alert({message:'上传文件最大不能超过'+max+'M',title:"提示",width:260,height:180});
				return;
			}
			document.location = _ctx + "/bid/bid-app-attachment.action?bizModuleCd=${bizModuleCd}&bizEntityId=${bizEntityId}&filterType=${filterType}&bizEntityName=${bizEntityName}&attachModelType=${attachModelType}&onlyCreator=onlyCreator";
		});
	}
</script>
</body>
</html>