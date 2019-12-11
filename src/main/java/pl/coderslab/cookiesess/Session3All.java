package pl.coderslab.cookiesess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAllSessions")
public class Session3All extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<String>  strings = (List<String>) session.getAttribute("keys");


        for (String string : strings) {
            response.getWriter().append(string + " : " );
            response.getWriter()
                    .append(session.getAttribute(string).toString()
                    );
        }
    }
}
