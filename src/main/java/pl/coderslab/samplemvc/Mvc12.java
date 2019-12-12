package pl.coderslab.samplemvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer start = Integer.parseInt(request.getParameter("start")) + 10;
        Integer end = Integer.parseInt(request.getParameter("end")) + 10;


        request.setAttribute("start", start);
        request.setAttribute("end", end);

        getServletContext().getRequestDispatcher("/jsp2.jsp")
                .forward(request, response);
    }
}
