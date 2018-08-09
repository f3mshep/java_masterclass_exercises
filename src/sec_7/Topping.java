public class Topping {

    private final String name;
    private final double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
       return "Topping: " + this.name + " Price: " + price;

    }
}

class Lettuce extends Topping{

    public Lettuce(){
        super("Lettuce", 0.25 );
    }

}

class Tomato extends Topping{

    public Tomato(){
        super("Tomato", 0.50);
    }

}


class Onion extends Topping{

    public Onion(){
        super("Onion", 0.75);
    }

}

class Avocado extends Topping{

    public Avocado(){
        super("Avocado", 1.25);
    }

}

class Bacon extends Topping{

    public Bacon(){
        super("Bacon", 1.50);
    }

}

class Cheese extends Topping{

    public Cheese(){
        super("Cheese", .75);
    }

}

class Hummus extends Topping{

    public Hummus(){
        super("Hummus", .50);
    }

}


