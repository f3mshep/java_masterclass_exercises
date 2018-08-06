public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){
        int[] nums = {a, b, c};
        for (int num:nums){
            if (num >= 13 && num <= 19) return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(hasTeen(9, 99, 20));

    }

}
