import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int[] insertionSort(int[] nums){

        for(int i =0; i< nums.length; i++){
            int current = nums[i];
            int j = i-1;

            while (j>=0 && nums[j]> current){

                nums[j+1] = nums[j];
                j--;
                nums[j+1] = current;

            }

        }

        return nums;

    }

    public static void main(String[] args) {

            int [] nums = {25,12,125,1,0,358,75};
            System.out.println(java.util.Arrays.toString(insertionSort(nums)));




    }

}
