package PredictTheWinner;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/9/1
 */
public class PredictTheWinner {
    public static void main(String[] args) {
        int[] array = {1,5,233,7};
        System.out.println(PredictTheWinner(array));

    }
    public static boolean PredictTheWinner(int[] nums) {
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        int head = 0;
        int tail = nums.length-1;

        for (int i=0;i<nums.length;i++){

            if (nums[head]>nums[tail]) {
                if (i%2==0){
                    player1.add(nums[head]);
                }else {
                    player2.add(nums[head]);
                }
                head = head+1;

            }else {
                if (i%2==0){
                    player1.add(nums[tail]);
                }else {
                    player2.add(nums[tail]);
                }
                tail = tail-1;
            }
            if (head>tail){
                break;
            }
        }
        Integer sumPlayer1 =0;
        Integer sumPlayer2 =0;
        for (Integer single:player1){
            sumPlayer1 = single+sumPlayer1;
        }
        for (Integer single:player2){
            sumPlayer2 = single+sumPlayer2;
        }

        return sumPlayer1>=sumPlayer2;

    }
}
