import java.util.Arrays;


public class Reverse {

    public static void myReverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] myArr = {1,2,3,4,5,6};
        myReverse(myArr);
    }

}
