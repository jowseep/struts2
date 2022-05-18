package com.activity2.example;

public class newLogin{
    
    //newUsername and newPassword are values passed from newLogin.jsp
    private String newUsername;
    private String newPassword;
    //this is a flag which will help me find the matching account
    boolean isFound = false;
    //initializing an object which we will use to store the matching account
    private Accounts accountFound;

    public String execute() {

        //initializing array of objects called newAccount
        Accounts newAccount[] = new Accounts[5];

        //created objects using Accounts.java
        // newAccount[0] = new Accounts("joseph","joseph03","Joseph","Callao","May 03, 1998","Another day, another slay. Periodt.","admin");
        // newAccount[1] = new Accounts("kim","kim30","Kimberly","Osico","July 31, 1996","You only live once, hoe.","regular");
        // newAccount[2] = new Accounts("ishi","ishi02","Irish Clarence","Bernales","February 16, 1989","One step at a time, bitch.","regular");
        // newAccount[3] = new Accounts("jazzle","jazzle09","Jazzle Fe","Demapitan","September 24, 1997","Travel is life.","regular");
        // newAccount[4] = new Accounts("ketty","ketty01","Kieth","Albarando","January 25, 1998","Tiny <3","regular");
        
        //this loop is for me to find if an account exists
        for(int i=0;i<newAccount.length;i++) {
            //if this statement is true, newAccount[i] will be stored to accountFound and the isFound is true;
            if(newUsername.equals(newAccount[i].getUsername()) && newPassword.equals(newAccount[i].getPassword())) {
                setAccountFound(newAccount[i]);
                isFound = true;
            }
        }

        //if it's true, then it will return success or profile page, if it's still false, it will go to fail page i created
        if(isFound==true) {
            return "success";
        } else {
            return "fail";
        }

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

    // public String[] getTheUsername() {
    //     return theUsername;
    // }

    // public void setTheUsername(String[] theUsername) {
    //     this.theUsername = theUsername;
    // }

    // public String[] getThePassword() {
    //     return thePassword;
    // }

    // public void setThePassword(String[] thePassword) {
    //     this.thePassword = thePassword;
    // }

    public Accounts getAccountFound() {
        return accountFound;
    }

    public void setAccountFound(Accounts accountFound) {
        this.accountFound = accountFound;
    }
    
}
