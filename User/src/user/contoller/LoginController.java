package user.contoller;

import user.UserModelServise;
import user.model.Model;
import user.utils.Login;
import user.utils.Method;
import user.utils.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginController extends MainController {
    @Override
    protected void request(HttpServletRequest req, HttpServletResponse resp, Method method) {

        if (method == Method.GET) {
            try {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/user/user.jsp");
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (method == Method.POST) {

            String mail = req.getParameter("mail");
            String password = req.getParameter("password");

            Login login = new Login();

            login.setEmail(mail);
            login.setPassword(password);

            System.out.println(login.getEmail());


            Model get = new UserModelServise(User.class);


            List<User> getUsers = get.getAll();


            for (int i = 0; i < getUsers.size(); i++) {

                if (getUsers.get(i).getMail().equals(login.getEmail()) && getUsers.get(i).getPssword().equals(login.getPassword())) {

                    try {
                        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/usersPage.jsp");
                        dispatcher.forward(req, resp);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(" login access ");

                } else  {
                    System.out.println(" not access ");
                }
            }
        }
    }
}

