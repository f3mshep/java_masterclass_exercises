public class BarkingDog {


    public static boolean bark(boolean isBarking, int time){
        if (time < 0 || time > 23) return false;
        if (isBarking && (time < 8 || time > 22)) return true;
        return false;
    }


    public static void main(String[] args){
        System.out.println(bark(true, 1));

    }
}
