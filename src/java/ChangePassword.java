/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    import java.io.IOException;

    import javax.servlet.*;

    import javax.servlet.ServletException;

    import javax.servlet.http.HttpServlet;

    import javax.servlet.http.HttpServletRequest;

    import javax.servlet.http.HttpServletResponse;

    import javax.sql.DataSource;

    import java.sql.Connection;

    import java.sql.ResultSet;

    import java.sql.PreparedStatement;
import java.sql.SQLException;

    import javax.naming.*;

    public class ChangePassword extends HttpServlet {

private static final long serialVersionUID = 1L;

public ChangePassword() {

    super();

}

@Override
protected void doGet(HttpServletRequest request,

        HttpServletResponse response) throws ServletException, IOException {

    String Email = request.getParameter("Email");

    String Password = request.getParameter("Password");

    String CPassword = request.getParameter("Password");

    Connection con =   GetConnectToDb();

    boolean flag = CheckLogin(Password,CPassword,Email,con);

    if(flag==true){

        gotoPage("/LoginPage.jsp",request,response);

    }

    else{

        gotoPage("/ChangeError.jsp",request,response);

    }

}

public void gotoPage(String address, HttpServletRequest request,

        HttpServletResponse response) throws ServletException, IOException {

  RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);

    dispatcher.forward(request, response);

}

public boolean CheckLogin(String Password, String CPassword,String Email, Connection con) {

    if (Password != null && CPassword != null && Email !=null) {

        try {

            PreparedStatement ps = con.prepareStatement("UPDATE PUBLIC.IAUSERS SET Password = ('"+Password+"') WHERE Email='"+Email+"'");

            ResultSet rs = ps.executeQuery();

        while(rs.next()) {

                return true;

            }

        } catch (SQLException e) {

        }

    }

    return false;

}

public Connection GetConnectToDb() {

    try {

        InitialContext ctx = new InitialContext();

        Connection con = null;

        DataSource ds = (DataSource) ctx.lookup("java:/DefaultDS");

        con = ds.getConnection();

        return con;

    } catch (SQLException | NamingException e) {

        return null;

    }

}

@Override
protected void doPost(HttpServletRequest request,

        HttpServletResponse response) throws ServletException, IOException {

    }}
/**
 *
 * @author Whisper119
 */
@WebServlet(urlPatterns = {"/ChangePassword"})
public class ChangePassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ChangePassword</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangePassword at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

}
