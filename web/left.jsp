<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-31
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    tr{
        color: #fff;
        border-bottom-width: 0;
        background: #50aca2;
        text-align: center;
        height: 2.2rem;
    }
    a:link{text-decoration:none ; color:white ;}
    a:visited {text-decoration:none ; color:white;}
    a:hover {text-decoration:underline ; color:white;}
    a:active {
        text-decoration:none;
        color:white;}
</style>
<body>
<table border="1" style=" border-collapse:collapse;border-spacing:0; border:1px  solid  #FFFFFF;">

        <tr><td><a href="lyaction.action" target="right">社区留言板</a></td></tr>
        <tr><td><a href="graction.action" target="right">个人留言板</a></td></tr>
        <tr><td><a href="udog.action"  target="right">你的爱狗</a></td></tr>
        <tr><td><a href="usInfo.action" target="right">查询个人信息</a></td></tr>
        <tr><td><a href="updateUsInfo.action" target="right">修改个人信息</a></td></tr>
        <tr><td><a href="deteUsInfo.action"  target="_top">注销用户</a></td></tr>

</table>
</body>
</html>
