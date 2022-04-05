package algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: yefeirong
 * @date: 2022/4/3 17:28
 * @describe:
 */
public class MergeNLinkedList {


    public Node mergeLinkList(Node[] nodes) {
        if (nodes.length == 1) {
            return nodes[0];
        }
        //创建一个优先级队列，放入比较器
        PriorityQueue<Node> heap = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value-o2.value;
            }
        });
        //将数组里的头节点都放入优先级队列里
        Collections.addAll(heap, nodes);
        //拿到优先级队列里的 最小头节点
        Node head = heap.poll();
        Node pre = head;
        if (pre.next!=null){
            heap.add(pre.next);
        }
        Node cur =null;
        while (!heap.isEmpty()){
            cur =heap.poll();
            pre.next=cur;
            pre =cur;
            if (cur.next!=null){
                heap.add(pre);
            }
        }

        return head;
    }

static class Node {
        public int value;
        Node next;

        public Node(int data) {
            value = data;
        }
    }

// static class ComparaLinkList implements Comparator<Node> {
//
//        @Override
//        public int compareTo(Node o1, Node o2) {
//            return o1.value-o2.value;
//        }
//    }

}
