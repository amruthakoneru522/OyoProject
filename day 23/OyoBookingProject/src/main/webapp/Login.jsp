<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Login.jsp">
		Customer Name : 
		<input type="text" name="customerName" /> <br/><br/> 
		
		<input type="submit" value="Login" />
	</form>
	<c:if test="${param.userName!=null && param.passWord!=null}">
		<jsp:useBean id="beanLibUsers" class="com.infinite.OyoBookingProject.Rooms"/>
		<jsp:setProperty property="*" name="beanLibUsers"/>
		<jsp:useBean id="beanDao" class="com.infinite.OyoBookingProject.OyoDAO"/>
		<c:set var="customer" value="${param.customerName}"/>
		
		<c:set var="count" value="${beanDao.loginCheck(customer)}"/>
		<c:if test="${count==1}">
		<c:set var="customer" value="${customer}" scope="session" />
			<jsp:forward page="AddRoom.jsp"/>
		</c:if>
		<c:if test="${count==0}">
			<c:out value="Invalid Credentials..."/>
		</c:if>
	</c:if>
</body>
