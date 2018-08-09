public class HealthyBurger extends Hamburger {

    public HealthyBurger() {
        super("Chicken", "Whole Wheat");
    }

    @Override
    public void addTopping(Topping topping) {
        if (this.getToppings().size() < 7){
            addToppingToList(topping);
        } else {
            System.out.println("Max toppings reached!");
        }
    }
}
