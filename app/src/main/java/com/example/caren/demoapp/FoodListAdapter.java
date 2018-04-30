package com.example.caren.demoapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FoodListAdapter extends
        RecyclerView.Adapter<FoodListAdapter.ViewHolder> {

    private List<Food> foods;

    public FoodListAdapter(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public FoodListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.food_item, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(FoodListAdapter.ViewHolder viewHolder, int position) {
        Food food = foods.get(position);

        viewHolder.foodName.setText(food.name);
        viewHolder.foodType.setText(food.type.toString());
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView foodName;
        TextView foodType;

        public ViewHolder(View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.food_name);
            foodType = itemView.findViewById(R.id.food_type);
        }
    }
}
