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
<form action="saveLead">
      <pre>
                    First Name<input type="text" name="firstName"/>
                    last Name<input type="text" name="lastName"/>
                    Email<input type="text" name="email"/>
                    Lead Source:
                    <select name="leadSource">
 				    <option value="online">Online</option>
   					<option value="socialMedia">Social Media</option>
 					<option value="radio">Radio</option>
 				    <option value="newsPaper">News Paper</option>
				    </select>
                    Mobile<input type="number" name="mobile"/>
                    
                    <input type="submit" value="save"/>
                
      </pre>
</form>
</body>
</html>