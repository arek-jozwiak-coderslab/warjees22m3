package pl.coderslab.cookiesess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean cookieExist = false;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("User")) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                cookieExist = true;
            }
        }

        if (!cookieExist) {
            response.getWriter().append("BRAK");
        }
    }
}
