package com.kodilla.patterns.singleton.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    public UserTestSuite() {
    }

    @Test
    public void testDefaultSharingStrategies() {
        User martinLuther = new YGeneration("martinLuther");
        User johnFitz = new ZGeneration("johnFitz");
        User canIsland = new Millenials("canIsland");
        String yGenerationDefaultSocialPublisher = martinLuther.getSocialPublisher().share();
        String zGenerationDefaultSocialPublisher = johnFitz.getSocialPublisher().share();
        String millenialsDefaultSocialPublisher = canIsland.getSocialPublisher().share();
        Assert.assertEquals("Twitter", yGenerationDefaultSocialPublisher);
        System.out.println(martinLuther.getName() + " likes to share his thoughts on: " + yGenerationDefaultSocialPublisher);
        Assert.assertEquals("Snapchat", zGenerationDefaultSocialPublisher);
        System.out.println(johnFitz.getName() + " likes to share his thoughts on: " + zGenerationDefaultSocialPublisher);
        Assert.assertEquals("Facebook", millenialsDefaultSocialPublisher);
        System.out.println(canIsland.getName() + " likes to share his thoughts on: " + millenialsDefaultSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategies() {
        User martinLuther = new YGeneration("martinLuther");
        User johnFitz = new ZGeneration("johnFitz");
        User canIsland = new Millenials("canIsland");
        martinLuther.setSocialPublisher(new FacebookPublisher());
        johnFitz.setSocialPublisher(new TwitterPublisher());
        canIsland.setSocialPublisher(new SnapchatPublisher());
        Assert.assertEquals("Facebook", martinLuther.getSocialPublisher().share());
        System.out.println(martinLuther.getName() + " likes to share his thoughts now on: " + martinLuther.getSocialPublisher().share());
        Assert.assertEquals("Twitter", johnFitz.getSocialPublisher().share());
        System.out.println(johnFitz.getName() + " likes to share his thoughts now on: " + johnFitz.getSocialPublisher().share());
        Assert.assertEquals("Snapchat", canIsland.getSocialPublisher().share());
        System.out.println(canIsland.getName() + " likes to share his thoughts now on: " + canIsland.getSocialPublisher().share());
    }
}
