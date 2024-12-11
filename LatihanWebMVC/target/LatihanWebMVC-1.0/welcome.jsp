<%-- 
    Document   : welcome
    Created on : 26 Nov 2024, 11.03.33
    Author     : helmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Selamat datang, ${user.fullName}! anda berhasil Login!</h2>  
    

    <form action="logout" method="get">
        <button type="submit">Logout</button>
    </form>
    
    <a href="userList">
        <button type="button">Go to User List     </button>
    </a>
    
</body>
</html>

