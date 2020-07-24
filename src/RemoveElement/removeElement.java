package RemoveElement;

/**
 * @description: 移除元素
 * @author: wwh
 * @create: 2020/7/23
 */
public class removeElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));

    }
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != val){
              nums[j] = nums[i];
              j++;
            }
        }
        for (int k = 0 ; k <j ;k++){
            System.out.println(nums[k]);
        }
        return j;
    }
}
