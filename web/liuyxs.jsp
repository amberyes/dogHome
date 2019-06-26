<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-29
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language = "java"  pageEncoding = "utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<head>
    <title>留言</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body bgcolor = "#E3E3E3">

<s:form action="turnTo" method="post" enctype="multipart/form-data">

<table border="1" id="dataTable"  style=" border-collapse:collapse;border-spacing:0; border:1px  solid  #FFFFFF;" >
    <caption>所有留言信息</caption>

    <tr  style="background:#50aca2;color: #fff;border-bottom-width: 0;  text-align: center; height: 2.2rem;">
        <td>编号</td>
        <td>用户</td>
        <td>留言</td>
        <td>留言时间</td>
    </tr>
    <s:iterator value="#request.list" var="lye">
    <tr   style="background: #e5efeb; text-align: center;height: 2.2rem;">
        <td> <s:property value="#lye.id" /> </td>
        <td> <s:property value="#lye.username" /> </td>
        <td><s:property value="#lye.text"/> </td>
        <td><s:property value="#lye.date"/> </td>
    </tr>

    </s:iterator>
    <tr>
    <td><input type="submit" value="留言"/></td>
</tr>
</table>
</s:form>

</body>
</html>