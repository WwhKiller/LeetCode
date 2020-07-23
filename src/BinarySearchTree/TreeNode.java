package BinarySearchTree;

import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/21
 */
 public class TreeNode {
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
class Solution {
    public List<TreeNode> generateTrees(int n) {
        TreeNode root = null;
        List<TreeNode> treeNodes = null;
         if ( n == 0){
             return treeNodes;
         }
         if ( n == 1 ){
             TreeNode treeNode = new TreeNode(n);
             treeNodes.add(treeNode);
             return treeNodes;
         }
         if ( n >= 2){

            for (int i = 1 ; i <= n ;i++){
                TreeNode insertNode = new TreeNode(i);
                if (root == null){
                    root = insertNode;
                }
                TreeNode parent = new TreeNode();
                TreeNode current = root;
                while (true){
                    parent = current;
                    if (i > current.val){
                        current = current.right;
                        if (current == null){
                            parent.right = insertNode;
                            break;
                        }
                    }
                    else {
                        current = current.left;
                        if (current == null){
                            parent.left = insertNode;
                            break;
                        }
                    }

                }
            }
         }
return null;
    }
}