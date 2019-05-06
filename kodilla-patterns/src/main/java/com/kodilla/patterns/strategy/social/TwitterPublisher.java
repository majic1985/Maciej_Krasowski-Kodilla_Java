package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    public TwitterPublisher() {
    }
    public String share() {
        return "Twitter";
    }
}
