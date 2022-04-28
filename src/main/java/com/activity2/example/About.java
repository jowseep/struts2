package com.activity2.example;

public class About extends ExampleSupport{
    
    public String execute() {
        
        return SUCCESS;
    }

    public String firstMessage = "My name is Joseph and I really do love to travel and explore places that I've never been to.";

    private String webDescription;

    public String getWebDescription() {
        return webDescription;
    }

    public void setWebDescription(String webDescription) {
        this.webDescription = webDescription;
    }

    
}
