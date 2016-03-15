import java.util.Scanner;

/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_14 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int smaller = a < b ? a : b;
        while(smaller != 1){
            if(a % smaller == 0 && b % smaller == 0)
                break;
            smaller --;
        }
        System.out.printf("The GCD of %d and %d is %d", a, b, smaller);
    }
}

