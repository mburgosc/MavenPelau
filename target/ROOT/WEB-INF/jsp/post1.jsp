<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>daigual</title>
</head>
<body>
<h1> Login</h1>

<form action="/postexemple" method="post">
<table>
<tr>
    <td>Nom: </td> <td> <input type="text" name="name"> </td>
</tr>
<tr>
    <td> DNI: </td><td> <input type="text" name="dni"> </td>
</tr>
</table>
<button type="submit">enviar</button>
</form>

</body>
</html>