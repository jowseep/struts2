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
        
        return SUCCESS;
    }


    private String blogDescription = "The generated song is ";

    private String selectSongs() {
        double num = ((Math.random() * 5 - 1 + 1) + 1);
        String song = songs[(int) num];

        return this.blogDescription + song;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

}
