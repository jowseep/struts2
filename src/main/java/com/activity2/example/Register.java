package com.activity2.example;
import com.opensymphony.xwork2.ActionSupport;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Register extends ActionSupport{
    
    private static final long serialVersionUID = 1L;
    
    private Accounts account;
    private String error = "Random";


    public String execute() throws Exception {
        account = getAccount();
        if(saveToDB()) {
            return "success";
        } else {
            return "fail";
        }
    }

    public boolean saveToDB() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "password");
            // ;INSERT INTO userinfo(firstname, lastname, birthdate, email) VALUES('"+account.getFirstName()+"','"+account.getLastName()+"','"+account.getBirthDate()+"','"+account.getEmail()+"')
            if (connection != null) {
                statement = connection.createStatement();
                String sql = "INSERT INTO user(username, password) VALUES('"+account.getUsername()+"','"+account.getPassword()+"')";
                statement.executeUpdate(sql);
                return true;
            } else {
                error = "DB connection failed";
                return false;
            }
         } catch (Exception e) {
             error = e.toString();
             return false;  
         } finally {
            if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }
    }

    public String getError() {
        return error;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

}
