package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/3/30 15:05
 * @describe:
 */
public class ReverseLinkList {
    public static class Node{
        int value;
        Node next;
        public Node(int data){
            value=data;
        }
    }
    public static Node reversLink(Node head){
        Node pre = null;
        Node next = null;
        while (head!=null){
            //把下一个节点指向一个引用，防止被回收
            next = head.next;;
            //将第一个节点的Next指向空，变成最后一个节点
            head.next=pre;
            //pre后移
            pre = head;
            //真正的Head节点后移一位
            head = next;
        }
        //pre反转后变成了最后一个节点的引用。所以返回Pre
        return pre;

    }

    public static void main(String[] args) {
        Node node = new Node(0);
        node.next = new Node(1);
        node.next.next = new Node(2);
//        while (node!=null){
//            System.out.print("++++"+node.value);
//            node=node.next;
//        }
        Node node2 = reversLink(node);
        while (node2!=null){
            System.out.print(node2.value);
            node2=node2.next;
        }
    }
}
