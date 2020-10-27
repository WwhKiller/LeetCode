package SmallerNumbersThanCurrent;

/**
 * @description:
 * @author: wwh
 * @create: 2020/10/26
 */
public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};

        System.out.println(smallerNumbersThanCurrent(nums));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] array = new int[nums.length];

         for (int i=0;i<nums.length;i++){
             int temp = 0;
             for (int j = 0;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    temp++;
                }
             }array[i]=temp;
         }
         return array;
    }
}
