/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanwebmvc.Controller;

/**
 *
 * @author helmy
 */
import com.mycompany.latihanwebmvc.Model.User; 
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
   
            String username = request.getParameter("username");
            String password = request.getParameter("password");       
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);   
            if (user.isValidUser()) {               
                HttpSession session = request.getSession();
                session.setAttribute("user", user);  
                response.sendRedirect("welcome.jsp");
           } else {
               request.setAttribute("errorMessage", "username atau password anda salah!");
               request.getRequestDispatcher("/login.jsp").forward(request, response);
           }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Terjadi kesalahan saat mengakses database.");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } 
    }

}
