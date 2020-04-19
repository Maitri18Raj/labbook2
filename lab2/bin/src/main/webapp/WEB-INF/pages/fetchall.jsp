<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h1>Record of all Trainee</h1>
<table border="1">
    <tr>
      <th>
        Id
        
      </th>
      <th > 
        Name
        </th>
        <th > 
          Domain
          </th>
          <th > 
            Location
            </th>
           
 </tr>
 <c:forEach items="${store1}" var="trainee">
<tr >
    <td><c:out value="${trainee.traineeId}"/></td> 
    <td><c:out value="${trainee.traineeName}"/></td> 
    <td><c:out value="${trainee.traineeDomain}"/></td>
    <td><c:out value="${trainee.traineeLocation}"/></td>
  </tr>
</c:forEach>
 </table>
 <a href="logout">Log-out</a>
<a href="operations">Operations</a>
</body>
</html>