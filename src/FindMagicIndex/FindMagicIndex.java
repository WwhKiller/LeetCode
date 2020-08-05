package FindMagicIndex;

/**
 * @description:
 * @author: wwh
 * @create: 2020/8/1
 */
public class FindMagicIndex {

    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 4, 5,6};

        System.out.printf(String.valueOf(findMagicIndex(nums)));

    }
    public static int findMagicIndex(int[] nums) {
        for (int i = 0 ; i <nums.length ; i++){
            if (nums[i] == i){
                return i;
            }
        }return -1;
    }
}
