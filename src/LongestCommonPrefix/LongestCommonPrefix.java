package LongestCommonPrefix;

/**
 * @description: LeetCode :14. 最长公共前缀
 * @author: wwh
 * @create: 2020/8/20
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aca","cba"};

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        StringBuffer str = new StringBuffer(strs[0]);
        StringBuffer temp = new StringBuffer();
        for (int i = 1 ;i<strs.length;i++){
            int min =str.length()>strs[i].length()? strs[i].length(): str.length();
            for (int j=0; j < min;j++){
                if (str.charAt(j)==strs[i].charAt(j)){
                    temp.append(strs[i].charAt(j));
                }else {
                    break;
                }
            }
            str =temp;
            temp=new StringBuffer("");
        }
        return str.toString();
    }
}
