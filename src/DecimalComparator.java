public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double left, double right){
        int a = (int) (left * 1000);
        int b = (int) (right * 1000);
        if (a == b) return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));

    }

}
