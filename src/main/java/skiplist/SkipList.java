//package skiplist;
//
//public class SkipList<E extends Comparable<E>> {
//
//    private int length;
//    public int MAX_LEVEL = 16;
////    public int maxLevel;
//
//    public int currentLevel;
//
//    public final SkipNode head;
//
//    public SkipList(){
//        this.currentLevel = 1;
////        this.maxLevel = maxLevel;
////        this.currentLevel = currentLevel;
//        head = new SkipNode(  MAX_LEVEL);
//    }
//
//    public int getRandomLevel(){
//        int level =1;
//        while(Math.random()<0.5&&level<MAX_LEVEL){
//            level++;
//        }
//        return level;
//    }
//
//    public boolean seatch(E value){
//        SkipNode<E> c = this.head;
//        for (int i=currentLevel-1;i>=0;i--) {
//            //从上往下找，找到第一个比key小的节点
//            while ((c.next[i]!=null) && (c.next[i].value.compareTo(value) < 0)) {
//                c = c.next[i];
//            }
//        }
//        if((c.next[0]!=null)&&(c.next[0].value.compareTo(value)==0)){
//            return true;
//        }
//        return false;
//    }
//
//    public void insert(E value){
//        int newLevel = getRandomLevel();
////        SkipNode<E> newNode = new SkipNode<>(value,  newLevel);
//        SkipNode<E>[] update = new SkipNode[];
//        SkipNode<E> curr = head;
//        for (int i = currentLevel - 1; i >= 0; i--) {
//            while (curr.next[i] != null && curr.next[i].value.compareTo(value) < 0) {
//                curr = curr.next[i];
//            }
//            update[i] = curr;
//        }
//        if(newLevel>currentLevel){
//            for(int i = currentLevel;i<newLevel;i++){
//                update[i] = head;
//            }
//            currentLevel = newLevel;
//        }
//        for (int i = 0; i < newLevel; i++) {
//            newNode.next[i] = update[i].next[i];
//            update[i].next[i] = newNode;
//        }
//    }
//    public void delete(E value){
//        SkipNode<E>[] update = new SkipNode[currentLevel];
//        SkipNode<E> curr = head;
//        for (int i = currentLevel - 1; i >= 0; i--) {
//            while (curr.next[i] != null && curr.next[i].value.compareTo(value) < 0) {
//                curr = curr.next[i];
//            }
//            update[i] = curr;
//        }
//        if(curr.next[0]!=null && curr.next[0].value.compareTo(value) == 0){
//            for (int i = 0; i < currentLevel; i++) {                                         // 从顶层开始删除
//                if (update[i].next[i] != null && update[i].next[i].value.equals(value)) {   // 如果该层存在待删除元素
//                    update[i].next[i] = update[i].next[i].next[i];                         // 将待删除元素的后继接到前驱上
//                }
//            }
//        }
//        while (currentLevel>1&&head.next[currentLevel-1] == null){
//            currentLevel--;
//        }
//    }
//    public static void main(String[] args) {
//        SkipList<Integer> skipList = new SkipList<>();
//        skipList.insert(1);
//        skipList.insert(2);
//        skipList.insert(3);
//        skipList.insert(4);
//        skipList.insert(5);
//        System.out.println(skipList.getRandomLevel());
//    }
//}
