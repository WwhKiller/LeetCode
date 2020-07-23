package SwapNum;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/22
 */
public class SwapNum {
    public static void main(String[] args) throws InterruptedException {

        int a = 1 ,b = 2;
        Long startTime  = System.currentTimeMillis();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("a = "+ a+"   b = "+b + "    用时:"+ (System.currentTimeMillis()-startTime) );
    }

}
