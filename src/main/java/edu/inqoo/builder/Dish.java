package edu.inqoo.builder;

import java.math.BigDecimal;

public class Dish {

    private String name;
    private int amount;
    private BigDecimal price;

    private int calories;
    private int protein;
    private int fat;
    private int carbs;

    public static class DishBuilder{
        private String name;
        private int amount;
        private BigDecimal price;

        private int calories;
        private int protein;
        private int fat;
        private int carbs;

        public DishBuilder(String name, int amount, BigDecimal price) {
            this.name = name;
            this.amount = amount;
            this.price = price;
        }

        public DishBuilder calories(int calories){
            this.calories = calories;
            return this;
        }

        public DishBuilder protein(int protein){
            this.protein = protein;
            return this;
        }

        public DishBuilder fat(int fat){
            this.fat = fat;
            return this;
        }

        public DishBuilder carbs(int carbs){
            this.carbs = carbs;
            return this;
        }

        public Dish build(){
            return new Dish(this);
        }
    }

    private Dish(){}
    private Dish(DishBuilder dishBuilder){
        this.name = dishBuilder.name;
        this.amount = dishBuilder.amount;
        this.price = dishBuilder.price;

        this.calories = dishBuilder.calories;
        this.protein = dishBuilder.protein;
        this.fat = dishBuilder.fat;
        this.carbs = dishBuilder.carbs;
    }
}
