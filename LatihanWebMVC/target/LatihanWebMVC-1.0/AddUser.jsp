<%-- 
    Document   : AddUser
    Created on : Dec 10, 2024, 8:42:39 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New User</title>
</head>
<body>
    <h2>Add New User</h2>

    <form action="addUser" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" name="password" required><br><br>

        <label for="fullName">Full Name:</label>
        <input type="text" name="fullName" required><br><br>

        <button type="submit">Add User</button>
    </form>
</body>
</html>

