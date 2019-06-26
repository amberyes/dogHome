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

<form>

    <table border="1" style=" border-collapse:collapse;border-spacing:0; border:1px  solid  #FFFFFF;">
        <caption>你的狗</caption>
        <tr style="background:#50aca2;color: #fff;border-bottom-width: 0;  text-align: center; height: 2.2rem;">
            <th>编号</th>
            <th>类型</th><th>狗名</th></tr>

        <s:iterator value="#request.list" var="dog">
            <tr  style="background: #e5efeb; text-align: center;height: 2.2rem;">
                <td> <s:property value="#dog.id" /> </td>
                <td><s:property value="#dog.leixing"/> </td>
                <td><s:property value="#dog.dogname"/> </td>

            </tr>
        </s:iterator>


    </table>
</form>
<s:form action="dadd" method="post" enctype="multipart/form-data" >
    <table>
        <tr>
            <td>输入犬种:</td>
            <td><input type="text" name="dog.leixing" /></td>
        </tr>
        <tr>
            <td>输入狗名:</td>
            <td><input type="text" name="dog.dogname" /></td>
            <td><input type="submit" value="增加"/></td>
        </tr>

    </table>
</s:form>
<s:form action="deletedog" method="post" enctype="multipart/form-data" >
    <table>
        <tr>
            <td>选择编号:</td>
            <td><input type="text" name="dog.id" /></td><td><input type="submit" value="删除"/></td>
        </tr>

    </table>
</s:form>
</body>
</html>