<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>daigual</title>
</head>
<body>

<c:choose>
<c:when test="${not empty ok}">
<h1> Bienvenido ${name}, bien programado</h1>

${dni}
</c:when>
<c:otherwise>
<h1>el dni no es correcto</h1>
</c:otherwise>
</c:choose>


</body>
</html>