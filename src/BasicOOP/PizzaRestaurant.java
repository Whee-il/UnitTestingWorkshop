package BasicOOP;
import java.util.ArrayList;
public class PizzaRestaurant {
    private String name;
    private ArrayList<String> employees;

    public PizzaRestaurant(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public ArrayList<String> getEmployees() {
        return employees;
    }

    public void addEmployee(String name){
        employees.add(name);
    }

    public void removeEmployee(String name){
        employees.remove(name);
    }

    public void processOrder(Pizza order) {
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

    public static void main(String[] args) {

        PizzaRestaurant myRestaurant = new PizzaRestaurant("Guiseppi's");
        PizzaOrder pizzaOrderGetter = new PizzaOrder();

        ArrayList<Pizza> pizzaorders = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            pizzaorders.add(pizzaOrderGetter.GetOrder());
        }
        myRestaurant.addEmployee("Afra");
        myRestaurant.addEmployee("Connor");
        myRestaurant.addEmployee("Calvin");

        ArrayList<String> employees = myRestaurant.getEmployees();

        Pizza order;
        for(int i = 0; (i < employees.size()) && (i < pizzaorders.size()); i++){
            order = pizzaorders.get(i);
            myRestaurant.processOrder(order);
        }
    }
}

