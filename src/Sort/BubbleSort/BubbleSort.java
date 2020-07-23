package Sort.BubbleSort;

import java.util.Arrays;

/**
 * @description:  冒泡排序 ：比较相邻两个位置，如果大（或者小）就交换位置
 *                时间复杂度：O（n^2） 空间复杂度：O(1)  稳定
 * @author: wwh
 * @create: 2020/7/22
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array ={2,8,3,9,1,5,6,7,4};

        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array){
        for (int i = 0 ;i < array.length ;i++){
            for (int j = i+1; j< array.length ; j++){
                if (array[i] > array[j]){
                   /* temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;*/
                   array[i] = array[i]^array[j];
                   array[j] = array[i]^array[j];
                   array[i] = array[i]^array[j];
                }
            }
        }
        return array;
    }
}
