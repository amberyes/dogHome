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
    <style type="text/css">
        .banner-header {
            background: url("images/a1.jpg")no-repeat 0px 0px;
            background-size: cover;
            min-height: 223px;
            text-align:center;
            padding: 4em 0 0;
        }</style>

</head>

<body>

<center><h1>用户登录</h1></center>

    <div class="ver-info">

        <div class="pp-1">
            <s:form action="login" method="post">
                <table>

                <div class="m-b">
                    <input type="text" name="dlb.username" placeholder="请输入用户名" maxlength="11" class="bg-white text" >
                </div>

                <div class="m-b">
                    <input type="password" name="dlb.password" placeholder="请输入密码" maxlength="16" class="bg-white text" >
                </div>
                <a href="findMm.action">忘记密码？</a>
                <div class="grid m-b">
                    <div class="grid-cell">
                        <input type="submit" value="登录" class="p-code text t-center"   >
                        <input type="reset" value="重置" class="p-code text t-center"   >
                    </div>
                </div></table>
            </s:form>
        </div>
    </div>
如果没注册点击<a href="register.jsp">这里</a>注册！

</body>
</html>