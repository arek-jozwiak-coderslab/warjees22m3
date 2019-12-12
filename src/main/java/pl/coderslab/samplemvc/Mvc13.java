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

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        Book book = new Book(title, author, isbn);

        HttpSession session = request.getSession();
        List<Book> books;
        if (session.getAttribute("books") != null) {
            books = (List<Book>) session.getAttribute("books");
        } else {
            books = new ArrayList<>();
        }
        books.add(book);
        session.setAttribute("books", books);
        response.sendRedirect(request.getContextPath() + "/mvc14");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/jsp3.jsp")
                .forward(request, response);
    }
}
