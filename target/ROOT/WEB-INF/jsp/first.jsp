<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPW html>
<html>
<head></head>
<body>
    <h1> hola desde un jsp y tal</h1>

    <table border="1">
    <c:forEach var="n" items="${aleatoris}">
    <tr>
    <c:forEach var="n2" items="${n}">
     <td>${n2} </td>
     </c:forEach>
     </tr>
    </c:forEach>
    </table>
</body>
</html>