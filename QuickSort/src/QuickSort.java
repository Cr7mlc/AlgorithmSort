public class QuickSort {

    public static void sort(int [] arr){
        quickSort(arr, 0, arr.length -1);
    }

    public static void quickSort(int [] arr, int start, int end){

        if(start< end){

            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);

        }

    }

    public static int partition(int[] arr , int start, int end){

        int i = start;
        int pivot = arr[end];

        for( int j = start; j< end; j++){

            if(arr[j] <= pivot){
                exchange(arr, i, j);
                i++;
            }

        }
        exchange(arr, i, end); // changing the position of arr[i] to the end position --> the pivot here goes in the middle
        return i;
    }
    public static void exchange(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String []args){

        int [] arr = {7,4,1,65,1,14};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));



    }
}
