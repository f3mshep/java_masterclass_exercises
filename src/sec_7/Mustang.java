public class Mustang extends Car {

    public Mustang(String engine, String colour) {
        super("Mustang", engine, colour, 2, 4, 160);
    }

    @Override
    public void turnOn() {
        System.out.println("The Mustang purrs to life.");
        setOn(true);
    }

    public static void main(String[] args){

        Mustang betsy = new Mustang("V8", "Red");
        betsy.turnOn();
        betsy.accelerate(30);
        betsy.accelerate(50);
        betsy.deaccelerate(80);
        betsy.turnOff();
    }



}
