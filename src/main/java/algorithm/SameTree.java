package algorithm;

/**
 * @author: yefeirong
 * @date: 2022/4/3 22:43
 * @describe:
 */
public class SameTree {
    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            value=data;
        }
    }


    public boolean isSameTree(TreeNode tree1,TreeNode tree2){
        if (tree1==null ^ tree2==null){
            return false;
        }
        if (tree1 == null && tree2 ==null){
            return true;
        }

        return tree1.value== tree2.value && isSameTree(tree1.left,tree2.left) && isSameTree(tree1.right,tree2.right);
    }
}
