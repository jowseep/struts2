package com.activity2.example;

public class newLogin{
    
    String newUsername;
    String newPassword;
    String[] theUsername = {"joseph","kim","ishi","jazzle","ketty"};
    String[] thePassword = {"joseph03","kim30","ishi02","jazzle09","ketty01"};
    boolean isFound = false;

    public String execute() {

        /*for(int i=0;i<5;i++) {
            if(newUsername.equals(theUsername[i])) {
                if(newPassword.equals(theUsername[i])) {
                    isFound = true;
                }
            }
        }*/

        for(int i=0;i<theUsername.length;i++) {
            if(newUsername.equals(theUsername[i]) && newPassword.equals(thePassword[i])) {
                isFound = true;
            }
        }

        if(isFound==true) {
            return "success";
        } else {
            return "fail";
        }

        /*if(newUsername.equals(theUsername[0]) && newPassword.equals(thePassword[0])) {
            return "success";
        } else if(newUsername.equals(theUsername[1]) && newPassword.equals(thePassword[1])) {
            return "success";
        } else if(newUsername.equals(theUsername[2]) && newPassword.equals(thePassword[2])) {
            return "success";
        } else if(newUsername.equals(theUsername[3]) && newPassword.equals(thePassword[3])) {
            return "success";
        } else if(newUsername.equals(theUsername[4]) && newPassword.equals(thePassword[4])) {
            return "success";
        }*/

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

    public String[] getTheUsername() {
        return theUsername;
    }

    public void setTheUsername(String[] theUsername) {
        this.theUsername = theUsername;
    }

    public String[] getThePassword() {
        return thePassword;
    }

    public void setThePassword(String[] thePassword) {
        this.thePassword = thePassword;
    }

}
