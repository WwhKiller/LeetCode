package ArrayMinNun;

import java.util.Arrays;

/**
 * @description: 倒转二分法
 * @author: wwh
 * @create: 2020/7/22
 */
public class minArray {

    public static void main(String[] args) {
        int[] numbers = {3 ,2 ,5,4,1};
        System.out.println(dichotomy(numbers));
    }

    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);

        System.out.println(numbers.toString());
        return numbers[0];
    }

    public static int dichotomy(int[] numbers) {
        int low = 0,high = numbers.length -1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            }
            else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            }
            else {
                high -= 1;
            }
        }
        return numbers[low];

    }
}
