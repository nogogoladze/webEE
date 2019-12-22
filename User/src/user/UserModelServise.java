package user;


import user.model.Model;
import user.model.ModelController;
import user.utils.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserModelServise extends ModelController implements Model {

    private Class<User> tableName;

    public UserModelServise (Class<User> tableName){
        this.tableName = tableName;
        try {
            databaseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void save(Object obj) {
       openConnection();


       User user = (User) obj;

        String save = "" +
                "INSERT INTO `" + tableName.getSimpleName() + "` (firstName, mail, password) " +
                "VALUES ('" + user.getFirstName() + "', '" + user.getMail() + "',  '"+user.getPssword()+"')";

        try {
            statement.executeUpdate(save);
            System.out.println("sucsess");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Object obj, int id) {

        User updateUser = (User) obj;

        StringBuilder updateUsers = new StringBuilder("UPDATE `" + tableName.getSimpleName() + "` SET ");
        updateUsers.append("firstName = '" + updateUser.getFirstName() + "',");
        updateUsers.append("mail = '" + updateUser.getMail() + "',");
        updateUsers.append("pssword = '" + updateUser.getPssword() + "',");

        openConnection();
        try {
            statement.executeUpdate(updateUsers.toString());
            System.out.println("Successfully updated table");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }


    @Override
    public List getAll() {

        String getStr = "SELECT * FROM `" + tableName.getSimpleName() + "`";

        List <User> users = new ArrayList<>();
        openConnection();
        try {
            ResultSet rs = statement.executeQuery(getStr);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setMail(rs.getString("mail"));
                user.setPssword(rs.getString("password"));

                users.add(user);

            }

            if (rs != null) rs.close();

            System.out.println("Successfully selected from database");
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return null;

    }

    @Override
    public Object getSingle(int id) {
        return null;
    }

}
