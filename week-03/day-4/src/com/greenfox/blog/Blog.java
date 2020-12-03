package com.greenfox.blog;

/*
Reuse your BlogPost class
Create a Blog class which can
        store a list of BlogPosts
        add BlogPosts to the list
        delete(int) one item at given index
        update(int, BlogPost) one item at the given index and update it with another BlogPost
*/

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPosts = new ArrayList<>();

    public void addBlogPost(BlogPost blogPost){
        this.blogPosts.add(blogPost);
    }

    public void delete(int index){
        blogPosts.remove(index);
    }

    public void update(int index, BlogPost blogPost){
        blogPosts.set(index, blogPost);
    }
}
