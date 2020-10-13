
package com.example.foodapprecipy.view.detail;


import com.example.foodapprecipy.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meals);
    void onErrorLoading(String message);
}
