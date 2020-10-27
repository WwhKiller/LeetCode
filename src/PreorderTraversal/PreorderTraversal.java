package PreorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树前序遍历
 * @author: wwh
 * @create: 2020/10/27
 */
public class PreorderTraversal {

    public static void main(String[] args) {
    }

    public  List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> integers = new ArrayList<>();

        preorder(integers,root);

        return integers;
    }

   static void  preorder(List<Integer> integers,TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        integers.add(treeNode.val);
        preorder(integers,treeNode.left);
        preorder(integers,treeNode.right);
    }

}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
