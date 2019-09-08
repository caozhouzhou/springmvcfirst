<%--
  Created by IntelliJ IDEA.
  User: czz
  Date: 2019/9/7
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>springmvc注解</h3>
    <a href="anno/testRequestParam?name=23"> testRequestParam</a>
    <form action="anno/testRequestBody" method="post">
        姓&emsp;&emsp;名：<input type="text" name="name"/><br>
        年&emsp;&emsp;龄：<input type="text" name="age"/><br>
        <input type="submit" value="commit"/>
    </form>

    <a href="anno/czz/testPathVariable/12"> testPathVariable</a>
    <a href="anno/testRequestHeader">testRequestHeader</a>
    <a href="anno/testCookieValue">testCookieValue</a>

    <form action="anno/testModelAttribute" method="post">
        姓&emsp;&emsp;名：<input type="text" name="name"/><br>
        年&emsp;&emsp;龄：<input type="text" name="age"/><br>
        <input type="submit" value="commit"/>
    </form>

    <form action="anno/testModelAttribute1" method="post">
        姓&emsp;&emsp;名：<input type="text" name="name"/><br>
        年&emsp;&emsp;龄：<input type="text" name="age"/><br>
        <input type="submit" value="commit"/>
    </form>

</body>
</html>
