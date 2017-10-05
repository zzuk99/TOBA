/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class Login extends HttpServlet {

 /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");

        String pass = request.getParameter("pass");

       

        if(Validate.checkUser(uname, pass))

        {

            RequestDispatcher rs = request.getRequestDispatcher("Welcome");

            rs.forward(request, response);

        }

        else

        {

           out.println("Username or Password incorrect");

           RequestDispatcher rs = request.getRequestDispatcher("LoginFailure.html");

           rs.include(request, response);

        }

    }



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

public final class LoggingFilter implements Filter
{
private FilterConfig filterConfigObj = null;

@Override
public void init(FilterConfig filterConfigObj) {
this.filterConfigObj = filterConfigObj;
}

@Override
public void doFilter(ServletRequest request,
ServletResponse response,
FilterChain chain)
throws IOException, ServletException
{
String remoteAddress = request.getRemoteAddr();
String uri = ((HttpServletRequest) request).getRequestURI();
String protocol = request.getProtocol();

chain.doFilter(request, response);

}

        @Override
        public void destroy() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

