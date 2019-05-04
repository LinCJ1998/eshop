<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <style>
        body{
            margin: 0px;
            /*background-image: url("http://img5.imgtn.bdimg.com/it/u=161888459,1712714238&fm=26&gp=0.jpg");*/
            background-repeat: no-repeat;
            background-size:100% 100%;
            background-attachment: fixed;
            /*background-color: #333333;*/
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
<div style="margin: 0px auto auto auto;" >
    <form action="/login">
        <div style="width:30%;height:800px;background:rgba(40,57,101,.9);margin: 0px auto 0px auto;padding: 50px">
            <a href="regist.jsp" style="margin-left: 500px;color: red;">注册</a>
            <div style="font-size:28px;">用户登录</div>
            <br/>
            <span class="p">*</span>
            <label class="l">用户名:</label>
            <div class="d">
                <input id="username" name="username" type="text" class="i">
            </div>
            <br/><br/>
            <span class="c">*</span>
            <label class="l">登录密码:</label>
            <div  class="d">
                <input id="password" name="password" type="password" class="i">
            </div>
            <br/><br/>
            <input type="submit" value="登录" style="margin:100px;height:30px;width:300px;background-color:red;display:inline-block;"/>
        </div>
    </form>
</div>
</body>
</html>

