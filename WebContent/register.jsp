<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
</head>
<body>
<form action="registerServlet" method="post">
   <% 
   String firstname=request.getParameter("firstname");
   String lastname=request.getParameter("lastname");
   String email=request.getParameter("email");
   if (firstname==null){
       out.println("<h2>Please enter message</h2>");
       out.println("firstname:<input type=\"text\" value=\"\" placeholder=\"please enter firstname\" name='firstname'><br>");
       out.println("lastname:<input type=\"text\" value=\"\" placeholder=\"please enter lastname\" name='lastname'><br>");
       out.println("email:<input type=\"email\" value=\"\" placeholder=\"please enter email\" name='email'>");
   }
   else {
       String message=request.getAttribute("message")==null?"Please enter message":(String)request.getAttribute("message");
       String label1=firstname==""?"you must enter firstname:":"firstname:";
       String label2=lastname==""?"you must enter lastname:":"lastname:";
       String label3=email==""?"you must enter email:":"email";
       out.println("<h2>"+message+"</h2>");
       out.println(label1+"<input type=\"text\" value='"+firstname+"' placeholder=\"please enter firstname\" name='firstname'><br>");
       out.println(label2+"<input type=\"text\" value='"+lastname+"' placeholder=\"please enter lastname\" name='lastname'><br>");
       out.println(label3+"<input type=\"email\" value='"+email+"' placeholder=\"please enter email\" name='email'>");
   }
   
   
   %><br>
   <input type="submit" value="register">
   
</form>
</body>
</html>