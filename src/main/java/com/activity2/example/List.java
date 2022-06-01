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
    ArrayList<String> firstNames = new ArrayList<String>();
    public String nameInput;
    Accounts accountFound;

    public ArrayList<Accounts> getAccount() {  
        return account; 
    }

    public void setList(ArrayList<Accounts> account) {  
        this.account = account;  
    }
    
    public ArrayList<String> getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(ArrayList<String> firstNames) {
        this.firstNames = firstNames;
    }

    public String getNameInput() {
        return nameInput;
    }

    public void setNameInput(String nameInput) {
        this.nameInput = nameInput;
    }

    public Accounts getAccountFound() {
        return accountFound;
    }

    public void setAccountFound(Accounts accountFound) {
        this.accountFound = accountFound;
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
                    firstNames.add(accounts.getFirstName());
                }

            }
        } catch (Exception e) {
         } finally {
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
         }

        return SUCCESS;

    }
    
    public String userAccount() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "password");

            if (connection != null) {
                String sql = "SELECT * FROM userinfo WHERE firstname='"+nameInput+"'";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet rs= preparedStatement.executeQuery();

                while(rs.next()){ 
                    Accounts newaccounts = new Accounts(); 
                    newaccounts.setLastName(rs.getString(3));
                    newaccounts.setUsername(rs.getString(7));
                    newaccounts.setBirthDate(rs.getString(4));   
                    newaccounts.setEmail(rs.getString(5)); 
                    newaccounts.setFirstName(rs.getString(2));
                    setAccountFound(newaccounts);
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
