package pl.coderslab.cookiesess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {

    private final static String COOKIE_NAME = "cookie51";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookie51 = CookieUtils.getCookie(COOKIE_NAME, request);
        if (cookie51 == null) {
            response.getWriter().append("Brak ciastka");
            String message = "Nie odwiedziles jeszcze tej strony";
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        } else {
            response.getWriter().append("JEST COOKIE");
            CookieUtils.removeCookie(COOKIE_NAME, response);
        }
    }


}
