package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/3/30 17:06
 * @describe:
 */
public class DoubleReverseLinkList {
    public static class Node{
        int value;
        Node next;
        Node last;
        public Node(int data){
            value=data;
        }
    }


//计算链表长度
    public static int linkedLen(Node head){
        int num =0;
        while (head!=null){
            num++;
            head=head.next;
        }
        return num;
    }
    //两个链表相加
    public static Node  addLinkList(Node node1,Node node2){
        //通过长短 区分长短链表
        int len1 = linkedLen(node1);
        int len2 = linkedLen(node2);
        Node nodeL = len1>=len2?node1:node2;
        Node nodeS = len1<=len2?node1:node2;
        //变量 进位信息
        int carry = 0;
        //变量 竖列求和
        int num = 0;
        //最后阶段的寻址变量
        Node last =null;
        //第一阶段  L有S有
        while (nodeS!=null){
            num = nodeS.value+nodeL.value+carry;
            nodeL.value=num%10;
            carry = num/10;
            last = nodeL;
            nodeS=nodeS.next;
            nodeL=nodeL.next;
        }
        //第二阶段 L有S无
        while (nodeL!=null){
            num = nodeL.value+carry;
            nodeL.value=num%10;
            carry = num/10;
            last=nodeL;
            nodeL=nodeL.next;
        }
        //第三阶段 L无S无
        if (carry!=0){
            last.next = new Node(carry);
        }
        return nodeL;




    }
    public static void main(String[] args) {
        Node node1 =new Node(1);
        node1.next = new Node(2);
        node1.next.next=new Node(3);
//        Node node2 = reverseList(node1);
//        while (node2!=null){
//            System.out.println(node2.value);
//            node2=node2.next;
//        }
        System.out.println(linkedLen(node1));
    }
}
