package JudgeCircle;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wwh
 * @create: 2020/8/28
 */
public class JudgeCircle {

    public static void main(String[] args) {

        String str = "LL";
        System.out.println(judgeCircle(str));

    }

    public static boolean judgeCircle(String moves) {
       int horizontal = 0;
       int vertical = 0;
        for (int i = 0 ;i<moves.length();i++){
            char  temp = moves.charAt(i);
           if (temp =='U'){
               vertical = vertical+1;
           }else if (temp == 'D'){
               vertical = vertical-1;
           }else if (temp == 'L'){
               horizontal = horizontal -1;
           }else if (temp =='R'){
               horizontal = horizontal+1;
           }else {
               return false;
           }
        }

        if (horizontal==0&&vertical==0){
            return true;
        }return false;
    }
}
