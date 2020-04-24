public class Test {

    public static int[] sortedArray(int[] nums){

        for(int i=0; i< nums.length-1; i++){
            for(int j=0; j< nums.length-1-i; j++){

                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;

                }

            }
        }



        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1,275,12,3,300,2,0,75,45};

        sortedArray(nums);

        for (int i :nums){
            System.out.print(i+ " ");
        }
    }



}
