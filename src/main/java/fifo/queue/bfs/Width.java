package fifo.queue.bfs;

public class Width {

    public Node head = new Node(0,0,0);
    public Node tail = new Node(0,0,0);

    /** 链表 */
    class Node{
        int x;
        int y;
        int step;
        Node next ;
        public Node(int x,int y,int step) {
            this.x =x;
            this.y = y;
            this.step = step;
        }
    }
    public static int[][] array = { { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 },
            { 0, 1, 0, 0 },
            { 0, 0, 0, 1 } };

    public static int [][] direction = { {0,1} ,
            {1,0} ,
            {0,-1} ,
            {-1,0} } ;

    public static int[][] book = new int[5][4];

    public void dfs() {
        head.next = tail;
        while(head!=null) {
            for(int i = 0;i<4;i++) {
                int tempx = head.x + direction[i][0];
                int tempy = head.y + direction[i][1];
                if(tempx<0 || tempx > 4 || tempy < 0||tempy > 3) {
                    continue;
                }
                if(book[tempx][tempy]==0&&array[tempx][tempy]!=1) {
                    Node node = new Node(tempx,tempy,head.step+1);
                    if(tempx==3 && tempy==2) {
                        System.out.println(node.step);
                        return;
                    }
                    tail.next = node;
                    tail = node;
                    book[tempx][tempy]=1;
                }
            }
            head = head.next;
        }
    }
    public static void main(String[] arg) {
        Width width = new Width();
        width.dfs();
    }



}
