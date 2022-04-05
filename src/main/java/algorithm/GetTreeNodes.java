package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: yefeirong
 * @date: 2022/4/4 17:34
 * @describe:
 */
public class GetTreeNodes {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            value=data;
        }
    }
    //按层遍历，并输出节点 https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return null;
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> curAns = new ArrayList<>();
            for (int i = 0; i < size ; i++){
                TreeNode curNode = queue.poll();
                if (curNode != null){
                    curAns.add(curNode.value);
                }
                if (curNode!=null){
                    queue.add(curNode.left);
                }
                if (curNode!=null){
                    queue.add(curNode.right);
                }
            }
            ans.add(0,curAns);
        }
        return ans;
    }
}
