package pl.coderslab.cookiesess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewSample")
public class ViewSample extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Integer jajo = Integer.parseInt(request.getParameter("jajo"));

        Integer jajoPower = jajo * jajo * jajo;

        request.setAttribute("jajoPower", jajoPower);

        getServletContext().getRequestDispatcher("/first.jsp")
                .forward(request, response);
    }
}
