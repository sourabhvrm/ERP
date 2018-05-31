<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>

<tiles:insertAttribute name="banner"/><br/>
<hr/>
<tiles:insertAttribute name="menu" /><br/>
<hr/>
<tiles:insertAttribute name="body" /><br/>
<hr/>
<tiles:insertAttribute name="footer" /><br/>


</body>
</html>