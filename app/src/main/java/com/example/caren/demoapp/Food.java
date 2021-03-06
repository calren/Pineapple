package com.example.caren.demoapp;

public class Food {
    String name;
    Category type;

    public Food(String name, Category type) {
        this.name = name;
        this.type = type;
    }

    public enum Category {
        FRUIT, VEGETABLE, MEAT
    }

    public int getFoodCategoryRank() {
        switch (type) {
            case FRUIT:
                return 1;
            case MEAT:
                return 2;
            case VEGETABLE:
                return 3;
            default:
                return -1;
        }
    }
}
