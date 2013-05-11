<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>


<form rel="billing" id="billingForm" action="ctdb-billing-app!loadList.action" method="post" accept-charset="utf-8">
	
	<input type="hidden" name="selectedItems" id="selectedItems"/>
	<input type="hidden" name="pageNo" />
	
	
	<div  style="clear: left;float: left;margin-left: 20px;margin-top: 15px;margin-bottom: 10px;">
		<font style="font-size: 14px;float: left;font-weight: bold;">按条件搜索</font>
	</div>
	<div class="firstPart" style="clear: left;float: left;margin-left: 30px;">
		<table style="width: 100%;">
			<tr style="margin-bottom: 10px;margin-top: 10px;padding-bottom: 10px;line-height: 28px;">
				<td align="right"  style="padding-right: 5px;">项目名称：</td>
				<td><input name="projectName" id="billing_orgName"></input></td>
				<td></td>				
				<td></td>				
			</tr>
			
			<tr style="margin-bottom: 10px;margin-top: 10px;padding-bottom: 10px;line-height: 28px;">
				<td align="right"  style="padding-right: 5px;">合同名称：</td>
				<td><input name="ctName"  id="billing_projectName"></input></td>		
				<td></td>				
				<td></td>		
			</tr>
			
			<tr style="margin-bottom: 10px;margin-top: 10px;padding-bottom: 10px;line-height: 28px;">
				<td align="right"  style="padding-right: 5px;">乙方：</td>
				<td><input name="impSupName"  id="billing_impSupName"></input></td>	
				<td></td>				
				<td></td>			
			</tr>
			<tr style="margin-bottom: 10px;margin-top: 10px;padding-bottom: 10px;line-height: 28px;">
				<td align="right"  style="padding-right: 5px;" >结算日期：</td>
				<td><input name="billingDate"  id="billing_billingDate"  onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',onpicked:function(dp){}})"   class="Wdate"></input></td>				
				<td width="30px;" style="padding-left: 5px;">至：</td>					
				<td><input name="billingDateTo"  id="billing_billingDateTo"  onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',onpicked:function(dp){}})"   class="Wdate"></input></td>
			</tr>
			<tr>				
				<td></td>
				<td colspan="3" style="text-align:left;">
					<input type="button" class="btn_new btn_query_new" onclick="searchByModuleId();" value="搜索" />
					<input type="button" class="btn_new btn_clean_new" onclick="clearTabSearch();"  value="清空条件" style="width: 70px;"/>
					<input type="button" class="btn_new btn_cancel_new" onclick="closeTabSearch();" style="width:70px;" value="关闭" />
				</td>
			</tr>
		</table>
	</div>	
</form>