package Reverse;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:  数字反转
 * @author: wwh
 * @create: 2020/8/18
 */
public class Reverse {
    public static void main(String[] args) {
        int x =-123;

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if (x >= 0) {
            List list = new ArrayList<>();
            while (true) {
                list.add(x % 10);
                x = x / 10;
                if (x == 0) {
                    break;
                }
            }
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                str.append(list.get(i));
            }
            if (str.length()>31){
                return 0;
            }
            int rec=0;
            try {
                rec=Integer.valueOf(str.toString());
            }catch (Exception e){
                return 0;
            }
            return rec;
        }else {
            x= -x;
            List list = new ArrayList<>();
            while (true) {
                list.add(x % 10);
                x = x / 10;

                if (x == 0) {
                    break;
                }
            }
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                str.append(list.get(i));
            }
            if (str.length()>31){
                return 0;
            }
            int rec=0;
            try {
                rec=Integer.valueOf(str.toString());
            }catch (Exception e){
                return 0;
            }
            return -rec;
        }
    }

}
