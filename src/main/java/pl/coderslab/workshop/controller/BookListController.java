package pl.coderslab.workshop.controller;

import pl.coderslab.workshop.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book/list")
public class BookListController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        BookDao bookDao = new BookDao();
        request.setAttribute("books", bookDao.findAll());

        getServletContext().getRequestDispatcher("/books/list.jsp")
                .forward(request, response);

    }
}
