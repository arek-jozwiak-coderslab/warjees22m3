package pl.coderslab.samplemvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Book> books = (List<Book>)  session.getAttribute("books");

        request.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/result-list.jsp")
                .forward(request, response);
    }
}
