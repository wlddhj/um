<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<!--成本月招采计划(商业集团)-->
<%@ include file="template-header.jsp"%>

<div align="center" class="billContent">
	<form action="res-approve-info!save.action" method="post" id="templetForm" class="contractPaymentBill">
		<%@ include file="template-var.jsp"%>
 
		<!-- 总记录数 -->
		<s:set var="conItemCount"><s:property value="templateBean.planProperties.size()"/></s:set>
		
		<!-- 模板 -->
		<s:if test="statusCd==0 || statusCd==3">
		<table class="mainTable" id="trItem" style="display:none;margin-top: 10px;">
			<col width="140px">
			<col />
			<col width="120px">
			<col />
			<tr>
				<td  class="td_title">商业公司</td>
				<td>
					<input class="inputBorderNoTip projectName" 
					validate="required" 
					type="text" name="templateBean.planProperties[0].projectName" 
					readonly="readonly"
					style="cursor: pointer;"
					onclick="initSelectFlag($(this))"
					/>
					<input type="hidden" name="templateBean.planProperties[0].projectCd"  />
				</td>
				<td  class="td_title">类别</td>
				<td  class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[0].typeCd1"  cssClass="group" ></s:checkbox>工程
					<s:checkbox name="templateBean.planProperties[0].typeCd2"  cssClass="group" ></s:checkbox>企划
					<s:checkbox name="templateBean.planProperties[0].typeCd3"  cssClass="group" ></s:checkbox>营运
					<s:checkbox name="templateBean.planProperties[0].typeCd4"  cssClass="group" ></s:checkbox>行政
				
					<img style="float:right;cursor:pointer;" 
						 title="删除本项目" 
						 class="deleteItemImg"
						 onclick="delItem(this)" 
						 imgorder='0'
						 src="${ctx}/resources/images/common/del_22_22.gif" 
						 border="0"
						 />
				</td>
			</tr>
			<tr>
				<td  class="td_title">名称</td>
				<td >
					<input class="inputBorder" validate="required" type="text" name="templateBean.planProperties[0].projectDesc"/>
				</td>
				<td  class="td_title">招标范围/采购内容</td>
				<td >
					<input class="inputBorder" validate="required" type="text" name="templateBean.planProperties[0].invPurDesc"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">预计金额(元)</td>
				<td >
					<input class="inputBorder" validate="required" type="text" name="templateBean.planProperties[0].totalPrice" onblur="formatVal($(this))" />
				</td>
				<td  class="td_title">工期要求</td>
				<td >
					<input class="inputBorder" validate="required" type="text" name="templateBean.planProperties[0].timeLimitDesc"
					/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">进场时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" name="templateBean.planProperties[0].enterDate"/>
				</td>
				<td class="td_title">定标完成时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" name="templateBean.planProperties[0].bidCompleteDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">立项审批表或方案上报</td>
				<td class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[0].lxfaFlag1"  cssClass="group"></s:checkbox>是
					<s:checkbox name="templateBean.planProperties[0].lxfaFlag2"  cssClass="group"></s:checkbox>否
				</td>
				<td class="td_title">提供时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" name="templateBean.planProperties[0].lxfaProvideDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">预算费用上报</td>
				<td class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[0].ysfyFlag1"  cssClass="group"></s:checkbox>是
					<s:checkbox name="templateBean.planProperties[0].ysfyFlag2"  cssClass="group"></s:checkbox>否
				</td>
				<td class="td_title">提供时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" name="templateBean.planProperties[0].ysfyProvideDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">招标方案、图纸及资料上报</td>
				<td class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[0].zbfaFlag1"  cssClass="group"></s:checkbox>是
					<s:checkbox name="templateBean.planProperties[0].zbfaFlag2"  cssClass="group"></s:checkbox>否
				</td>
				<td class="td_title">提供时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" name="templateBean.planProperties[0].zbfaProvideDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">备注</td>
				<td  colspan="3">
					<textarea class="inputBorder contentTextArea" name="templateBean.planProperties[0].remark"></textarea>
				</td>
			</tr>
		</table>
		</s:if>
		
		
		<!-- 列表 -->
		<s:iterator value="templateBean.planProperties" var="item" status="s">
		<table class="mainTable" style="margin-top: 10px;" id="listItem<s:property value="#s.index" />">
			<col width="130px">
			<col />
			<col width="120px">
			<col />
 			<tr>
				<td class="td_title">商业公司</td>
				<td>
					<input validate="required" type="text" 
					name="templateBean.planProperties[<s:property value="#s.index" />].projectName" 
					value="${item.projectName}" 
					readonly="readonly" 
					class="inputBorderNoTip" 
					<s:if test="#isMy==1"> 
					onclick="initSelectFlag($(this))"
					style="cursor: pointer;" 
					</s:if >
					/>
					<input type="hidden" name="templateBean.planProperties[<s:property value="#s.index" />].projectCd" value="${item.projectCd}"  />
				</td>
				<td  class="td_title">类别</td>
				<td  class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[%{#s.index}].typeCd1"  cssClass="group" ></s:checkbox>工程
					<s:checkbox name="templateBean.planProperties[%{#s.index}].typeCd2"  cssClass="group" ></s:checkbox>企划
					<s:checkbox name="templateBean.planProperties[%{#s.index}].typeCd3"  cssClass="group" ></s:checkbox>营运
					<s:checkbox name="templateBean.planProperties[%{#s.index}].typeCd4"  cssClass="group" ></s:checkbox>行政
					
					<s:if test="(statusCd==0||statusCd==3)&&userCd==#curUserCd">
						<img style="float:right;cursor:pointer;" 
							 class="deleteItemImg"
							 onclick="delItem(this)" 
							 imgorder='<s:property value="#s.index" />'
							 src="${ctx}/resources/images/common/del_22_22.gif" 
							 border="0"
							 />
					</s:if>
					
				</td>
			</tr>
			<tr>
				<td  class="td_title">名称</td>
				<td >
					<input class="inputBorder" validate="required" type="text" name="templateBean.planProperties[<s:property value="#s.index" />].projectDesc" value="${item.projectDesc}"/>
				</td>
				<td  class="td_title">招标范围/采购内容</td>
				<td >
					<input class="inputBorder" validate="required" type="text" name="templateBean.planProperties[<s:property value="#s.index" />].invPurDesc" value="${item.invPurDesc}"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">预计金额(元)</td>
				<td >
					<input class="inputBorder" validate="required" type="text"  value="${item.totalPrice}" name="templateBean.planProperties[<s:property value="#s.index" />].totalPrice" onblur="formatVal($(this))"/>
				</td>
				<td  class="td_title">工期要求</td>
				<td >
					<input class="inputBorder" validate="required" type="text" value="${item.timeLimitDesc}"  name="templateBean.planProperties[<s:property value="#s.index" />].timeLimitDesc"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">进场时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" value="${item.enterDate}" name="templateBean.planProperties[<s:property value="#s.index" />].enterDate"/>
				</td>
				<td class="td_title">定标完成时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" value="${item.bidCompleteDate}" name="templateBean.planProperties[<s:property value="#s.index" />].bidCompleteDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">立项审批表或方案上报</td>
				<td class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[%{#s.index}].lxfaFlag1"  cssClass="group"></s:checkbox>是
					<s:checkbox name="templateBean.planProperties[%{#s.index}].lxfaFlag2"  cssClass="group"></s:checkbox>否
				</td>
				<td class="td_title">提供时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" value="${item.lxfaProvideDate}" name="templateBean.planProperties[<s:property value="#s.index" />].lxfaProvideDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">预算费用上报</td>
				<td class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[%{#s.index}].ysfyFlag1"  cssClass="group"></s:checkbox>是
					<s:checkbox name="templateBean.planProperties[%{#s.index}].ysfyFlag2"  cssClass="group"></s:checkbox>否
				</td>
				<td class="td_title">提供时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" value="${item.ysfyProvideDate}" name="templateBean.planProperties[<s:property value="#s.index" />].ysfyProvideDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">招标方案、图纸及资料上报</td>
				<td class="chkGroup" align="left"  validate="required">
					<s:checkbox name="templateBean.planProperties[%{#s.index}].zbfaFlag1"  cssClass="group"></s:checkbox>是
					<s:checkbox name="templateBean.planProperties[%{#s.index}].zbfaFlag2"  cssClass="group"></s:checkbox>否
				</td>
				<td class="td_title">提供时间</td>
				<td >
					<input onfocus="WdatePicker()" class="Wdate inputBorder" type="text" validate="required" value="${item.zbfaProvideDate}"  name="templateBean.planProperties[<s:property value="#s.index" />].zbfaProvideDate"/>
				</td>
			</tr>
			<tr>
				<td  class="td_title">备注</td>
				<td  colspan="3">
					<textarea class="inputBorder contentTextArea" name="templateBean.planProperties[<s:property value="#s.index" />].remark">${item.remark}</textarea>
				</td>
			</tr>
		</table>
		</s:iterator>
		<div id="listTable">
		</div>
		<s:if test="statusCd==0||statusCd==3">
		<input type="button" class="btn_blue_75_55" value="增加项目" onclick="addItem();" />
		</s:if>
		<%@ include file="template-approver.jsp"%>
	</form>
</div>
<%@ include file="template-footer.jsp"%>
<script type="text/javascript">

	function initSelectFlag(jDom){
		if( jDom.attr('initselectflg') != '1'){
			jDom.attr('initselectflg','1'); 
			jDom.orgSelect({
				showProjectOrg:true
			});
			jDom.trigger('click');
		}
	}

	var trApprover=$("#trItem").clone();
	$("#trItem").remove();
	var cloneCount = 0;
	var index=${conItemCount};
	
	function addItem(){
		var trApprover_new = trApprover.clone();
		cloneCount++;
		$(trApprover_new).show();

		$(trApprover_new).attr("id",('listItem'+index));
		$(trApprover_new).find(":input").each(function(i){
			this.name=this.name.replace('0',index);
		});
		$(trApprover_new).find("img").each(function(i){
			$(this).attr("imgorder",index);
		});
		
		var projectNameDom = $(trApprover_new).find(".projectName");
		projectNameDom.attr("id","projectName"+index);
		
		var responserNameDom = $(trApprover_new).find(".responserName");
		responserNameDom.attr("id","responserName"+index);
		
		index++;
		$("#listTable").append(trApprover_new);
		addClickAction(trApprover_new);
		refreshImg();
	}
	function delItem(dom){
		var imgorder = $(dom).attr("imgorder");
		$('#listItem'+imgorder).remove();
		refreshImg();
	}
	function refreshImg(){
		if( $('.deleteItemImg').length == 1){
			$('.deleteItemImg').hide();
		}else{
			$('.deleteItemImg').show();
		}
	}
	
</script>

<!-- 默认1条申请记录 -->
<s:if test="resApproveInfoId==null">
<script type="text/javascript">
	addItem();
</script>
</s:if>