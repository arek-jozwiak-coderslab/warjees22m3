package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("product-id");
        Map<String, String[]> parameterMap =
                request.getParameterMap();
        response.getWriter().append("<h1>to ja Twój servlet hura hura</h1>");
        response.getWriter().append("<form method='post'>");
        response.getWriter().append("<input type ='text'>");
        response.getWriter().append("<input type ='submit'>");
        response.getWriter().append("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().append("WPADLEM DO POST");
    }
}
