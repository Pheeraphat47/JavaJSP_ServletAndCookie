<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Pheeraphat
  Date: 10/29/2023
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiplication Table</title>
</head>
<body>
<h2>Multiplication Table of ${param.number}</h2>
<hr>

<!--  ตารางสูตรคูณ -->
<!-- เช็คกรณีที่ไม่ Error-->
<c:if test="${message == null}">
<table style="border: 1px solid darkcyan; text-align: right">
    <tr style="background-color: antiquewhite"><td colspan="5">${param.number}</td></tr>
    <c:forEach begin="1" end = "12" var="n">
        <tr>
            <td> ${param.number} </td>
            <td> x </td>
            <td> ${n} </td>
            <td> = </td>
            <td> ${n*param.number}</td>
        </tr>
    </c:forEach>
</table>
</c:if>

<!-- เช็คกรณีที่ Error-->
<c:if test="${message != null}">
    <h3 style="color: red"> Error::</h3>
    <hr>
    <span>${message}<span style="color: red">(${param.number==null? 'Null' : param.number})</span>
</c:if>
</body>
</html>
