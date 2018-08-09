public class Vehicle {
    // speed terrain
    private String terrain;
    private int currentSpeed, topSpeed;

    public Vehicle(String terrain, int topSpeed) {
        this.terrain = terrain;
        this.topSpeed = topSpeed;
    }

    public void accelerate(int amount){
        amount += this.currentSpeed;
        if (amount > topSpeed) amount = topSpeed;
        this.currentSpeed = amount;
    }

    public void deaccelerate(int amount){
        amount = this.currentSpeed - amount;
        if (amount < 0) amount = 0;
        this.currentSpeed = amount;

    }

    public void stop(){
        this.currentSpeed = 0;
    }



}
