package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User( String name ) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }
    public void sharePost() {
        System.out.println("Sharing post on " + socialPublisher.share());
    }
}
