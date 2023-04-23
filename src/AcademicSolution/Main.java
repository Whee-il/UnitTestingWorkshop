package AcademicSolution;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaorders = new ArrayList<>();
        for(int i = 0; i <3; i++){
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
            pizzaorders.add(order);
        }
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Katie");
        employees.add("Riley");
        employees.add("Jalen");
        Pizza order;
        for(int i = 0; (i < employees.size()) && (i < pizzaorders.size()); i++){
            order = pizzaorders.get(i);
            String str = order.toString();
            char ch;
            StringBuilder processed = new StringBuilder();
            for (int j=str.length()-1; j>0; j--) {
                ch = str.charAt(j);
                processed.append(ch);
            }
            System.out.println(order);
            System.out.println(processed);
        }
    }
}
