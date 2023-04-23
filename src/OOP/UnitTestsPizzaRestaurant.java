package OOP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UnitTestsPizzaRestaurant {

    private MockPizzaOrder mockPizzaOrderer = new MockPizzaOrder();
    private PizzaRestaurant restaurantToTest = new PizzaRestaurant("Test");
    private int numOrders = 10; // Must be greater than or equal to 3

    ArrayList<Pizza> PizzaOrders;
    @BeforeEach
    void InitTestOrderProcessing(){
        PizzaOrders = new ArrayList<>();

        for(int i = 0; i < numOrders; i++){
            PizzaOrders.add(mockPizzaOrderer.GetOrder());
        }
    }

    @AfterEach
    void ResetTestOrderProcessing(){
        PizzaOrders = null;
        restaurantToTest.removeAllEmployees();
    }

    @Test
    void TestOrderProcessingNoEmployees() throws InterruptedException {
        PizzaRestaurant restaurantToTest = new PizzaRestaurant("Test");

        restaurantToTest.processOrders(PizzaOrders);

        assertEquals(PizzaOrders.size(), numOrders);
    }

    @Test
    void TestOrderProcessingTooFewEmployees() throws InterruptedException {

        int numEmployees = numOrders - 2;
        for(int i = 1; i <= numEmployees; i++){
            restaurantToTest.addEmployee("Tester" + i);
        }
        restaurantToTest.processOrders(PizzaOrders);

        assertEquals(PizzaOrders.size(), numOrders - numEmployees);
    }

    @Test
    void TestOrderProcessingTooManyEmployees() throws InterruptedException {

        int numEmployees = numOrders + 2;
        for(int i = 1; i <= numEmployees; i++){
            restaurantToTest.addEmployee("Tester" + i);
        }
        restaurantToTest.processOrders(PizzaOrders);

        assertEquals(PizzaOrders.size(), 0);
    }

    @Test
    void TestOrderProcessingEqualEmployees() throws InterruptedException {

        int numEmployees = numOrders;
        for(int i = 1; i <= numEmployees; i++){
            restaurantToTest.addEmployee("Tester" + i);
        }
        restaurantToTest.processOrders(PizzaOrders);

        assertEquals(PizzaOrders.size(), 0);
    }

}
