<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!-- 我的记录 -->
	<s:form id="mainFormSearch" action="res-approve-info!load.action" method="post">
		<jsp:include page="res-approve-info-search.jsp"></jsp:include>
		<div id="tableDiv">
		<div class="titleBar" style="width:100%; height:30px;">
		<ul class="cost-nav" id="cost-nav" style="float:left;">
			<s:iterator value="opinions">
			<li id="div_${key}" <s:if test='%{key==selectOpinion}'>class="cost-nav-click"</s:if> onclick="seleOption('${key}');">
				&nbsp;${value}&nbsp;
			</li>
			</s:iterator> 
		</ul>
		</div>
		<!-- 搜索结果! -->
		<jsp:include page="res-approve-info-result.jsp"></jsp:include>
		</div> 
	</s:form>