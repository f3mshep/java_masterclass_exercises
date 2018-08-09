public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Beef", "Sourdough");
        this.addPatty();
        this.addTopping(new Lettuce());
        this.addTopping(new Onion());
        this.addTopping(new Tomato());
        this.addTopping(new Cheese());
        this.addTopping(new Addition("Drink", 1.50));
        this.addTopping(new Addition("Chips", .75));
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
