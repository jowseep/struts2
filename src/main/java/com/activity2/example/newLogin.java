package com.activity2.example;

public class newLogin{
    
    String newUsername;
    String newPassword;

    public String execute() {

        if(newUsername.equals("joseph") && newPassword.equals("joseph03")) {
            return "success";
        } else if(newUsername.equals("kim") && newPassword.equals("kim30")) {
            return "success";
        } else if(newUsername.equals("ishi") && newPassword.equals("ishi02")) {
            return "success";
        } else if(newUsername.equals("jazzle") && newPassword.equals("jazzle09")) {
            return "success";
        } else if(newUsername.equals("ketty") && newPassword.equals("ketty01")) {
            return "success";
        }
        return "fail";
    }

    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

}
