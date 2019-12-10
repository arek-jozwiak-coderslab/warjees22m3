package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get3")
public class Get3 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String widthString = request.getParameter("width");
        String heightString = request.getParameter("height");
        int width = 5;
        int height = 10;
        if (widthString != null && heightString != null) {
            width = Integer.parseInt(request.getParameter("width"));
            height = Integer.parseInt(request.getParameter("height"));
        }
        PrintWriter writer = response.getWriter();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                writer.append(i + " x " + j);
                writer.append(" = " +i * j +" ");
            }
            writer.append("<br/>");

        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }
}
