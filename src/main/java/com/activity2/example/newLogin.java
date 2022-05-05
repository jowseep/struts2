package com.activity2.example;

public class newLogin{
    
    private String newUsername;
    private String newPassword;
    private String[] theUsername = {"joseph","kim","ishi","jazzle","ketty"};
    private String[] thePassword = {"joseph03","kim30","ishi02","jazzle09","ketty01"};
    boolean isFound = false;
    // private String profilefirstName = "";
    // private String profilelastName = "";
    // private String profilebDay = "";
    // private String profileBio = "";
    private Accounts accountFound;

    public String execute() {

        Accounts newAccount[] = new Accounts[theUsername.length];

        //kay sir kay like acc1, acc2, acc3 then setkeme(acc1)

        newAccount[0] = new Accounts("joseph","joseph03","Joseph","Callao","May 03, 1998","Another day, another slay. Periodt.");
        newAccount[1] = new Accounts("kim","kim30","Kimberly","Osico","July 31, 1996","You only live once, hoe.");
        newAccount[2] = new Accounts("ishi","ishi02","Irish Clarence","Bernales","February 16, 1989","One step at a time, bitch.");
        newAccount[3] = new Accounts("jazzle","jazzle09","Jazzle Fe","Demapitan","September 24, 1997","Travel is life.");
        newAccount[4] = new Accounts("ketty","ketty01","Kieth","Albarando","January 25, 1998","Tiny <3");
        
        for(int i=0;i<theUsername.length;i++) {
            if(newUsername.equals(theUsername[i]) && newPassword.equals(thePassword[i])) {
                setAccountFound(newAccount[i]);
                isFound = true;
            }
        }

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

    // public String getProfilefirstName() {
    //     return profilefirstName;
    // }

    // public void setProfilefirstName(String profilefirstName) {
    //     this.profilefirstName = profilefirstName;
    // }

    // public String getProfilelastName() {
    //     return profilelastName;
    // }

    // public void setProfilelastName(String profilelastName) {
    //     this.profilelastName = profilelastName;
    // }

    // public String getProfilebDay() {
    //     return profilebDay;
    // }

    // public void setProfilebDay(String profilebDay) {
    //     this.profilebDay = profilebDay;
    // }

    // public String getProfileBio() {
    //     return profileBio;
    // }

    // public void setProfileBio(String profileBio) {
    //     this.profileBio = profileBio;
    // }

    public Accounts getAccountFound() {
        return accountFound;
    }

    public void setAccountFound(Accounts accountFound) {
        this.accountFound = accountFound;
    }
    
}
