package com.greenfox.post_it;

/*Create a PostIt class that has
        a backgroundColor represented by a String
        a text on it
        a textColor represented by a String
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/

public class PostIt {
    String backgroundColor;
    String textOnIt;
    String textColor;
    public PostIt(String backgroundColor, String textColor, String textOnIt){
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.textOnIt = textOnIt;
    }
}
