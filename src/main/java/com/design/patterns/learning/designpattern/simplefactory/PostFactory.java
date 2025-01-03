package com.design.patterns.learning.designpattern.simplefactory;

public class PostFactory {

    private PostFactory() {
        throw new IllegalStateException("Utility class");
    }

    public static Post createPost(String postType) {
        return switch (postType) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Unknow post type");
        };
    }

}
