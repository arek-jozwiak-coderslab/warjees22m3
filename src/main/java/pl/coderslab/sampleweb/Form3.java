package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getForm3")
public class Form3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Integer page = Integer.parseInt(request.getParameter("page"));

        for (int i = 1; i < page; i++) {
            if (page % i == 0) {
                response.getWriter()
                        .append(i + " ");
            }
        }
    }


}
