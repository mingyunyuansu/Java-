import java.util.Scanner;

/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_17 {
    public static void main(String[] args) {
        System.out.print("Enter a numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(), i, j, t;
        for (i = 1; i <= number; ++i) {
            for (j = number; j > i; --j) {
                System.out.print("  ");
            }
            t = i;
            while (t >= 1) {
                System.out.print(t + " ");
                --t;
            }
            t = 2;
            while (t <= i) {
                System.out.print(t + " ");
                ++t;
            }
            System.out.print("\n");
        }
    }
}


