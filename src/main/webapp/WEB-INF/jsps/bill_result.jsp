<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                          Id : ${bill.id}<br/>
                          First Name : ${bill.firstName}<br/>
                          Last Name : ${bill.lastName}<br/>
                          Email : ${bill.email}<br/>
                          Mobile : ${bill.mobile}<br/>
                          Product Name : $(bill.productName)<br/>
                          Amount Paid : $(bill.amount)<br/>
                          
               <form action="downloadBill" method="post">
                   <input type="hidden" name="id" value=" ${bill.id}"/>
                   <input type="submit" value="Download"/>
             </form>
</body>
</html>