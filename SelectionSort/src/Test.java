public class Test {

    public static int[] selectionSort(int[] nums){

        for (int i=0; i < nums.length-1; i++){
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]<nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }

            }

        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {78,12,3,54,100,47,96,10};
        System.out.println(java.util.Arrays.toString(selectionSort(nums)));
    }

}
