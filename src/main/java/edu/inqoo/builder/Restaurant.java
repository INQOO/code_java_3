package edu.inqoo.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    List<Dish> menu = new ArrayList<>();

    public void addDish(){
        Dish spaghetti
                = new Dish
                .DishBuilder("Spaghetti", 400, BigDecimal.valueOf(15))
                .calories(500)
                .protein(40)
                .fat(50)
                .carbs(120)
                .build();
        menu.add(spaghetti);
    }
}
