package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    public SnapchatPublisher() {
    }
    public String share(){
        return "Snapchat" ;
    }
}
