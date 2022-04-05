package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/4/4 12:14
 * @describe:
 */
public class BuildTree {
    static class Node{
        int value;
        Node left;
        Node right;
        public Node(int data){
            value=data;
        }
    }

    //两个数组，一个先序数组，一个中序数组，每个数组里的值不重复, 通过这两个数组建立起来二叉树
    public static Node buildTree(int[] pre,int[] in){
        if (pre==null||in==null||pre.length!=in.length){
            return null;
        }
        return f(pre,0,pre.length-1,in,0,in.length-1);
    }

    public static Node f(int[] pre,int L1,int R1,int[] in,int L2,int R2){
        if (L1>R1){
            return null;
        }
        Node head = new Node(pre[L1]);
        if (L1==R1){
            return head;
        }
        int find = L2;
        while (in[find]!=pre[L1]){
            find++;
        }
       head.left =  f(pre,L1+1,L1+find-L2,in,L2,find-1);
        head.right = f(pre,L1+find-L2+1,R1,in,find+1,R2);
        return head;
    }
}
