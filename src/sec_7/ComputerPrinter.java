public class ComputerPrinter {


    private static int pagesPrinted;
    private final boolean isDuplex;
    private int tonerLevel;

    public ComputerPrinter(boolean isDuplex) {
        this.isDuplex = isDuplex;
        this.tonerLevel = 100;
    }

    public static int getPagesPrinted() {
        return pagesPrinted;
    }

    public void printPage(){
        if (this.getTonerLevel() > 0){
            increasePagesPrinted();
            decreaseToner();
            System.out.println("Boop Beep... ");
            System.out.println("Printing page...");
        } else {
            System.out.println("Boop beep");
            System.out.println("Out of ink!");
        }

    }

    public void refillToner(){
        setTonerLevel(100);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    private void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    private static void increasePagesPrinted() {
        ComputerPrinter.pagesPrinted++;
    }

    private void decreaseToner(){
        if (tonerLevel > 0){
            this.tonerLevel -= 1;
        } else {
            throw new java.lang.Error("Printer must have toner to print");
        }

    }

    public static void main(String[] args){

    }

}
