<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-31
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<%@	taglib uri="/struts-tags" prefix="s" %>
<html>
<body bgcolor="#D9DFAA">
<s:set var="us" value="#request.us"></s:set>
<!-- 上传文件时要加入黑体部分-->
<s:form action="updateUs" method="post" enctype="multipart/form-data" >
    <table>
        <tr>
            <td>id:</td>
            <td><input type="text" name="user.id" value="<s:property value="#us.getId()"/>" /></td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="user.username" value="<s:property value="#us.getUsername()"/>" /></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" name="user.password" value="<s:property value="#us.getPassword()"/>" /></td>
        </tr>
        <tr>
            <td>邮箱:</td>
            <td><input type="text" name="user.email" value="<s:property value="#us.getEmail()"/>" /></td>
        </tr>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="user.tel" value="<s:property value="#us.getTel()"/>" /></td>
        </tr>

        <tr>
            <td><input type="submit" value="修改"/></td>
        </tr>
    </table>
</s:form>
</body>
</html>
