<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<%-- 招标文件/合同评审表（商业工程） --%>
<%@ include file="template-header.jsp"%>

<script type="text/javascript">
	function onchange_DesignTotalDay() {
		var fromDate = $("#fromDate").val();
		var toDate = $("#toDate").val();
		if(isEmpty(fromDate) || isEmpty(toDate)) {
			return;
		}
		var fArray = fromDate.split("-");
		var tArray = toDate.split("-");
		var fDate = new Date(fArray[0],fArray[1]-1,fArray[2]);
		var tDate = new Date(tArray[0],tArray[1]-1,tArray[2]);
		if(tDate.getTime()<fDate.getTime()) {
			//alert("结束时间不能小于开始时间");
			$("#totalDay").val("");
			return;
		}
		var day = Math.abs(tDate.getTime()-fDate.getTime())/1000/60/60/24+1;
		$("#totalDay").val(day);
	}
</script>
<c:set var="isSy">false</c:set>
<c:if test='${fn:startsWith(authTypeCd, "BLSY_")||fn:startsWith(authTypeCd, "SYGS_")||fn:startsWith(authTypeCd, "SYGS_")}'>
<c:set var="isSy">true</c:set>
</c:if>
<s:set var="canEdit">
<s:if test="(statusCd==0||statusCd==3)&&userCd==#curUserCd">
true
</s:if>
<s:else>
false
</s:else>
</s:set>

<div align="center" class="billContent">

	<form action="res-approve-info!save.action" method="post" id="templetForm" class="contractPaymentBill">
		<%@ include file="template-var.jsp"%>
		<%--删除商业集团公司发起 --%>
		<table  class="mainTable">
			<col width="110"/>
			<col/>
			<col width="100"/>
			<col/>
			<s:if test="aboutHotel">
			<tr>
				<td class="td_title">审批权限</td>
				<td align="left" colspan="3">
					<table class="tb_checkbox" style="width:100%;">
					    <col width="100">
					    <col width="100">
						<col width="100">
						<col width="100">
						<tr>
						<td><s:checkbox name="templateBean.hotel"  cssClass="group"></s:checkbox>与酒店有关</td>
						</tr>
					</table>
				</td>
			</tr>
			</s:if>
			<s:if test="authTypeCd=='JD_ZCGL_ZB_10'||authTypeCd=='JD_ZCGL_ZB_20'||authTypeCd=='JD_ZCGL_ZB_30'||authTypeCd=='JD_ZCGL_ZB_40'">
			<tr>
				<td class="td_title require"></td>
				<td colspan="3" class="chkGroup" align="center"  validate="required">
					<table class="tb_checkbox">
					<col width="150">
					<col width="150">
					<tr>
					<td><s:checkbox name="templateBean.outFlag" id="outFlag" cssClass="group"></s:checkbox>预算外</td>
					<td><s:checkbox name="templateBean.inFlag" id="inFlag" cssClass="group"></s:checkbox>预算内</td>
					</tr>
					</table>
				</td>
			</tr>
			</s:if>
			<tr>
				<td class="td_title">项目名称</td>
				<td>
				<input validate="required" type="text" name="templateBean.projectName" value="${templateBean.projectName}" id="projectName" readonly="readonly" <s:if test="#isMy==1"> class="inputBorderNoTip projSelect" style="cursor: pointer;" </s:if ><s:else> class="inputBorderNoTip" </s:else>/>
				<input type="hidden" id="projectCd"  name="templateBean.projectCd" value="${templateBean.projectCd}"  />
				</td>
				<td class="td_title">工程名称</td>
				<td>
				<input class="inputBorder" validate="required" type="text" name="templateBean.engineeringName" value="${templateBean.engineeringName}" />
				</td>
			</tr>
			<tr>
				<td class="td_title" rowspan="1" valign="middle" align="center">评审内容</td>
				<td colspan="3" class="chkGroup" align="center"  validate="required">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="200"/>
						<col/>
						<col width="10"/>
						<tr>
						<td><s:checkbox name="templateBean.approveContent1" cssClass="group" ></s:checkbox>招标文件(招标文件编号：</td>
						<td><input class="inputBorder" validate="required" type="text" name="templateBean.oriBidFileCd" value="${templateBean.oriBidFileCd}" /></td>
						<td>)</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td class="td_title" rowspan="6" valign="middle" align="center">招  标<br/>主  要<br/>内  容</td>
				<td colspan="3" style="padding-top:3px;">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="80"/>
						<tr>
						<td>招标范围:</td>
						<td>
						<input class="inputBorder" validate="required" type="text" name="templateBean.bidRange" value="${templateBean.bidRange}" />
						</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="3" style="padding-top:3px;">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="70"/>
						<col/>
						<col width="30"/>
						<col/>
						<col width="30" align="center"/>
						<col/>
						<col width="30"/>
						<tr>
						<td>施工工期:</td>
						<td>
						<input onfocus="WdatePicker()" onchange="onchange_DesignTotalDay()" class="Wdate inputBorder" type="text" validate="required" id="fromDate" name="templateBean.fromDate" value="${templateBean.fromDate}"/>
						</td>
						<td align="center">至</td>
						<td>
						<input onfocus="WdatePicker()" onchange="onchange_DesignTotalDay()" class="Wdate inputBorder" type="text" validate="required" id="toDate" name="templateBean.toDate" value="${templateBean.toDate}"/>
						</td>
						<td>共</td>
						<td>
						<input class="inputBorder" validate="required" type="text" id="totalDay" name="templateBean.totalDay" value="${templateBean.totalDay}"/>
						</td>
						<td>天</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="3" style="padding-top:3px;">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="80"/>
						<tr>
						<td>质量要求:</td>
						<td>
						<input class="inputBorder" validate="required" type="text" name="templateBean.qualityRequirement" value="${templateBean.qualityRequirement}" />
						</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="3" style="padding-top:3px;">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="80"/>
						<tr>
						<td>计价模式:</td>
						<td colspan="3" class="chkGroup" align="center" validate="required">
						<table class="tb_checkbox">
						<col>
						<tr>
						<td><s:checkbox name="templateBean.pricingModel1"  cssClass="group"></s:checkbox>总价包干</td>
						</tr>
						<tr>
						<td><s:checkbox name="templateBean.pricingModel2"  cssClass="group"></s:checkbox>单价包干</td>
						</tr>
						</table>
						</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="3" style="padding-top:3px;">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="80"/>
						<tr>
						<td>预算金额(元):</td>
						<td>
						<input class="inputBorder" validate="required" type="text" name="templateBean.budgetAmount" value="${templateBean.budgetAmount}" onblur="formatVal($(this));" />
						</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="3" style="padding-top:3px;">
					<table border="0" cellpadding="0" cellspacing="0" class="tb_noborder">
						<col width="80"/>
						<tr>
						<td>付款方式:</td>
						<td>
						<input class="inputBorder" validate="required" type="text" name="templateBean.paymentType" value="${templateBean.paymentType}" />
						</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td class="td_title" rowspan="1">评审附件<br/>(请作为附件上传)</td>
				<td style="height:40px;" validate="required" value="${templateBean.bidContractFileId}">招标合同文件</td>
				<td>
				<s:if test="#canEdit=='true'">
				<input type="button" value="上传附件" class="btn_green_65_20" style="border:none;" onclick="showUploadSingleAttachDialog('招标合同文件','${resApproveInfoId==null?entityTmpId:resApproveInfoId}','resCustomFile','bidContractFileId',event);"/>
				<input type="hidden" name="templateBean.bidContractFileId" id="bidContractFileId" value="${templateBean.bidContractFileId}"/>
				</s:if>
				</td>
				<td>
				<div id="show_bidContractFileId"></div>
				<script type="text/javascript">
				showUploadedFile('${templateBean.bidContractFileId}','bidContractFileId','${canEdit}');
				</script>
				</td>
			</tr>
		</table>
		<%@ include file="template-approver.jsp"%>
	</form>
</div>
<%@ include file="template-footer.jsp"%>
