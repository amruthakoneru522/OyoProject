<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
        Cookie ckGourav, ckHarshit, ckJavad;

         ckGourav=new Cookie("Gourav","88");
         ckGourav.setMaxAge(1000*24*60*60);
         response.addCookie(ckGourav);
         ckHarshit=new Cookie("Harshit","99");
         ckHarshit.setMaxAge(1000*24*60*60);
         response.addCookie(ckHarshit);
         ckJavad=new Cookie("Javad","77");
         ckJavad.setMaxAge(1000*24*60*60);
         response.addCookie(ckJavad);
         
%>

</body>
</html>