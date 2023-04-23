package OOP;

public class MockPizzaOrder implements IntPizzaOrder{

    @Override
    public Pizza GetOrder() {
        String[] testToppings = {"Peperoni"};

        return new Pizza(testToppings, "Medium");
    }
}
