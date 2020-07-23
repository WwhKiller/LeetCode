package Sort.SelectionSort;

import java.util.Arrays;

/**
 * @description: 选择排序
 * @author: wwh
 * @create: 2020/7/22
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array ={2,3,1,5,6,4};

        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public  static  int[] selectionSort(int[] array){
        for (int j = 0; j< array.length;j++) {
            int minIndex = j;
            //找出最小的标
            for (int i = j+1; i < array.length; i++) {
                if (array[minIndex] > array[i]) {
                   minIndex = i;
                }
            }
            //最小的下标，和最前面的数进行交换
            int temp = array[j];
            array[j] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
