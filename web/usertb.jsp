<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-31
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@	taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>社区板</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<frameset rows="36.9%,*" border="0">
    <frame src="head.jsp">
    <frameset cols="13%,*" border="0">
        <frame src="left.jsp">
        <frame src="right.jsp" name="right">
    </frameset>
</frameset>
</html>

