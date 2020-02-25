<%@page import="com.caixin.data.middle.etl.kettle.ext.util.StringEscapeHelper "%>
<%@page import="com.caixin.data.middle.etl.kettle.ext.util.ExceptionUtils " %>
<%@page pageEncoding="utf-8" %>
<%
	Exception e = (Exception) request.getAttribute("exception");
	String str = ExceptionUtils.toString(e);
	str = StringEscapeHelper.encode(str);
	response.getWriter().write(str);
	
%>