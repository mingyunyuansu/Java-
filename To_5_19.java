/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_19 {
    public static void main(String[] args) {
        int i, j, t;
        for (i = 0; i <= 7; ++i){
            for (j = 7 - i; j > 0; --j) {
                System.out.print("    ");
            }
            for (t = 0; t <= i; ++t){
                System.out.printf("%4d", (int)Math.pow(2, t));
            }
            --t;
            for (--t; t >= 0; --t){
                System.out.printf("%4d", (int)Math.pow(2, t));
            }
            System.out.println();
        }
    }
}


