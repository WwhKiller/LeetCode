package ReverseString;

/**
 * @description: 344. 反转字符串
 * @author: wwh
 * @create: 2020/10/8
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};

        reverseString(chars);

        System.out.println(chars);


    }

    public static void reverseString(char[] chars) {
        for (int i = 0; i<chars.length/2;i++){
            char s;
            s = chars[chars.length-i-1];
            chars[chars.length-i-1] = chars[i];
            chars[i] = s;
        }
    }

}
