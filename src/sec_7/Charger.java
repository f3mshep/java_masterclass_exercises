public class Charger extends Car {

    public Charger(String engine, String colour) {
        super("Dodge Charger", engine, colour, 2, 4, 160);
    }

    @Override
    public void turnOn() {
        System.out.println("The Dodge Charger rumbles and the engine starts!");
        setOn(true);
    }
}
