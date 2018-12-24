package lifo.stack;

public class MinStack {

    private int[] data;
    private int[] minDate;
    private int top ;
    private int min;
    private int size;


    public MinStack(int k) {
        data = new int[k];
        minDate = new int[k];
        top =-1;
        min=-1;
        size = k;
    }

    public boolean push(int x) {
        if(isFull()){
            return false;
        }
        data[++top] = x;
        if(min == -1){
            minDate[++min] = top;
        }else {
            if(data[min]>x){
                minDate[++min] = top;
            }
        }
        return true;
    }

    public boolean pop() {
        if(isEmpty()){
            return false;
        }
        if(minDate[min]==top ){
            --min;
        }
        --top;
        return true;
    }

    public int top() {
        return data[top];
    }

    public int getMin() {
        return data[min];
    }

    public boolean isEmpty() {
        return top == 1;
    }
    public boolean isFull() {
        return top+1 == size;
    }
}
