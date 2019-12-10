package pl.coderslab.sampleweb;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@WebServlet("/servlet13")
public class Servlet13 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String car = request.getParameter("car");


        response.getWriter().append("<h1>Selected car</h1> : " + StringUtils.reverse(car));
        response.getWriter().append("<br/>");
        response.getWriter().append(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        response.getWriter().append("<br/>");

        String[] drivers = request.getParameterValues("driver");
        response.getWriter().append(Arrays.toString(drivers));

    }
}
