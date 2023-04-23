package OOP;

import java.util.ArrayList;

public interface IntPizzaRestaurant {
    ArrayList<String> getEmployees();

    void addEmployee(String name);

    void removeEmployee(String name);
    ArrayList<Pizza> processOrders(ArrayList<Pizza> orders) throws InterruptedException;
}
