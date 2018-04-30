package com.example.caren.demoapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Main Data class responsible for returning data. Data is currently generated dynamically and not
 * stored anywhere
 */
public class Repository {

    public List<Food> getFoodList() {
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Strawberry", Food.Category.FRUIT));
        foodList.add(new Food("Chicken", Food.Category.MEAT));
        foodList.add(new Food("Broccoli", Food.Category.VEGETABLE));
        foodList.add(new Food("Asparagus", Food.Category.VEGETABLE));
        foodList.add(new Food("Pork", Food.Category.MEAT));
        foodList.add(new Food("Watermelon", Food.Category.FRUIT));
        foodList.add(new Food("Banana", Food.Category.FRUIT));

        return foodList;
    }

    /**
     * Returns a dynamically generate list of foods sorted by category
     */
    public List<Food> getSortedFoodList() {
        List<Food> foodList = getFoodList();
        sortFoodListByCategory(foodList);
        return foodList;
    }

    private void sortFoodListByCategory(List<Food> food) {
        Collections.sort(food, new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                if (o1.getFoodCategoryRank() == o2.getFoodCategoryRank()) {
                    return 0;
                } else if (o1.getFoodCategoryRank() > o2.getFoodCategoryRank()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
