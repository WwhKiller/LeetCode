package Sort.InsertionSort;

import java.util.Arrays;

/**
 * @description: 插入排序： 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插
 * @author: wwh
 * @create: 2020/7/23
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array ={2,8,3,9,1,5,6,7,4};

        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static  int[] insertionSort(int[] array){
        for (int i =1; i < array.length; i++){
            for (int j = 0;j < i;j++){
                if (array[i] < array[j]){
                    array[j] = array[i];

                }
            }
        }
       return array;
    }
}
