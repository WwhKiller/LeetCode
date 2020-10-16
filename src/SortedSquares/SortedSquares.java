package SortedSquares;

import java.util.*;

/**
 * @description: 977. 有序数组的平方
 * @author: wwh
 * @create: 2020/10/16
 */
public class SortedSquares {

    public static void main(String[] args) {
        int[] A = {-4,-2,0,3,10};
        System.out.println(sortedSquares(A).toString());
    }

    public static int[] sortedSquares(int[] A) {

        for (int i = 0; i<A.length; i++){

            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
