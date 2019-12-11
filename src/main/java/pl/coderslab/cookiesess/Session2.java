package pl.coderslab.cookiesess;

import com.google.common.collect.Lists;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int grade = Integer.parseInt(request.getParameter("grade"));
        List<Integer> grades = null;
        if (session.getAttribute("grades") == null) {
            grades = Lists.newArrayList(grade);
        } else {
            grades = (List<Integer>) session.getAttribute("grades");
            grades.add(grade);
        }
        session.setAttribute("grades", grades);
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Integer> grades = (List<Integer>) session.getAttribute("grades");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("<form method='post'>" +
                "    <input name='grade' type='text'/>" +
                "    <input type='submit'/>" +
                "</form>");

        if (grades.size() > 0) {
            response.getWriter().append(grades.toString());
            response.getWriter().append("avg = " + this.avg(grades));
        }
    }

    private double avg(List<Integer> grades) {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
