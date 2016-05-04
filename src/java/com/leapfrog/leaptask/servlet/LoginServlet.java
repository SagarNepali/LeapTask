/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.leaptask.servlet;

import com.leapfrog.leaptask.dao.UserDAO;
import com.leapfrog.leaptask.dao.impl.UserDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet (name = "login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{

    private UserDAO userDAO = new UserDAOImpl();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        
        
        
        
    }
 
    
    
    
}
    
    
