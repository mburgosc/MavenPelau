<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head></head>
<body>
    <h1> hola desde un jsp y tal</h1>


<!-- dentro del if puedes comprobar si la variable existe -->
   <!-- <c:if test="${empty nota}">
    <b> no tienes nota desgraciao</b>
    </c:if> -->

<!-- choose permite hacer un else-->


<div>

    Bill's city': ${personCity.Bill}

</div>

<div>

    <c:forEach var="person" items="${personCity}">
    <div> Name: ${person.key}</div>
    <div> City: ${person.value}</div>
    </c:forEach>

</div>

<div>
    Nom: ${toni.getName()}
    <!-- tambien se puede usar el noombre y aunque sea privado se buscara un getter y no dara error siempre que haya un getter-->
    Nom. ${toni.name}
</div>

<!-- pere lo ha hecho exactamente igual-->
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