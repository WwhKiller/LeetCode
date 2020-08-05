package AddStrings;

import java.math.BigInteger;

/**
 * @description: LeetCode :  415. 字符串相加
 * @author: wwh
 * @create: 2020/8/4
 */
public class AddStrings {
    public static void main(String[] args) {
        String num1= "3876620623801494171";
        String num2 = "6529364523802684779";

        System.out.println(addStrings(num1, num2));

    }

    public static String addStrings(String num1, String num2) {

        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();

    }
}
