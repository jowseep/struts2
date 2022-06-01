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
    private String firstName, lastName, username, password, birthDate, email; 

    public Register() {
        
    }

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
                String sql = "INSERT INTO userinfo(firstname, lastname, birthdate, email, username, password) VALUES('"+account.getFirstName()+"','"+account.getLastName()+"','"+account.getBirthDate()+"','"+account.getEmail()+"','"+account.getUsername()+"','"+account.getPassword()+"')";
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

    // public void validate(){
    //     if (account.getFirstName().length() == 0) {
    //         addFieldError("account.firstName", "First name is required, hoe.");
    //     }
        
    //     if (account.getLastName().length() == 0) {
    //         addFieldError("account.firstName", "Last name is required, hoe.");
    //     }

    //     if (account.getEmail().length() == 0) {
    //         addFieldError("account.email", "Email is required, hoe.");
    //     }
    
    //     if (account.getUsername().length() == 0) {
    //         addFieldError("account.username", "Username is required, hoe.");
    //     }

    //     if (account.getPassword().length() == 0) {
    //         addFieldError("account.password", "Password is required, hoe.");
    //     }

    //     if (account.getBirthDate().length() == 0) {
    //         addFieldError("account.username", "Birthdate is required, hoe.");
    //     }
    // }

    public String getError() {
        return error;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
