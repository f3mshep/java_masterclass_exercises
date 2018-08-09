import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {

    private int[] arr;

    public ArrayChallenge(){

    }

    public void getIntegers(){
        Scanner reader = new Scanner(System.in);
        int[] tmp = new int[24];
        int count = 0;
        System.out.println("Enter an integer. Type 'quit' to quit!");
        while (true){
            String input = reader.nextLine();
            if (input.equals("quit")) break;
            int myNum = Integer.parseInt(input);
            tmp[count] = myNum;
            count++;
        }
        this.arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp[i];
        }
    }

    public void printIntegers(){
        System.out.println(Arrays.toString(arr));
    }

    public void sortIntegers(){
        int count = 0;
        while(count < this.arr.length){
            for (int i = 1; i < this.arr.length; i++) {
                int j = i - 1;
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            count++;
        }

    }

    public static void main(String[] args){

        ArrayChallenge challenge = new ArrayChallenge();
        challenge.getIntegers();
        challenge.sortIntegers();
        challenge.printIntegers();
    }

}
