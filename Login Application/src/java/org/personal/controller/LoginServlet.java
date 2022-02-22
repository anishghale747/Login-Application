package org.personal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.personal.bean.User;
import org.personal.dao.UserDao;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            User user = new User();
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user = UserDao.login(user);

            if (user.isValid()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", user);
                response.sendRedirect("LoggedIn.jsp"); //logged-in page    
            } else {
                response.sendRedirect("invalidLogin.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
