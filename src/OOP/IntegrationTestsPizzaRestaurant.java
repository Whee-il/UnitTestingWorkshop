package OOP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegrationTestsPizzaRestaurant {

    private MockPizzaOrder mockPizzaOrderer = new MockPizzaOrder();
    private PizzaRestaurant restaurantToTest = new PizzaRestaurant("Test");

    @Test
    void TestPizzaRestaurantFull() throws InterruptedException {

        runRestaurant.restaurant(restaurantToTest, mockPizzaOrderer);
        assertEquals(restaurantToTest.getProcessedOrders().size(), 3);
    }

}
