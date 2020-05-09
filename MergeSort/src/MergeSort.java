import java.util.Arrays;

public class MergeSort {


    public void sort(int [] arr){
        mergeSort(arr, 0, arr.length-1);
    }


    private void mergeSort(int[] arr, int start, int end){


        if(start< end){
            int middle = (int)Math.floor((end+start)/2);
            mergeSort(arr,start,middle);
            mergeSort(arr,middle+1,end);
            mergeArr(arr,start,middle,end);



        }


    }

    private void mergeArr(int[] arr, int start, int middle, int end) {

        int[] leftA = new int[middle-start+1];
        int[] rightA = new int[end-middle];

        for(int j=0; j< leftA.length; j++)
            leftA[j] =arr[start+ j];

        for(int i=0; i< rightA.length; i++)
            rightA[i] =arr[i+middle+1];

        int i=0,j = 0;
        for(int k=start; k<= end; k++){
            if(j>= rightA.length || (i<leftA.length && leftA[i]<=rightA[j])){
                arr[k] = leftA[i];
                i++;
            }else{
                arr[k] = rightA[j];
                j++;
            }

        }


    }


    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] arr = {9,14,76,24,1,3,48,4,31,1};

        merge.sort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
