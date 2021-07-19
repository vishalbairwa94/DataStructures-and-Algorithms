package PRACTICE.InterviewPrep;

public class MinHeap {
    MinHeapNode[] hArr;
    int heapSize;

    public MinHeap(MinHeapNode a[], int size){
        hArr = a;
        heapSize = size;
        int i = (size -1)/2;
        while (i >=0){
            minHeapify(i);
            i--;
        }

    }

    public void minHeapify(int i){
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if(l<heapSize && hArr[l].element < hArr[i].element){
            smallest = l;
        }
        if(r<heapSize && hArr[r].element < hArr[smallest].element){
            smallest = r;
        }
        if(smallest!=i){
            swap(hArr, i, smallest);
            minHeapify(smallest);

        }
    }

    int left(int i){
        return (2*i +1);
    }
    int right(int i){
        return (2*i +2);
    }

    void swap(MinHeapNode[] arr, int i, int j){
        MinHeapNode temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public MinHeapNode getMin(){
        if(heapSize <= 0){
            System.out.println("Heap Underflow");
        }
        return hArr[0];
    }

    public void replaceMin(MinHeapNode root){
        hArr[0] = root;
        minHeapify(0);
    }

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
