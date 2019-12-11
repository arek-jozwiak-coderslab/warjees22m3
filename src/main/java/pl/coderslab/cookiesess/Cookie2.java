package pl.coderslab.cookiesess;

import com.google.common.base.CharMatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addToCookies")
public class Cookie2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");
        Cookie cookie = new Cookie(
                CharMatcher.whitespace().removeFrom(key),
                CharMatcher.whitespace().removeFrom(value)

        );
        response.addCookie(cookie);
    }

}
