package RomanToInt;

/**
 * @description: 罗马数字转化为Int
 * @author: wwh
 * @create: 2020/7/23
 */
public class RomanToInt {
    public static void main(String[] args) {

        String str = "MCMXCIV";

        System.out.println(romanToInt(str));

    }

    public static  int romanToInt(String s){
        int sum = 0;
        int preNum = singleStringToInt(s.charAt(0));
        for (int i = 1; i < s.length();i++){
            int num = singleStringToInt(s.charAt(i));
            if (preNum < num){
                sum -= preNum;

            }else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    public static  int singleStringToInt(char s){
        switch(s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
