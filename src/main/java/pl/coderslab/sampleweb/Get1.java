package pl.coderslab.sampleweb;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//http://localhost:8080/get1?start=1&end=132

        String startParam = request.getParameter("start");
        String endParam = request.getParameter("end");

        if (StringUtils.isNumeric(startParam) && StringUtils.isNumeric(endParam)) {
            int start = Integer.parseInt(request.getParameter("start"));
            int end = Integer.parseInt(request.getParameter("end"));
            for (int i = start; i < end; i++) {
                response.getWriter().append("i: " + i);
                response.getWriter().append("<br/>");
            }
        } else {
            response.getWriter().append("BRAK");
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }
}
