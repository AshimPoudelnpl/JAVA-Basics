package classes.javax;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServe extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html"); 
        PrintWriter pw = res.getWriter();
        pw.println("username"+username);
        pw.println("password"+password);
    }
}
