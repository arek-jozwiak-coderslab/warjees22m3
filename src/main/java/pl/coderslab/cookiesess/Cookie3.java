package pl.coderslab.cookiesess;

import com.google.common.base.CharMatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        Integer time = Integer.parseInt(request.getParameter("time"));
        Cookie cookie = new Cookie(
                CharMatcher.whitespace().removeFrom(key),
                CharMatcher.whitespace().removeFrom(value)

        );
        cookie.setMaxAge(60 * 60 * time);
        response.addCookie(cookie);
    }


}
