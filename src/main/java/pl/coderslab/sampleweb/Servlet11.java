package pl.coderslab.sampleweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pl.coderslab.maven.MainLog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet11")
public class Servlet11 extends HttpServlet {
    private static final Logger log = LogManager.getLogger(Servlet11.class);

    private void doSth() {
        log.info("doing sht");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello First Servlet");
        log.debug("debug log");
        response.getWriter().append("Content11");

    }
}
