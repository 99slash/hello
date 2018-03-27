<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/1/5
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="800" height="100" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
    <tr height="40px">
        <td>id：</td>
        <td>名称：</td>
        <td>描述：</td>
        <td>图片Url：</td>
        <td>品牌网址：</td>
        <td>排序:最大最排前：</td>
        <td>是否可见 1:可见 0:不可见：</td>
    </tr>
    <c:forEach items="${requestScope.brands}" var="brands">
        <tr height="40px">
            <td>${brands.id}</td>
            <td>${brands.name}</td>
            <td>${brands.description}</td>
            <td>${brands.img_url}</td>
            <td>${brands.web_site}</td>
            <td>${brands.sort}</td>
            <td>${brands.is_display}</td>
        </tr>
    </c:forEach >
</table>
</body>
</html>
