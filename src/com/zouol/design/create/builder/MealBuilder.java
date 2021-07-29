package com.zouol.design.create.builder;

import com.zouol.design.create.builder.burger.ChickenBurger;
import com.zouol.design.create.builder.burger.VegBurger;
import com.zouol.design.create.builder.drink.Coke;
import com.zouol.design.create.builder.drink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
