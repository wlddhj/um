<%@page import="org.springside.modules.security.springsecurity.SpringSecurityUtils"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<!--请假单(新)商业公司-->
<div class="billContent">
	<div class="div_row">
		<div><s:checkbox name="templateBean.dayType1" cssClass="group"></s:checkbox><span>短期</span></div>
		<div><s:checkbox name="templateBean.dayType2" cssClass="group"></s:checkbox><span>长期</span></div>
	</div>
	<div class="div_row">
		<div><s:checkbox name="templateBean.positionLevel1" cssClass="group"></s:checkbox><span>总经理</span></div>
		<div><s:checkbox name="templateBean.positionLevel2" cssClass="group"></s:checkbox><span>经理以上人员</span></div>
		<div><s:checkbox name="templateBean.positionLevel3" cssClass="group"></s:checkbox><span>其他人员</span></div>
	</div>
	<%@ include file="hr-holiday-apply-base.jsp"%>
</div>
