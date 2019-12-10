package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet14")
public class Servlet14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String remoteAddr = request.getRemoteAddr();
        response.getWriter().append(remoteAddr);
        String header = request.getHeader("User-Agent");
        response.getWriter().append(header);
    }
}
