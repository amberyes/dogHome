<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-26
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<%@	taglib uri="/struts-tags" prefix="s" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<head>
    <title>留言</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body>
<s:form action="addaction" method="post" enctype="multipart/form-data" >
    <table>
        <caption>填写留言信息</caption>
        <tr>
            <td><textarea name="lyer.text" rows="5" cols="35"></textarea></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交" /><input type="reset" value="重置" />
            </td>
        </tr>
    </table>
</s:form>


</body>
</html>