package DivisorGame;

/**
 * @description:
 * @author: wwh
 * @create: 2020/7/24
 */
public class divisorGame {

    public static void main(String[] args) {
        System.out.println(divisorGame(9));
    }

    public static boolean divisorGame(int N) {
        if (N ==1){
            return false;
        }
        int n = N;
        int i= 0;
        for (int j = 0 ;j < n;){
            int x =1 ;
            if (N%x==0){
                N = N-x;
                i++;
                x++;
                if (x >=n ||N <=1){
                    break;
                }
                continue;
            }
        }
        if (i%2==1){
            return true;
        }
        return false;
    }
}
