public class OverloadChallenge {

    public static double calcFeetAndInchesToCentimeters(double in, double ft){
        if ((in < 0 ||  in >= 12) || ft < 0) return -1;
        return (ft * 12 * 2.54) + in * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double in){
        if (in < 0) return -1;
        int ft = 0;
        double feet = 0;
        if (in > 12){
            ft = (int) in / 12;
            feet = (double) ft;
            in -= feet * 12;
        }

        return calcFeetAndInchesToCentimeters(feet, in);
    }

    public static void main(String[] args){

        System.out.println(calcFeetAndInchesToCentimeters(13.0));
    }

}
