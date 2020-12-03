package com.greenfox.blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<BlogPost> createBlogPosts() {
        BlogPost blogPost1 = new BlogPost("Lorem Ipsum", "John Doe", "2000.05.04.", " Lorem ipsum dolor sit amet.");
        BlogPost blogPost2 = new BlogPost("Wait but why", "Tim Urban", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");
        BlogPost blogPost3 = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump", "William Turton", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
        List<BlogPost> blogPosts = new ArrayList<>();
        blogPosts.addAll(Arrays.asList(blogPost1, blogPost2, blogPost3));
        return blogPosts;
    }

    public static void main(String[] args) {

        List<BlogPost> blogPosts = createBlogPosts();
        Blog something = new Blog();
        System.out.println("Original: ");
        for (BlogPost blogPost : blogPosts) {
            something.addBlogPost(blogPost);
        }

        for (int i = 0; i < something.blogPosts.size(); i++) {
            System.out.println(something.blogPosts.get(i).authorName);
        }
        BlogPost toDelete = something.blogPosts.get(1);
        something.delete(1);
        System.out.println("after deleted:");
        for (int i = 0; i < something.blogPosts.size(); i++) {
            System.out.println(something.blogPosts.get(i).authorName);
        }
        something.addBlogPost(toDelete);
        System.out.println("after added back: ");
        for (int i = 0; i < something.blogPosts.size(); i++) {
            System.out.println(something.blogPosts.get(i).authorName);
        }
    }
}
