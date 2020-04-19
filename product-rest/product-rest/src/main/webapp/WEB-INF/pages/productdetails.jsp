<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h2>
Product Id is  <c:out value="${product.id}"/>
Product Name is <c:out value="${product.name}"/>
Product price is <c:out value="${product.price}"/>
</h2>
</body>
</html>