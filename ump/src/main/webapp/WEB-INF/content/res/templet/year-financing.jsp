<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!--公司年度、季度预算审批表-->
<%@ include file="template-header.jsp"%>

<div align="center" class="billContent">
	
	<form action="res-approve-info!save.action" method="post" id="templetForm" class="contractPaymentBill">
		<%@ include file="template-var.jsp"%>
		<table  class="mainTable">
			<col width="120" align="right"/>
			<col />
			<tr>
				<td class="td_title">计划名称</td>
				<td ><input class="inputBorder" validate="required" type="text" name="templateBean.planName" value="${templateBean.planName}"  /></td>
				
			</tr>
			<tr>
				<td class="td_title">内容简述<br/>（详细内容附后）</td>
				<td  ><textarea class="inputBorder contentTextArea" validate="required" name="templateBean.contentDesc">${templateBean.contentDesc}</textarea></td>
			</tr>
		</table>
		<%@ include file="template-approver.jsp"%>
	</form>
</div>
<%@ include file="template-footer.jsp"%>