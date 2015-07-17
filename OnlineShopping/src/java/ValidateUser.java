import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String userName=request.getParameter("txtUserName");
            String password=request.getParameter("txtPass");
          
         if(VerifierClass.checkUser(userName, password))
        {
            RequestDispatcher rd= request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);  
            
        }
        else
        {
            
            out.println("<script>alert('Wrong password or username');</script>");
            RequestDispatcher rd=request.getRequestDispatcher("LogIn.jsp");
            rd.include(request, response);
        }
            
        } finally {
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
