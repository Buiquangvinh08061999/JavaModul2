package _10_dsa_list.practice.linkedlist_simple;



import org.w3c.dom.Node;

public class MyLinkedList {
    private Node head;
    private  int numNodes = 0;

    public  MyLinkedList(Object data){
        head = new Node(data);
    }
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }

        /*add: thêm đối tượng vào vị trí trong danh sách */
        public void add(int index, Object data){
            Node teamp = head;
            Node holder;

            for (int i =0; i < index -1 && teamp.next != null; i++){
                teamp =teamp.next;
            }
            holder = teamp.next;
            teamp.next = new Node(data);
            teamp.next.next = holder;
            numNodes ++;
        }

        /*addFirt: thêm đối tượng vào vị trí đầu tiên*/
        public void addFirt(Object data){
            Node teamp = head;
            head = new Node(data);
            head.next = teamp;
            numNodes++;
        }

        /*Mục đích: Lấy phần tử ở vị trí index từ danh sách*/
        public Node get(int index){
            Node teamp = head;
            for (int i=0; i<index;i++){
                teamp = teamp.next;
            }
            return teamp;
        }

        /*Mục đích: Hiển thị danh sách các phần tử trong danh sách*/
        public void printList(){
            Node teamp = head;
            while (teamp != null){
                System.out.println(teamp.data);
                teamp = teamp.next;
            }
        }
}


