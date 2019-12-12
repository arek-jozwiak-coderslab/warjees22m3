package pl.coderslab.samplemvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/mvc16")
public class Mvc16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        HttpSession session = request.getSession();
        List<Book> books = (List<Book>) session.getAttribute("books");

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
               book.setAuthor(author);
               book.setTitle(title);
            }
        }
        response.sendRedirect(request.getContextPath() + "/mvc14");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        HttpSession session = request.getSession();
        List<Book> books = (List<Book>) session.getAttribute("books");

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                request.setAttribute("book", book);
            }
        }
        getServletContext().getRequestDispatcher("/jsp3-edit.jsp")
                .forward(request, response);
    }
}
