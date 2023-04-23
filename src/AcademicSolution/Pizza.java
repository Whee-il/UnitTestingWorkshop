package AcademicSolution;

public class Pizza {
    private final String[] toppings;
    private String Size;
    private int slices;
    public Pizza(String[] toppings, String Size){
        this.toppings = toppings.clone();
        this.Size = Size;
        if(this.Size.equals("Large")){
            this.slices = 8;
        }
        else{
            this.slices = 6;
        }
    }

    public int eatSlice(){
        if(slices > 0){
            slices--;
        }
        return slices;
    }

    public String toString(){
        StringBuilder fullOutput = new StringBuilder("This is a " + Size + " Pizza with ");
        for (String topping: toppings){
            fullOutput.append(topping).append(", ");
        }

        return fullOutput.toString();
    }
}
