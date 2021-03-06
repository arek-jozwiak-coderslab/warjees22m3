package pl.coderslab.cookiesess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/setCookie")
public class Cookie1Set extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("User", "CodersLab");
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
        Cookie cookieFoo = new Cookie("foo", "bar");
        cookieFoo.setMaxAge(60 * 60 * 24);
        response.addCookie(cookieFoo);
    }
}
