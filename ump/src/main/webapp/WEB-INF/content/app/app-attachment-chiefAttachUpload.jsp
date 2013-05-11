<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp" %>
<%@ include file="/common/nocache.jsp"%>

<%@page import="com.hhz.ump.util.JspUtil"%>
<%@page import="com.hhz.ump.util.Util"%>
<%@page import="com.hhz.ump.util.CodeNameUtil"%>
<%@page import="org.springside.modules.security.springsecurity.SpringSecurityUtils"%>

<link type="text/css" rel="stylesheet" href="${ctx}/css/resApprove.css" />

<s:form id="attachChiefForm" action="/app/app-attachment!uploadChiefAttach.action" enctype="multipart/form-data">
    <div style="padding:10px;">
	    <input type="hidden" id="attachChiefForm_bizModuleCd" name="bizModuleCd" value="${bizModuleCd}" />
	    <input type="hidden" id="attachChiefForm_bizEntityId" name="bizEntityId" value="${bizEntityId}" />
	    
	    <div style="height: 30px;">
	    	<input type="file" id="attachChiefForm_uploadInput" name="upload" size="30" style="float: left; height: 25px; margin-left: 30px; width: 200px;"/>
   	 	</div>
   	 	
	</div>
</s:form>