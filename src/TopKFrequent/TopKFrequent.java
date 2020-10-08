package TopKFrequent;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/7
 */
public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k =2 ;

            int[] ints = topKFrequent(nums, k);
            for (int i = 0 ;i<ints.length;i++){
                System.out.println(ints[i]);
            }
    }

    public static  int[] topKFrequent(int[] nums, int k) {
        int[] array = new int[k];
        for (int i = 0 ;i < nums.length;i++){
            if (i>k-1){
                break;
            }
            for (int j = i ; j< nums.length ; j++){
                if (nums[i]==nums[j]) {
                    array[i]++;
                }
            }
        }
        return array;
    }
}
