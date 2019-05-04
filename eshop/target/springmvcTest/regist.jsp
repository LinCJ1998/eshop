<%--
  Created by IntelliJ IDEA.
  User: CJ
  Date: 2019/4/18
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body{
            background-image: url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1556262323098&di=89cf8f4d0a746939ef4dbc15fb7209d9&imgtype=0&src=http%3A%2F%2Fpic.uzzf.com%2Fup%2F2012-8%2F20128585644.png");
            background-repeat: no-repeat;
            background-size:100% 100%;
            background-attachment: fixed;
        }
        .p{
            color:red;
            margin-left:20px;
            display:inline-block;
        }
        .c{
            color:red;
            margin-left:4px;
            display:inline-block;
        }
        .l{
            font-size:18px;
            color: white;
        }
        .d{
            height:35px;
            width:300px;
            display:inline;
        }
        .i{
            height:30px;
            width:300px;
        }


    </style>
</head>
<body>
<div style="height:80px;text-align: center"></div>
<form action="/regist">
    <div style="width:500px;margin:0 20px;text-align:center">
        <div style="font-size:28px;">注册新用户</div>
        <br/>
        <span class="p">*</span>
        <label class="l">用户名:</label>
        <div class="d">
            <input id="username" name="username" type="text" class="i">
        </div>
        <br/><br/>
        <span class="p">*</span>
        <label class="l">邮箱:</label>
        <div  class="d">
            <input id="email" name="email" type="text" class="i">
        </div>
        <br/><br/>
        <span class="c">*</span>
        <label class="l">登录密码:</label>
        <div  class="d">
            <input id="login_password" name="login_password" type="password" class="i">
        </div>
        <br/><br/>
        <span class="c">*</span>
        <label class="l">确认密码:</label>
        <div  class="d">
            <input id="confirm_password" name="confirm_password" type="password" class="i">
        </div>
        <br/><br/>
        <span class="p">*</span>
        <label for="ver_code" class="l">验证码:</label>
        <div  class="d">
            <input id="ver_code" name="ver_code" type="text" class="i">
        </div>
        <br/><br/>
        <input type="checkbox" name="agree" style="margin-left:100px;display:inline-block;" value="1"/>
        <span style="font-size:10px;">我已阅读并同意《用户注册协议》</span>
        <br/><br/>
        <input type="submit" value="同意以上协议并注册" style="margin-left:100px;height:30px;width:300px;background-color:red;display:inline-block;"/>
    </div>
</form>

</body>
</html>
