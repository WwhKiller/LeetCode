package LetterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: leetCode :17. 电话号码的字母组合
 * @author: wwh
 * @create: 2020/8/26
 */
public class LetterCombinations {

    public static void main(String[] args) {
        String str ="32";
        letterCombinations(str);
    }

    public static List<String> letterCombinations(String digits) {
        Map dictMap = new HashMap<Integer,String>();
        dictMap.put(2,"abc");
        dictMap.put(3,"def");
        dictMap.put(4,"ghi");
        dictMap.put(5,"jkl");
        dictMap.put(6,"mno");
        dictMap.put(7,"pqrs");
        dictMap.put(8,"tuv");
        dictMap.put(9,"wxyz");

        List list = new ArrayList<>();
        List returnList = new ArrayList<>();

        for (int i = 0 ; i<digits.length();i++){
            list.add(dictMap.get(Integer.valueOf(String.valueOf(digits.charAt(i)))));
        }



        return returnList;

    }

}
