package com.kodilla.patterns.builder.pizza.bigmac;

import java.util.ArrayList;

public class BigMac {
    private static String SESAME = "Sesame";
    private static String PLAIN = "Plain";
    private static String MAYONNAISE = "Mayonnaise";
    private static String THOUSANDISLANDS = "Thousand Islands";
    private static String BARBECUE = "Barbecue";
    private static String LETTUCE = "Lettuce";
    private static String ONION = "Onion";
    private static String PICKLE = "Pickle";
    private static String CHILI = "Chili";
    private static String MUSHROOM = "Mushroom";
    private static String CHEESE = "Cheese";
    private static String BACON = "Bacon";

    private final String bun;
    private final int burgers;
    private final String sauce;
    private ArrayList<String> ingredients = new ArrayList<>();

    private BigMac( final String bun, final int burgers, final String sauce, final ArrayList<String> ingredients ) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private ArrayList<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(  String bun ) throws IllegalStateException {
            if (bun.equals(SESAME) || bun.equals(PLAIN)) {
                this.bun = bun;
                return this;
            } else if (bun.length() == 0) {
                throw new IllegalStateException("Pick a bun, with sesame or without?");
            } else {
                throw new IllegalStateException("There is only choice of two buns: Sesame or Plain");
            }
        }

        public BigMacBuilder burgers( final int burgers ) throws IllegalStateException {
            if (burgers >= 1 && burgers <= 4 ) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("Please select number of burgers (max 4) ");
            }
        }

        public BigMacBuilder sauce( String sauce ) throws IllegalStateException, NullPointerException {
            if (sauce.equals(MAYONNAISE) || sauce.equals(THOUSANDISLANDS) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
                return this;
            } else if (sauce == null) {
                throw new NullPointerException("Pick a sauce");
            } else {
                throw new IllegalStateException("There is only choice of three sauces: Mayonnaise, Thousand Islands or Barbecue");
            }
        }

        public BigMacBuilder ingredients( String ingredient ) throws IllegalStateException, NullPointerException {
            if (ingredient.equals(LETTUCE) || ingredient.equals(BACON) || ingredient.equals(ONION) || ingredient.equals(PICKLE) || ingredient.equals(CHILI) || ingredient.equals(MUSHROOM) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
                return this;
            } else if (ingredients.isEmpty()) {
                throw new NullPointerException("Pick an ingredient");
            } else {
                throw new IllegalStateException("There are following options of ingredients: Lettuce, Onion, Pickle, Chili, Mushroom, Bacon or Cheese");
            }
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}