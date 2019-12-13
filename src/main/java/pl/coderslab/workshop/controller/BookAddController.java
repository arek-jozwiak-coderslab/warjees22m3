package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.Book;
import pl.coderslab.workshop.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book/add")
public class BookAddController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");


        Book book = new Book(title, author, isbn);

        if (!book.isValid()) {
            request.setAttribute("message", "Wypełnij poprawnie pola");
            request.setAttribute("book", book);
            doGet(request, response);
        } else {
            BookDao bookDao = new BookDao();
            bookDao.create(book);
            response.sendRedirect(request.getContextPath() + "/book/list");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/books/add.jsp")
                .forward(request, response);
    }
}
