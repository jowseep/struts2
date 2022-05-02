package com.activity2.example;

public class About extends ExampleSupport{

    private String[] songs = {
        "Enchanted by Taylor Swift",
        "Kyoto by Phoebe Bridgers",
        "Perfect Places by Lorde",
        "Norman F******g Rockwell by Lana Del Rey",
        "Angels Like You by Miley Cyrus"
    };
    
    public String execute() {

        setBlogDescription(selectSongs());

        //setBlogDescription(selectSongs());

        /*if(setBlogDescription(selectSongs()) == "1") {
            return songs[0];
        } else if(selectSongs() == "2") {
            return songs[1];
        } else if(selectSongs() == "3") {
            return songs[2];
        } else if(selectSongs() == "4" ) {
            return songs[3];
        } else if(selectSongs() == "5") {
            return songs[4];
        }*/
        
        return SUCCESS;
    }


    private String blogDescription = "The generated song is ";

    private String selectSongs() {
        double num;
        num = ((Math.random() * 4 - 1 + 1) + 1);
        String generatedNum = String.valueOf((int)(num));

        if(generatedNum.equals("1")) {
            return getBlogDescription() + songs[0];
        } else if(generatedNum.equals("2")) {
            return getBlogDescription() + songs[1];
        } else if(generatedNum.equals("3")) {
            return getBlogDescription() + songs[2];
        } else if(generatedNum.equals("4")) {
            return getBlogDescription() + songs[3];
        } else if(generatedNum.equals("5")) {
            return getBlogDescription() + songs[4];
        }

        return blogDescription;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

}
