package pl.coderslab.workshop;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class FilterSecond implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest httpRequest = (HttpServletRequest) req;
        String header = ((HttpServletRequest) req).getHeader("User-Agent");
        System.out.println(header);

        long startTime = System.currentTimeMillis();

        chain.doFilter(req, resp);

        long stopTime = System.currentTimeMillis();


        System.out.println(startTime-stopTime);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
