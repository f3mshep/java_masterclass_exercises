import java.util.ArrayList;

public class Hamburger {

    private final double priceOfBun = 1.75;
    private final double priceOfPatty = 2.00;
    private int numberOfPatties = 1;
    private String meatType;
    private String bunType;
    private ArrayList<Addition> additions = new ArrayList<Addition>();
    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    public Hamburger(String meatType, String bunType) {
        this.meatType = meatType;
        this.bunType = bunType;
    }

    public void addTopping(Topping topping){
        if (toppings.size() < 5){
            toppings.add(topping);
        } else {
            System.out.println("Max toppings reached!");
        }
    }

    public void addPatty(){
        this.numberOfPatties++;
    }

    public double getPrice(){
        double finalPrice = priceOfBun + (numberOfPatties * priceOfPatty);
        for (Topping topping : toppings){
            finalPrice += topping.getPrice();
        }

        for (Addition addition: additions){
            finalPrice += addition.getPrice();
        }
        return finalPrice;
    }

    public ArrayList<Addition> getAdditions() {
        return additions;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    protected void addToppingToList(Topping topping){
        toppings.add(topping);
    }
}
