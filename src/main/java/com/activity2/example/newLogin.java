package com.activity2.example;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;

public class newLogin extends ActionSupport{
    
    private Accounts account;
    private String error = "Random";
    private String username, password;

    public String execute() throws Exception{

        account = getAccount();
        if(lookToDB()) {
            return "success";
        } else {
            return "fail";
        }
    }

    public boolean lookToDB() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "password");
            
            if (connection != null) {
                String sql = "SELECT * FROM userinfo WHERE username='"+account.getUsername()+"' AND password='"+account.getPassword()+"'";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                if(rs.next()){  
                    Accounts accounts=new Accounts();
                    accounts.setFirstName(rs.getString(2));   
                    accounts.setLastName(rs.getString(3));
                    accounts.setUsername(rs.getString(7));
                    accounts.setBirthDate(rs.getString(4));   
                    accounts.setEmail(rs.getString(5)); 
                }
                return true;
            } else {
                error = "DB connection failed";
                return false;
            }
         } catch (Exception e) {
             error = e.toString();
             return false;  
         } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
