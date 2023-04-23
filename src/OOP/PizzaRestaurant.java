package OOP;

import java.util.ArrayList;

public class PizzaRestaurant implements IntPizzaRestaurant {
    private String name;
    private ArrayList<String> employees;
    private ArrayList<Pizza> processedOrders;
    public PizzaRestaurant(String name){
        this.name = name;
        this.employees = new ArrayList<>();
        this.processedOrders = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(String name){
        employees.add(name);
    }

    @Override
    public void removeEmployee(String name){
        employees.remove(name);
    }

    public void removeAllEmployees(){
        employees = new ArrayList<>();
    }

    public ArrayList<Pizza> getProcessedOrders(){
        return this.processedOrders;}


    @Override
    public ArrayList<Pizza> processOrders(ArrayList<Pizza> orders) {

        ArrayList<Pizza> processedOrders = new ArrayList<>();
        Pizza order;
        for(int i = 0; (i < employees.size()) && (i < orders.size()); i++){
            order = orders.get(i);
            processOrder(order);
            processedOrders.add(order);

        }
        for(int i = 0; i < processedOrders.size(); i++){
            orders.remove(processedOrders.get(i));
        }

        this.processedOrders.addAll(processedOrders);

        return processedOrders;
    }
    private void processOrder(Pizza order) {
        String str = order.toString();
        char ch;
        StringBuilder processed = new StringBuilder();
        for (int i=str.length()-1; i>0; i--) {
            ch = str.charAt(i);
            processed.append(ch);
        }

        System.out.println(order);
        System.out.println(processed);
    }

    public String toString(){
        return name;
    }
}

