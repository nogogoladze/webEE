package user.contoller;

import user.utils.User;
import user.UserModelServise;
import user.model.Model;
import user.utils.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends MainController {
    @Override
    protected void request(HttpServletRequest req, HttpServletResponse resp, Method method) {

        Model model =  new UserModelServise(User.class);

        if (method == Method.POST){

            System.out.println("do Post");
            String firstName = req.getParameter("firstName");
            String mail = req.getParameter("mail");
            String password = req.getParameter("password");


            User setUsr = new User();

            setUsr.setFirstName(firstName);
            setUsr.setMail(mail);
            setUsr.setPssword(password);

            model.save(setUsr);
            try {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
                dispatcher.forward(req,resp);
            } catch (ServletException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (method == Method.GET){

            String action = req.getParameter("action");

            if (action.equals("home")){
                try {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
                    dispatcher.forward(req, resp);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ServletException e) {
                    e.printStackTrace();
                }
            }

            if (action.equals("choose")){

                try {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/choose/choose.jsp");
                    dispatcher.forward(req,resp);
                }catch (IOException e){
                    e.printStackTrace();
                } catch (ServletException e) {
                    e.printStackTrace();
                }
            }

             if (action.equals("signup")){
                try {
                    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/user/addUser.jsp");
                    dispatcher.forward(req,resp);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
