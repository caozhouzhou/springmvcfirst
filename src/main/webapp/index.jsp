<%--
  Created by IntelliJ IDEA.
  User: czz
  Date: 2019/8/31
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>this is my first project</h3>
    <a href="hello">start process</a>
    <a href="param/test?user=czz&passwd=123">test param</a>

    <%--<form action="param/save" method="post">--%>
        <%--用&ensp;户&ensp;名：<input type="text" name="uname" /><br>--%>
        <%--密&emsp;&emsp;码：<input type="text" name="passwd"/><br>--%>
        <%--金&emsp;&emsp;额：<input type="text" name="money"/><br>--%>
        <%--姓&emsp;&emsp;名：<input type="text" name="user.name"/><br>--%>
        <%--年&emsp;&emsp;龄：<input type="text" name="user.age"/><br>--%>
        <%--<input type="submit" value="commit"/>--%>
    <%--</form>--%>

    <form action="user/save" method="post">
        姓&emsp;&emsp;名：<input type="text" name="name"/><br>
        年&emsp;&emsp;龄：<input type="text" name="age"/><br>
        生&emsp;&emsp;日：<input type="text" name="birthDay"/><br>
        <input type="submit" value="commit"/>
    </form>
</body>
</html>
