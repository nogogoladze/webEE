package user.model;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelController {

    private MysqlDataSource dtSrc;

    protected Statement statement;

    protected Connection connection;

    protected void databaseConnection() throws SQLException {
        if (dtSrc == null) {
            dtSrc = new MysqlDataSource();

            dtSrc.setUser("root");
            dtSrc.setPassword("2222");
            dtSrc.setServerName("localhost");
            dtSrc.setDatabaseName("user");
        }
    }

    protected void openConnection() {
        try {
            this.connection = dtSrc.getConnection();
            this.statement = connection.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    protected void closeConnection() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}