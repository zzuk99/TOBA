/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewCustomer;

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.sql.*;

public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String fname = request.getParameter("fname");

        String lname = request.getParameter("lname");

        String phone = request.getParameter("phone");

        String address = request.getParameter("address");

        String city = request.getParameter("city");

        String state = request.getParameter("state");

        String zipcode = request.getParameter("zipcode");

        String email = request.getParameter("email");

        Class.forName("apache_derby_net");

                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","");

                    Statement stmt=con.createStatement();

             String query= "insert into register values('"+fname+"','"+lname+"','"+phone+"','"+address+"','"+city+"','"+state+"','"+zipcode+"','"+email+"')";

               stmt.executeUpdate(query);

                }

        catch(Exception e)

        {

            System.out.println(e.getMessage());

        }

           out.println("New user Added");

           RequestDispatcher rs = request.getRequestDispatcher("Success.html");

           rs.include(request, response);

        }

    }

}