package OOP;

import java.util.Random;

public class PizzaOrder implements IntPizzaOrder {
    public PizzaOrder(){
    }
    @Override
    public Pizza GetOrder(){
        Random rand = new Random();
        Pizza order;
        String[] pizza1toppings = {"Pepperoni", "Sausage"};
        String[] pizza2toppings = {"Pineapple", "Olives", "Mushrooms"};
        String[] pizza3toppings = {"Tomato"};

        String[] toppings;

        int pizza = rand.nextInt(3);
        if(pizza == 0){
            toppings = pizza1toppings.clone();
        }
        else if(pizza == 1){
            toppings = pizza2toppings.clone();
        }
        else{
            toppings = pizza3toppings;
        }
        String Size;
        pizza = rand.nextInt(3);
        if(pizza == 0){
            Size = "Large";
        }
        else if(pizza == 1){
            Size = "Medium";
        }
        else{
            Size = "Personal";
        }
        order = new Pizza(toppings, Size);
        return order;
    }
    public String returnShiv(){
        return "Shiv";
    }
}
