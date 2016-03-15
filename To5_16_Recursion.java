import java.util.Scanner;

/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_16_Recursion {
    public static void factor(int number, int tmp, int n){
        if (tmp == 1 || n == number) {
            if (n >= number) System.out.print("None factor of " + number);
            return;
        }
        else if (tmp % n == 0 && n != number){
            System.out.print(n + " ");
            factor (number, tmp / n, 2);
        }
        else
            factor (number, tmp, n + 1);
    }
    public static void main(String[] args) {
        System.out.print("Enter a numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        factor(number, number, 2);
    }
}


