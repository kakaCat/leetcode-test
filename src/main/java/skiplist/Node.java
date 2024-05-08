package skiplist;

public class Node<T> {
    // 可排序的key, 目前暂用int型
    public Integer key;
    // 节点value
    public T value;
    // 每层指向后续节点的指针
    public Node<T>[] forwards;

    public Node(Integer key, T value, int level) {
        this.key = key;
        this.value = value;
        this.forwards = new Node[level];
    }
    public Node(int level) {
        this.forwards = new Node[level];
    }
}
