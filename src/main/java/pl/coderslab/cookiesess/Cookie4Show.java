package pl.coderslab.cookiesess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");


        for (Cookie cookie : cookies) {
            response.getWriter().append(cookie.getName());
            response.getWriter().append(" : ");
            response.getWriter().append(cookie.getValue());
            response.getWriter().append("<a href='/removeCookie?key=" + cookie.getName() + "'>delete</a>");
            response.getWriter().append(" <br/>");
        }
    }
}
