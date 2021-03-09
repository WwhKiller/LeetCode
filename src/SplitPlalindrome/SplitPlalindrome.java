package SplitPlalindrome;


import java.util.HashMap;
import java.util.Objects;

/**
 *
 * LeetCode : 132. 分割回文串
 *
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是回文。
 *
 * 返回符合要求的 最少分割次数 。
 *
 * 示例 1：
 *
 *  输入：s = "aab"
 *  输出：1
 *  解释：只需一次分割就可将 s 分割成 ["aa","b"] 这样两个回文子串。
 *  示例 2：
 *
 *  输入：s = "a"
 *  输出：0
 *  示例 3：
 *
 *  输入：s = "ab"
 *  输出：1
 *
 *  来源：力扣（LeetCode）
 *  链接：https://leetcode-cn.com/problems/palindrome-partitioning-ii
 *  著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 */
public class SplitPlalindrome {

    public int minCut (String s){

        if (s.length() <= 1){
            return 0;
        }

        for (int i = 0; i<s.length();i++){
            
        }




        return 0;

    }

    public static void main(String[] args) {

        HashMap  hashMap = new HashMap();

        hashMap.hashCode();

        String str = "DogDogChild";

        String str1 = "";
        System.out.println("DogDogChild hashCode = " + Objects.hashCode(str));
        System.out.println("DogDogChild hashCode = " + str.hashCode());


        System.out.println(Objects.hashCode(str1));
        System.out.println(str1.hashCode());
    }

}
