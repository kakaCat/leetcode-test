package skiplist;

import java.util.Random;

public class SkipListT<T> {

    public SkipListT() {
        // 头结点仅作为哨兵节点
        this.head = new Node<>(maxLevel);
        this.level = 0;
        this.length = 0;
    }

    public int size() {
        return this.length;
    }
    private int getRandomLevel() {
        int level = 1;
        while (random.nextFloat() < upgradePercentage && level < maxLevel) {
            level++;
        }
        return level;
    }

    // 跳表长高几率
    private final float upgradePercentage = 0.9F;
    // 跳表最大层高
    private final int maxLevel = 16;
    // 当前跳表最大层数
    private int level;
    // 当前跳表元素个数
    private int length;
    // 跳表头节点
    private final Node<T> head;
    // 随机数生成
    private final Random random = new Random();


    public T add(int key, T value) {
        // 记录一下插入位置每层前一位置的节点, 需要将他们的指向全部更新为插入节点
        Node<T>[] toUpdate = new Node[maxLevel];
        Node<T> h = this.head;
        for (int i = this.level - 1; i >= 0; i--) {
            while (h.forwards[i] != null && h.forwards[i].key < key){
                h = h.forwards[i];
            }
            toUpdate[i] = h;
        }
        h = h.forwards[0];

        // 如果key冲突了则替换value
        if (h != null && h.key == key) {
            h.value = value;
            return h.value;
        }

        int level = getRandomLevel();
        // 如果高度超过了头结点, 则固定只比头结点高一层, 头结点也长高与其对应
        if (level > this.level) {
            level = this.level + 1;
            toUpdate[this.level] = this.head;
            this.level = level;
        }
        // 插入节点并修改前序节点的指针
        Node<T> node = new Node<>(key, value, level);
        for (int i = 0; i < level; i++) {
            final Node<T> forward = toUpdate[i].forwards[i];
            node.forwards[i] = forward;
            toUpdate[i].forwards[i] = node;
        }
        this.length++;
        return node.value;
    }
    public T delete(int key) {
        Node<T>[] update = new Node[maxLevel];
        Node<T> h = this.head;
        for (int i = update.length - 1; i >= 0; i--) {
            while (h.forwards[i] != null && h.forwards[i].key < key){
                h = h.forwards[i];
            }
            update[i] = h;
        }

        h = h.forwards[0];
        if (h != null && h.key == key) {
            for (int i = 0; i < this.level; i++) {
                if (update[i].forwards[i] != h){
                    return null;
                }
                update[i].forwards[i] = h.forwards[i];
            }
            this.length--;
        }
        return h == null ? null : h.value;
    }

    public T get(int key) {
        Node<T> h = this.head;
        // 拿到头结点之后, 从最顶层开始遍历, 进行类二分查找的过程, 找到第一个比key小的节点
        for (int level = this.level - 1; level >= 0; level--) {
            while (h.forwards[level] != null && h.forwards[level].key < key) {
                h = h.forwards[level];
            }
        }

        // 定位到节点后还需要比较key是否相同
        h = h.forwards[0];
        if (h != null && h.key == key)
            return h.value;
        return null;
    }

    public static void main(String[] args) {
        SkipListT<Integer> skipList = new SkipListT<>();
        System.out.println("size:" + skipList.size());
        skipList.add(3, 3);
        skipList.add(4, 4);
        skipList.add(7, 7);
        skipList.add(9, 9);
        skipList.add(8, 8);
        skipList.add(10, 10);
        skipList.add(11, 11);
        skipList.add(12, 12);
        skipList.add(13, 13);
        skipList.add(20, 20);
        skipList.add(21, 21);
        skipList.add(22, 22);
        skipList.add(23, 23);
        skipList.add(24, 24);
        final Integer i = skipList.get(10);
        System.out.println(i);
//        skipList.add(1
    }

}
