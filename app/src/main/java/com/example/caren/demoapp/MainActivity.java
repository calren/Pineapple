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
    private List<Food> finalFoodList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpFoodList();
    }

    private void setUpFoodList() {
        RecyclerView foodListRV = findViewById(R.id.list);

        foodList = repository.getSortedFoodList();
        finalFoodList=repository.getSortedFoodListName();
        // Create adapter passing in the sample user data
        FoodListAdapter adapter = new FoodListAdapter(finalFoodList);
        // Attach the adapter to the recyclerview to populate items
        foodListRV.setAdapter(adapter);
        // Set layout manager to position the items
        foodListRV.setLayoutManager(new LinearLayoutManager(this));
    }
}
