package pl.coderslab.samplemvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = new ArrayList<>();
        books.add(new Book("aaaaaa", "bbbb", "ccccc"));
        books.add(new Book("aaaaaa1", "bbbb1", "ccccc1"));
        books.add(new Book("aaaaaa2", "bbbb2", "ccccc2"));
        books.add(new Book("aaaaaa3", "bbbb3", "ccccc3"));

        request.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/result-list.jsp")
                .forward(request, response);
    }
}
