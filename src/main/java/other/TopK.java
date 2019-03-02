package other;

public class  TopK{
    public int[] createHeapOther(int a[], int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = a[i];
        }
        for (int i = 1; i < k; i++) {
            int child = i;
            int parent = (i - 1) / 2;
            int temp = a[i];
            while (parent >= 0 &&child!=0&& result[parent] >temp) {
                result[child] = result[parent];
                child = parent;
                parent = (parent - 1) / 2;
            }
            result[child] = temp;
        }
        return result;
    }

    //创建小根堆,复杂度最坏是nlgK
    public int[] createHeap(int input[], int K) {
        int heap[] = new int[K];
        for(int i=0;i<K;i++){
            heap[i] = input[i];
        }
        for(int i = 1;i < heap.length;i++) {
            int child = i;
            int parent = (child-1) / 2;
            while(parent >= 0 && child!=0 && heap[parent] > heap[child]) {
                int temp = heap[child];
                heap[child] = heap[parent];
                heap[parent] = temp;
                child = parent;
                parent = (parent - 1) / 2;
            }
        }
        return heap;
    }
    public void insertHeap(int heap[], int value) {
        heap[0] = value;
        int parent = 0;
        //这个循环复杂度最坏是  logK
        while(parent<heap.length) {
            int lchild = parent*2 + 1;
            int rchild = parent*2 + 2;
            //指向左右儿子中最小的
            int minIndex = parent;
            if(lchild < heap.length && heap[lchild] < heap[parent]){
                minIndex = lchild;
            }

            if(rchild < heap.length && heap[rchild] < heap[minIndex]){
                minIndex = rchild;
            }
            if(minIndex == parent) {
                break;
            }
            else {
                int temp = heap[minIndex];
                heap[minIndex] = heap[parent];
                heap[parent] = temp;
                parent = minIndex;
            }
        }
    }

    public int[] getTopKByHeap(int input[], int K) {
        //复杂度最坏是 O(nlgK)
        int result[] = createHeap(input, K);
        for(int i=K;i<input.length;i++) {
            if(input[i] > result[0]){
                //复杂度最坏是O(nlgK)，而且内存消耗就K，不然海量数据排序，内存放不下，得用归并排序，最好最坏平均都是 O(nlgn)
                insertHeap(result, input[i]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        //待找TOP K 的排海量数据N
        int a[] = {4,3,5,1,2,8,9,10};
        int result[] = new TopK().getTopKByHeap(a, 6);
        System.out.print("TOP K is :");
        for(int resultItem : result) {
            System.out.print(resultItem + "   ");
        }
    }
}
