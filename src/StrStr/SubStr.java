package StrStr;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/22
 */
public class SubStr {

    public static void main(String[] args) {

        String haystack ="a";
        String needle = "a";

        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i<= haystack.length() - needle.length(); i++){
            if (haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
