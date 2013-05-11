<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<div id="batchAuthority" style="display: block; clear: both; margin: 0px; padding: 5px; border:1px solid #0167A2;background: none repeat scroll 0% 0% rgb(247, 247, 247);">
	<div >
		<table class="tb_search">
			<col width="70"/>
			<col width="200"/>
			<col width="100"/>
			<col/>
		 <tr>
		 	<td  class="td_title"><label><font color="red">*</font>项目：</label></td>
		 	<td><input type="text" id="bisProjectName" name="bisProjectName" value="${bisProjectName}" style="width:120px;height:20px;" />
				<input type="hidden" id="bisProjectId" value="${bisProjectId}"/></td>
			<td  class="td_title"><label><font color="red">*</font>业态：</label></td>
			<td>
			  <select style="width:120px;" id="floorType" name="floorType" onchange="changeFloor();">
					<option value="">--选择--</option>
					<option value="1">商铺</option>
					<option value="2">公寓</option>
					<option value="3">多经</option>
				</select>
			</td>
		 </tr>
			<tr>
			<td class="tdFloorTd td_title">楼(层)号：</td>
			<td class="tdFloorTd"><select style="width:120px;" id="bisFloorId" name="bisFloorId" ><option>--全部楼层--</option></select></td>
			<td  class="td_title"><font color="red">*</font>权责年月：</td>
			<td><input class="Wdate" type="text" id="feeDate" name="feeDate" value='${feeDate}' style="width:120px;" onfocus="WdatePicker({dateFmt:'yyyy-MM'})"/>
			</td>
		</tr>
		<tr>
		 <td colspan="4">&nbsp;</td>
		</tr>
		<tr> 
		  <td colspan="4"><input id="btn_exp_fact" class="btn_green" type="button" style="width:60px;" onclick="doExport();" value="导出模板"/></td>
		</tr>
		<tr>
		 <td colspan="4">
		    <form action="${ctx}/bis/bis-fact!importDataPoi.action" method="post" enctype="multipart/form-data" id="factForm">
				<input type="file" id="importFile2" name="importFile" style="line-height:22px;height:22px;"/>
				&nbsp;
				<s:radio id="importFactType" list="#{'1':'新增','2':'覆盖'}" name="importFactType"></s:radio>
				  <input type="button" class="btn_green fact_dime" style="width:65px;" onclick="importFactFile();" value="导入数据"/>
				</form>
		 </td>
		</tr>
		</table>
	</div>
</div>