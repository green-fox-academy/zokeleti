package com.greenfox.post_it;

/*Create a PostIt class that has
        a backgroundColor represented by a String
        a text on it
        a textColor represented by a String
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatePostItObjects {
    public static void main(String[] args) {
        PostIt orange = new PostIt("orange", "blue", "Idea 1");
        PostIt pink = new PostIt("pink", "black", "Awesome");
        PostIt yellow = new PostIt("yellow", "green", "Superb!");
        List<PostIt> postItList = new ArrayList<>(Arrays.asList(orange, pink, yellow));

        for (int i = 0; i < postItList.size(); i++){
            System.out.println("I have a postit that's " + postItList.get(i).backgroundColor + " and have a " + postItList.get(i).textColor + " text on it that says " + postItList.get(i).textOnIt);
        }
    }


}
