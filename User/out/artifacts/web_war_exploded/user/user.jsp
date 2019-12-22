<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/web_war_exploded/Login" method="post">


    <tr>
        <td>მეილი: </td>
        <td><input type="text" name="mail"></td>
    </tr>
    <br>
    <tr>
        <td>პაროლი: </td>
        <td><input type="text" name="password"></td>
    </tr>
    <br>

    <td colspan="2"></td>
    <td><input type="submit" value="შესვლა"></td>

    <td>
        <a href="/web_war_exploded/Login?action=forgotpassword"> აღდგენა </a>
    </td>

</form>

