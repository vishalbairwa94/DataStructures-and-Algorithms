package PRACTICE.InterviewPrep;

//time complexity O(n*k*logk)
public class MergeKSortedArray {
    public static void mergeKSortedArray(int[][] arr, int k){
        MinHeapNode[] hArr = new MinHeapNode[k];
        int resultSize = 0;

        for(int i =0; i<arr.length; i++){
            MinHeapNode node = new MinHeapNode(arr[i][0], i, 1);
            hArr[i] = node;
            resultSize = resultSize + arr[i].length;
        }

        MinHeap mH = new MinHeap(hArr, k);
        int[] result = new int[resultSize];

        for (int i = 0; i<resultSize; i++){
            MinHeapNode root = mH.getMin();
            result[i] = root.element;

            if(root.j < arr[root.i].length){
                root.element = arr[root.i][root.j++];
            }
            else{
                root.element = Integer.MAX_VALUE;
            }
            mH.replaceMin(root);
        }
        mH.printArray(result);

    }

    public static void main(String args[]){
        int[][] arr= {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};

        System.out.println("Merged array is :");

        mergeKSortedArray(arr,arr.length);
    }
}
