package pl.coderslab.sampleweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/get2")
public class Get2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        PrintWriter writer = response.getWriter();
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {

            writer.append(string + ": ");
            writer.append(Arrays.toString(parameterMap.get(string)));
        }
    }
}
