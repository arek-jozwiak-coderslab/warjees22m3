package pl.coderslab.samplemvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet("/mvc15")
public class Mvc15 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        HttpSession session = request.getSession();
        List<Book> books = (List<Book>) session.getAttribute("books");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getIsbn().equals(isbn)) {
                iterator.remove();
            }
        }
        session.setAttribute("books", books);

        response.sendRedirect(request.getContextPath() + "/mvc14");
    }
}
