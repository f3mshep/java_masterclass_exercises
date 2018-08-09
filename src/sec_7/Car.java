
public class Car extends Vehicle {

    // wheels doors engine model make

    private int doors, wheels;
    private String model, engine, colour;
    private boolean isOn;

    public Car(String model, String engine, String colour, int doors, int wheels, int topSpeed){
        super("road", topSpeed);
        this.model = model;
        this.engine = engine;
        this.colour = colour;
        this.doors = doors;
        this.wheels = wheels;
    }

    public void turnOn(){
        if (!this.isOn) {
            System.out.println("The engine has started.");
            this.isOn = true;
        }
    }

    public void turnOff(){
        if (this.isOn){
            System.out.println("The engine has stopped.");
            this.isOn = false;
        }

    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void accelerate(int amount) {
        if (!this.isOn) throw new java.lang.Error("Car must be on to accelerate");
        System.out.println("Vroooooom!");
        super.accelerate(amount);
    }

}
