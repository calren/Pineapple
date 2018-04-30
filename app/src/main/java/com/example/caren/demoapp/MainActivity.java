package com.example.caren.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Activity that display a list of food, and has a button that doesn't do anything
 */
public class MainActivity extends AppCompatActivity {

    private List<Food> foodList = new ArrayList<>();
    private Repository repository = new Repository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpFoodList();
    }

    private void setUpFoodList() {
        RecyclerView foodListRV = findViewById(R.id.list);

        foodList = repository.getFoodList();
        // Create adapter passing in the sample user data
        FoodListAdapter adapter = new FoodListAdapter(foodList);
        // Attach the adapter to the recyclerview to populate items
        foodListRV.setAdapter(adapter);
        // Set layout manager to position the items
        foodListRV.setLayoutManager(new LinearLayoutManager(this));
    }
}
