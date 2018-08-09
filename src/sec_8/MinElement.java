import java.util.Arrays;
import java.util.Scanner;

public class MinElement {

    private int[] nums;
    private int capacity;

    public MinElement(int capacity) {
        this.capacity = capacity;
    }

    public void getIntegers(){
        Scanner reader = new Scanner(System.in);
        nums = new int[this.capacity];
        int count = 0;
        System.out.println("Enter " + this.capacity + " integers");
        while(count < capacity){
            int tmp = Integer.parseInt(reader.nextLine());
            nums[count] = tmp;
            count++;
        }
    }

    public int findMin(){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many ints to check?");
        int capacity = Integer.parseInt(reader.nextLine());
        MinElement min = new MinElement(capacity);
        min.getIntegers();
        System.out.println("The smallest element is: " + min.findMin());
    }

}
