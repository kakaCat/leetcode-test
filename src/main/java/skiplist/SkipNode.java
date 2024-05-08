package skiplist;

public class SkipNode<E> {

    public Integer key;

    public E value;

    public SkipNode<E>[] next;

    public SkipNode(int length){
        next = new SkipNode[length];
    }
    public SkipNode(Integer key, E value,int length) {
        this.key = key;
        this.value = value;
        next = new SkipNode[length];
    }
}
