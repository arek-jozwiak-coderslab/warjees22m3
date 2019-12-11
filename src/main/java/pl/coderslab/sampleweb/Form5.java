package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String convertionType = request.getParameter("convertionType");


        Double aDouble = Double.parseDouble(request.getParameter("degrees"));

        if (convertionType.equals("celcToFahr")) {
            response.getWriter().append("caltToFahr" + 32 + (9 / 5) * aDouble);


        }
        if (convertionType.equals("FahrToCelc")) {
            response.getWriter().append("FahrToCelc" + ((5 / 9) * (aDouble - 32)));
        }
    }

}
