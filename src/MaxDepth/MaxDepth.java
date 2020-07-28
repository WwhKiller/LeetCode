package MaxDepth;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/28
 */
public class MaxDepth {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {


    }

    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left=maxDepth(root.left)+1;
        int right=maxDepth(root.right)+1;
        return Math.max(left,right);
    }


    public static void visit(TreeNode treeNode){
        System.out.println(treeNode.val + "  ");
    }
    public static void recursivePreOrder(TreeNode treeNode){
        if (treeNode == null) return;
        visit(treeNode);
        recursivePreOrder(treeNode.left);
        recursivePreOrder(treeNode.right);
    }


}
