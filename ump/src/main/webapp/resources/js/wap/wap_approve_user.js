var mapTree = {}; // 加载通讯录
var ID_SEARCH_RESULT = 'searchResult';// 搜索面板ID
var ID_WAB_TREE = 'wap_orgList';	//机构树ID
var DEFAULT_SEARCH_TIP = '搜索联系人...';
var userSearchMgr;
function expandNode(orgId) {
	var wabTreeId = "div_tree_" + orgId;
	var wabWaitingId = "div_waiting_" + orgId;
	var liId = "li_" + orgId;
	var wabTree = mapTree[orgId];
	if ($("#" + wabTreeId).css('display')=='none'){
	if (!wabTree) {
		$("#" + wabTreeId).show();
		$("#" + wabTreeId).addClass('loadImg');
		$.post(_ctx + "/wap/wap-approve-info!getChildNodes.action", {
			'orgId' : orgId,'shareUserCds':delayApproveUserCd
		}, function(result) {
			$("#" + wabTreeId).removeClass('loadImg');
			$("#" + wabTreeId).html(result);
			$("#" + liId).removeClass('ul_li_right').addClass('ul_li_drop');
			mapTree[orgId] = true;
		});
	}else{
		$("#" + wabTreeId).show();
		$("#" + liId).removeClass('ul_li_right').addClass('ul_li_drop');
	}
	}else{
		$("#" + wabTreeId).hide();
		$("#" + liId).removeClass('ul_li_drop').addClass('ul_li_right');
	}
}
function chooseUser(uiid){
	removeSelectedUser(delayApproveUserCd,delayApproveUserName);
	var userName=$('#li_'+uiid).html();
	if (delayApproveUserCd.indexOf(uiid+';')==-1){
		delayApproveUserCd=uiid;
		delayApproveUserName=userName;
		$('#li_'+uiid).addClass('li_user_selected');
	}else{
		delayApproveUserCd='';
		delayApproveUserName='';
		$('#li_'+uiid).removeClass('li_user_selected');
	}
	//设置选中人员，在wap_approve_input.js
	setSelectedUser();
}
//搜索结果选择人员
function chooseSrhUser(uiid,userName){
	removeSelectedUser(delayApproveUserCd,delayApproveUserName);
	if (delayApproveUserCd.indexOf(uiid+';')==-1){
		delayApproveUserCd=uiid;
		delayApproveUserName=userName;
		$('#div_srh_'+uiid).addClass('li_user_selected');
	}else{
		delayApproveUserCd='';
		delayApproveUserName='';
		$('#div_srh_'+uiid).removeClass('li_user_selected');
	}
	//设置选中人员，在wap_approve_input.js
	setSelectedUser();
}

function searchUserResult(srcElem) {
	var wabTreeElemId = ID_WAB_TREE;
	var resultElemId = ID_SEARCH_RESULT;
	if (userSearchMgr)
		clearTimeout(userSearchMgr);
	userSearchMgr = setTimeout(function() {
		var val = $.trim($(srcElem).val());
		if (val == "") {
			$("#" + wabTreeElemId).show();
			$("#" + resultElemId).hide();
			return;
		} else {
			$("#" + wabTreeElemId).hide();
			$("#" + resultElemId).show();
			$(srcElem).css( {
				color : "#5A5A5A"
			});
			$("#" + resultElemId).addClass("waiting");
			$.post(_ctx + "/wap/wap-approve-info!searchUserList.action", {
				value : val,'shareUserCds':delayApproveUserCd
			}, function(result) {
				$("#" + resultElemId).html(result).removeClass("waiting").height(320).show();// 300:计算排除的高度
			});
		}
	}, 300);
}
function clearSearchInput(srcElem) {

	var wabTreeElemId = ID_WAB_TREE;
	var resultElemId = ID_SEARCH_RESULT;

	var val = $.trim($(srcElem).val());
	if (val == DEFAULT_SEARCH_TIP) {
		$(srcElem).val("");
		$(srcElem).css( {
			color : "#5A5A5A"
		});

		$("#" + wabTreeElemId).show();
		$("#" + resultElemId).hide();
	}
};
function resetSearchInput(srcElem){

	var wabTreeElemId = ID_WAB_TREE;
	var resultElemId = ID_SEARCH_RESULT;
	
	var val = $.trim($(srcElem).val());
	if( val == '' || val == DEFAULT_SEARCH_TIP){
		$(srcElem).val(DEFAULT_SEARCH_TIP);
		$(srcElem).css({color:"#909090"});
		$("#"+wabTreeElemId).show();
		$("#"+resultElemId).hide();
	}
}

//设置选中的人员
function setSelectedUser(){
	$('#resChoosed').html('');
	var userNames=delayApproveUserName.split(';');
	var userCds=delayApproveUserCd.split(';');
	for(var i=0;i<userNames.length;i++){
		$('#resChoosed').append('<div id="div_user_'+userCds[i]+'" onclick=removeSelectedUser("'+userCds[i]+'","'+userNames[i]+'");>'+userNames[i]+'</div>');
	}
}
function removeSelectedUser(uiid,userName){
	delayApproveUserCd='';
	delayApproveUserName='';
	$('#div_user_'+uiid).remove();
	$('#li_'+uiid).removeClass('li_user_selected');
	$('#div_srh_'+uiid).removeClass('li_user_selected');
}
function doChoose(){
	try{
		if (shareUserCds!=''){
				$.post(_ctx+"/res/res-approve-info!choose.action",{
					shareUserCds:shareUserCds,
					shareUserNames:shareUserNames,
					shareMsg:shareMsg,
					isAcc:$("#isAcc").val(),
					id:id
					},
				function(result) {
					openDetail();
				});
		}else{
			alert("请选择人员");
		}
	}catch(e){
		alert(e);
	}
}