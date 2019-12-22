<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>რეგისტრაცია</title>
    <link rel="stylesheet" type="text/css" href="news.css">
    <meta charset="UTF-8">
</head>

<body>
<form action="/web_war_exploded/User" method="post">


    <div class="back">

        <img src="choose/img/user.jpg" style="width:200px;height:150px;" />

        <h1>რეგისტრაცია</h1>
        <tr>
            <td>სახელი: </td>
            <td><input type="text" name="firstName"></td>
        </tr>
        </br>
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
        <tr>
            <td colspan="2"></td>
            <td><input type="submit" value="დამატება"></td>
        </tr>
    </div>
</form>
</body>
</html>