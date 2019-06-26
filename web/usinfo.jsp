<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-31
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<style>
    tr{
        background:#50ac81;
        color: #fff;
        border-bottom-width: 0;
        text-align: center;
        height: 2.2rem;"
    }

</style>
<body bgcolor="#D9DFAA">


    <table border="1" id="dataTable"  style=" border-collapse:collapse;border-spacing:0; border:1px  solid  #FFFFFF;" >
        <caption>个人信息</caption>
        <s:set value="#request.use" var="use"/>
        <tr>
            <td>ID：</td><td> <s:property value="#use.getId()" /> </td>
        </tr>
        <tr>
            <td>用户名：</td><td> <s:property value="#use.getUsername()" /> </td>
        </tr>
        <tr>
            <td>邮箱：</td><td><s:property value="#use.getEmail()"/> </td>
        </tr>
        <tr>
            <td>电话：</td><td><s:property value="#use.getTel()"/> </td>
        </tr>
    </table>
</body>
</html>
