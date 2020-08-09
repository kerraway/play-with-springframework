package com.github.kerraway.springframework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Hello world servlet
 *
 * @author kerraway
 * @date 2020/08/10
 */
@WebServlet("/hello-world")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "Simple spring framework";
        req.setAttribute("name", name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello-world.jsp").forward(req, resp);
    }

}
