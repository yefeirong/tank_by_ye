package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/4/3 11:58
 * @describe:
 */
public class LinkListMerge {
    class Node{
        int value;
        Node next;
        public Node(int data){
            value=data;
        }
    }
    public Node linkListMerge(Node node1,Node node2){
        if (node1==null||node2==null){
            return node1==null?node2:node1;
        }
        //寻找最小头
        Node head = node1.value <= node2.value ? node1 : node2;
        //指针移动到下一个节点,给个变量抓住当前头的引用

        Node cur1 =head.next;
        //找另一条链表的头
        Node cur2 =head ==node1?node2:node1;
        Node pre = head;
        while (cur1!=null&&cur2!=null){
            //找cur1 cur2 小头
            pre.next = cur1.value<=cur2.value?cur1:cur2;
            //被引用掉的较小节点  移动到下一个位置
            if (cur1==pre.next){
                cur1=cur1.next;

            }else {
                cur2=cur2.next;
            }
            pre=pre.next;
        }

        //当有一个链表节点走到空
        pre.next=cur1==null?cur2:cur1;
        return head;
    }

}
