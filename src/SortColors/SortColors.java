package SortColors;

/**
 * @description: 75. 颜色分类
 * @author: wwh
 * @create: 2020/10/8
 */
public class SortColors {

    public static void main(String[] args) {
        int[] nums = {0,2,1,2,3,0};

        sortColors(nums);
        for (int num :nums) {
            System.out.println(num);
        }
    }

    public  static void sortColors(int[] nums) {
        int index;
        for (int i = 0 ; i < nums.length-1; ){
            if(nums[i+1] < nums[i]){
                index = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = index;
                i=0;

            }else {
                i++;
            }
        }

    }
}
