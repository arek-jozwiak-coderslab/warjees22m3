package pl.coderslab.sampleweb;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/post2")
public class Form2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String confirm = request.getParameter("confirm");
        String message = request.getParameter("message");
        List<String> badWords = Lists.newArrayList("dupa", "dupa2");
        StringBuilder stringBuilder = new StringBuilder();

        if (confirm != null) {
            response.getWriter().append(message);
        } else {
            //censured
            String[] split = message.split(" ");
            for (String s : split) {
                if (badWords.contains(s)) {
                    stringBuilder.append(Strings.repeat("*", s.length())).append(" ");
                } else {
                    stringBuilder.append(s + " ");
                }
            }
            response.getWriter().append(stringBuilder.toString());
        }

    }


}
