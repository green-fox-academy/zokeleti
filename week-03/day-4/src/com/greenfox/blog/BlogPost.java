package com.greenfox.blog;

/*
Reuse your BlogPost class
Create a Blog class which can
store a list of BlogPosts
add BlogPosts to the list
delete(int) one item at given index
update(int, BlogPost) one item at the given index and update it with another BlogPost
*/

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;
    public BlogPost(String title, String authorName, String publicationDate, String text){
        this.title = title;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.text = text;
    }
}
