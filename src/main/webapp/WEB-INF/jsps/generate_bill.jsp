<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lrad</title>
</head>
<body>
<h3>Create | Lead</h3>
<form action="generateBill" method="post">
      <pre>
                    First Name<input type="text" name="firstName" value="${contacts.firstName }"/>
                    last Name<input type="text" name="lastName" value="${contacts.lastName }"/>
                    Email<input type="text" name="email" value="${contacts.email }"/>
                    Mobile<input type="number" name="mobile" value="${contacts.mobile }"/>
                    Product Name<input type="text" name="productName"/>
                    Amount Paid<input type="number" name="amount"/>
                    
                    <input type="submit" value="Generate Bill"/>
                
      </pre>
</form>
</body>
</html>