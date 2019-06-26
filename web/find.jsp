<%--
  Created by IntelliJ IDEA.
  User: amber
  Date: 2018-12-26
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>DogHome</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Zoo Planet Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/top.js"></script>


</head>
<body>


<center><h1>找回密码</h1></center>
<div class="ver-info">
    <div class="pp-1">
        <s:form action="findm" method="post">
            <table>

                <div class="m-b">
                    <input type="text" name="user.username" placeholder="请输入用户名" maxlength="11" class="bg-white text" >
                </div>

                <div class="m-b">
                    <input type="text" name="user.email" placeholder="请输入邮箱" maxlength="22" class="bg-white text" >
                </div>
                <div class="grid m-b">
                    <div class="grid-cell">
                        <input type="submit" value="找回密码" class="p-code text t-center"   >
                        <input type="reset" value="重置" class="p-code text t-center"   >
                    </div>
                </div></table>
        </s:form>
    </div>
</div>
</body>
</html>