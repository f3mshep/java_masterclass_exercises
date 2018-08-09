public class Bedroom {

    //has a bed, a computer, a Window
    private Bed bed;
    private Computer computer;
    private Window window;

    public Bedroom(Bed bed, Computer computer, Window window) {
        this.bed = bed;
        this.computer = computer;
        this.window = window;
    }

    public void toggleWindow(){
        this.window.toggleWindow();
    }

    public Bed getBed() {
        return bed;
    }

    public Computer getComputer() {
        return computer;
    }

    public Window getWindow() {
        return window;
    }
}
