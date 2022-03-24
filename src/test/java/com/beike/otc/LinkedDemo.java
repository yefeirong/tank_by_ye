package com.beike.otc;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author: yefeirong
 * @date: 2021/7/20 17:14
 * @describe:
 */
public class LinkedDemo {
   public static class Node{
       private Node next;
       private T t;
       public Node(T t,Node next){
           this.next = next;
           this.t = t;
       }

       public Node getNext() {
           return next;
       }

       public void setNext(Node next) {
           this.next = next;
       }

       public T getT() {
           return t;
       }

       public void setT(T t) {
           this.t = t;
       }
   }
   public static Node reverseListNode(Node head){
       if (head==null || head.getNext()==null){
           return head;
       }
       Node preNode = null;
       Node curNode = head;
       Node nextNode = null;
       while (curNode!=null){
           nextNode = curNode.getNext();
           curNode.setNext(preNode);
           preNode = curNode;
           curNode = nextNode;
       }
        return preNode;
   }

}
