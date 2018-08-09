public class Subaru extends Car {

    public Subaru(String engine, String colour) {
        super("Subaru WRX", engine, colour, 2, 4, 160);
    }

    @Override
    public void turnOn() {
        System.out.println("The WRX roars as the engine starts!");
        setOn(true);
    }

}
