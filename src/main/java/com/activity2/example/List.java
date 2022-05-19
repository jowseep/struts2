package com.activity2.example;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Connection;                
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class List extends ActionSupport {
    
    ArrayList<Accounts> account = new ArrayList<Accounts>();

    public ArrayList<Accounts> getAccount() {  
        return account; 
    }

    public void setList(ArrayList<Accounts> account) {  
        this.account = account;  
    }
    
    public String execute() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "password");

            if (connection != null) {
                String sql = "SELECT * FROM userinfo";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){  
                    Accounts accounts=new Accounts();
                    accounts.setFirstName(rs.getString(2));   
                    accounts.setLastName(rs.getString(3));
                    accounts.setUsername(rs.getString(7));
                    accounts.setBirthDate(rs.getString(4));   
                    accounts.setEmail(rs.getString(5)); 
                    account.add(accounts);  
                }
            } 
        } catch (Exception e) {

         } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

         return SUCCESS;
    }
    
    
}
