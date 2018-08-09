public class Addition extends Topping {

    public Addition(String name, double price){
        super(name, price);
    }

    @Override
    public String toString() {
        return "Addition: " + this.getName() + " Price: " + this.getPrice();
    }
}
