package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer a = Integer.parseInt(request.getParameter("a"));
        Integer b = Integer.parseInt(request.getParameter("b"));
        Integer c = Integer.parseInt(request.getParameter("c"));

        double delta = -b * b * 4 * a * c;
        if (delta < 0) {
            response.getWriter().append("Nie ma miesc zerowych ");
        }
        if (delta == 0) {
            response.getWriter().append("jedno = " + (-b / (2 * a)));
        }
        if (delta > 0) {
            response.getWriter().append("dwa ");
            double x1 = -b - Math.sqrt(delta) / (2 * a);
            double x2 = -b + Math.sqrt(delta) / (2 * a);
            response.getWriter().append(x1 + " ");
            response.getWriter().append(x2 + " ");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
