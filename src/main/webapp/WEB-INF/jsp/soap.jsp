<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>Hello Spring MVC</title>
   </head>
   
   <body>
   <c:set var="country" value="${country}"/>
   <c:if test="country not null">
      Country:
      name: <c:out value="${country.name}"/>
      capital: <c:out value="${country.capital}"/>
      currency: <c:out value="${country.currency.value()}"/>
      population: <c:out value="${country.population}"/>

   </c:if>
   <c:otherwise>
      Chose the country
   </c:otherwise>
   </body>
</html>