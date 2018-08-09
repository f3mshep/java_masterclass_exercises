public class Window {

    private final int tall, wide;
    private boolean isOpen;

    public Window(int tall, int wide) {
        this.tall = tall;
        this.wide = wide;
    }

    public String getDimensions(){
        return wide + " X " + tall;
    }

    public int getTall() {
        return tall;
    }

    public int getWide() {
        return wide;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void toggleWindow(){
        this.isOpen = !this.isOpen;
        String output = this.isOpen ? "The window is open" : "The window is closed";
        System.out.println(output);
    }
}
