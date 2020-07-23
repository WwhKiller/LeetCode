package StrDuplicates;

import java.util.*;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/23
 */
public class StrDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
//        System.out.println(Arrays.toString(removeDuplicates(nums)));
//        System.out.println(Arrays.toString(setRemoveDuplicates(nums)));

//        System.out.println(sortRemoveDuplicates(nums));
        System.out.println(setRemoveDuplicates(nums));
    }
    public  static int setRemoveDuplicates(int[] nums){
        Set set = new HashSet();
        for (int i =0; i < nums.length ; i++){
           set.add(nums[i]);
        }
        return set.size();
    }


    public static int sortRemoveDuplicates(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int k = 0 ; k <= i ;k++){
            System.out.println(nums[k]);
        }
        return i+1;
    }
}
