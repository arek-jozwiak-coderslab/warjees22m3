package pl.coderslab.samplemvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //http://localhost:8080/mvc11?role=asd
        String role = request.getParameter("role");
        String join = String.join("_", "role", role).toUpperCase();
        request.setAttribute("userRole", join);
        getServletContext().getRequestDispatcher("/jsp1.jsp")
                .forward(request, response);
    }
}
