package OOP;

import java.util.ArrayList;

public class runRestaurant {

    public static void restaurant(IntPizzaRestaurant Restaurant, IntPizzaOrder OrderGetter) throws InterruptedException {

        ArrayList<Pizza> PizzaOrders = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            PizzaOrders.add(OrderGetter.GetOrder());
        }

        Restaurant.addEmployee("Afra");
        Restaurant.addEmployee("Connor");
        Restaurant.addEmployee("Calvin");

        Restaurant.processOrders(PizzaOrders);

    }

}
