/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_3 {
    public static void main( String [] args ){
        System.out.print("千克\t\t\t磅\n");
        for(int i = 1; i < 200; i++){
            System.out.printf("%-4d\t%5.1f\n", i, i * 2.2);
        }
    }
}
