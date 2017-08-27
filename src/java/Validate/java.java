/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate;
import java.sql.*;

public class Validate

{

     public static boolean checkUser(String uname,String pass)

     {

      boolean st =false;

      if(uname.compareTo(“ jsmith@toba.com”)==0 and pass.compareTo(“letmein”)==0)

          st=true;

         return st;                

}  

}

Welcome.java

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.sql.*;

public class Welcome extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("Welcome user");

      }

}