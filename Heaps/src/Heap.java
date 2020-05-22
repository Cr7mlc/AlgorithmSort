import java.util.Arrays;

public class Heap {
    private Integer [] heapData;
    private int currentPos = -1;


    public Heap(int size){

        heapData = new Integer[size];

    }

    public void insert(int item){

        heapData[++currentPos] = item;
        fixUp(currentPos);

    }


    // Deleting the Root
    public int delete(){

        int result = heapData[0]; // saving the value of the root in the result variable
        heapData[0] = heapData[currentPos--]; // Changing the value of the root
        heapData[currentPos+1] = null;// changing the value of the last element
        fixDown(0, -1); // fixing the heap
        return result;

    }

    public void fixDown(int index, int upTo){

        if(upTo<0) upTo= currentPos;

        while(index <= upTo){

            int leftChild = 2 * index +1;
            int rightChild = leftChild + 1;

            if (leftChild <= upTo) {

                int childToSwap;

                if(rightChild > upTo){

                    childToSwap = leftChild;

                }else{
                    childToSwap = (heapData[leftChild] > heapData[rightChild]) ? leftChild : rightChild;
                }

                if(heapData[index] < heapData[childToSwap]){

                    int temp = heapData[index];
                    heapData[index] = heapData[childToSwap];
                    heapData[childToSwap] = temp;


                }else{
                    break;
                }
                index = childToSwap;
            }else{
                break;
            }


        }
    }

    public void fixUp(int index){

        int parentIndex = (index -1)/2;

        while(parentIndex >=0 && heapData[parentIndex] < heapData[index]){

            int temp = heapData[parentIndex];
            heapData[parentIndex] = heapData[index];
            heapData[index] = temp;

            index = parentIndex;

            parentIndex = (index -1)/2;
        }


    }
    public void heapSort(){

        for(int i=0; i< currentPos; i++){

            int temp = heapData[0];//the max value
            heapData[0] = heapData[currentPos-i];
            heapData[currentPos-i] = temp;

            fixDown(0,currentPos-i-1);

        }
    }

    public void insertArray(int [] arr){

        for (int i : arr) {
            insert(i);
        }
    }

    public static void main(String []args){

        Heap heap = new Heap(10);
        Heap heap2 = new Heap(15);
        heap.insertArray(new int[]{100,13,4,754,1125,58,1368,450,63,94});

        System.out.println("Heap Before Deletion :" + Arrays.deepToString(heap.heapData));

        System.out.println("Deleted Item " + heap.delete());

        System.out.println("Heap After Deletion :" +Arrays.toString(heap.heapData));


        heap2.insertArray(new int[]{100,2856,4,754,1125,58,1368,450,63,94,75,13,69,451,23});

        heap2.heapSort();
        System.out.println("Heap array After Sort : " + Arrays.toString(heap2.heapData));




    }




}
