package lifo.stack;

public class MyStack {

    private volatile int top;

    private int size;

    private int[] data ;

    public MyStack(int k){
        data = new int[k];
        size = k;
        top =-1;
    }
    public boolean push(int x) {
        if(isFull()){
            return false;
        }
        data[++top] = x;
        return true;
    }
    public boolean isEmpty() {
        return top == 1;
    }



    public int top() {
        return data[top];
    }

    public boolean pop() {
        if (isEmpty()) {
            return false;
        }
        --top;
        return true;
    }

    public boolean isFull() {
        return top+1 == size;
    }

}
