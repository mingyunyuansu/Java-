/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_20 {
    public static void main(String[] args) {
        int i, j, n = 0;
        boolean flag;
        for (i = 3; i <= 1000; ++i){
            flag = true;
            for (j = 2; j <= (int)Math.sqrt(i); ++j)
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            if (flag) {
                System.out.print(i + " ");
                ++n;
                if(n % 8 == 0)
                    System.out.println();
            }
        }
    }
}


