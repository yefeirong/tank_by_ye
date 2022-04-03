package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/3/30 17:43
 * @describe:
 */
public class AddLinkList {
    public static class Node{
        int value;
        Node next;
        public Node(int data){
            value=data;
        }
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        Node node1 = reverse(node);
        while (node1!=null){
            System.out.println(node1.value);
            node1=node1.next;
        }
    }

    private static Node reverse(Node head) {
        Node pre = null;
        Node next = null;
        while (head !=null){
            next =head.next;
            head.next = pre;
            pre = head;
            head = next;

        }
        return pre;
    }
}
