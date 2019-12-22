<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>მომავლის კონდიტერი</title>
    <link rel="stylesheet" type="text/css" href="news.css">
    <meta charset="UTF-8">
</head>
<body>
<div class="home">
    <div class="colo">
        <ul>

            <li><a href="/web_war_exploded/Home?action=home">მთავარი</a></li>

            <li><a href="/web_war_exploded/Choose?action=choose">პროდუქციის არჩევა</a></li>

            <li><a href="/web_war_exploded/Order?action=order">შეკვეთა</a></li>

            <li><a href="/web_war_exploded/Recept?action=recept">რეცეპტი</a></li>

            <li><a href="/web_war_exploded/Jobs?action=jobs">დასაქმება</a></li>

            <li><a href="/web_war_exploded/About?action=about">შესახებ</a></li>

            <tr>
                <td>მეილი: </td>
                <td><input type="text" name="mail"></td>
            </tr>

            <tr>
                <td>პაროლი: </td>
                <td><input type="text" name="password"></td>
            </tr>

            <td>
                <a href="/web_war_exploded/Login?action=login" > შესვლა </a>
                <a href="/web_war_exploded/User?action=signup" > რეგისტრაცია </a>
            </td>
        </ul>
    </div>
</div>
</body>
</html>
