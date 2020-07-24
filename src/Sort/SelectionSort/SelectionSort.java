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
        for (int i = 0; i <array.length; i++){
            int minIndex = i;
            for (int j = i ; j < array.length ;j++){
                if ( array[j]<array[minIndex] ){
                    minIndex = j;
                }
            }
            int temp  = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return  array;
    }
}
