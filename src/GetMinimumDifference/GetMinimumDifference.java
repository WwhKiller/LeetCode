package GetMinimumDifference;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/10/12
 */
public class GetMinimumDifference {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root_right = new TreeNode(3);
        TreeNode root_right_left = new TreeNode(2);

        root.right = root_right;
        root_right.left = root_right_left;

      getMinimumDifference(root);

    }

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(values,root);
        int result  = (Integer) values.get(values.size()-1)  - (Integer) values.get(0);
        return result;
    }

    public static  void inorder(List<Integer> list,TreeNode root){
        if (root==null) return ;
        System.out.println(root.val);
        list.add(root.val);
        inorder(list,root.left);
        inorder(list,root.right);
    }

}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}