package by.karpovich.jspexample.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var login = req.getParameter("login");
        var password = req.getParameter("password");
        var currentLogin = "qwer";
        var currentPassword = "asdf";
        if (login.equals(currentLogin) && password.equals(currentPassword)){
            req.getSession().setAttribute("name", req.getParameter("login"));
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }

//        req.getSession().setAttribute("name", req.getParameter("login"));
//        req.getRequestDispatcher("success.jsp").forward(req, resp);
    }
}
