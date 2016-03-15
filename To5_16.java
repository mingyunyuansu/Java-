import java.util.Scanner;

/**
 * Created by 俊杰 on 2016/3/15.
 */
public class To5_16 {
    public static void main(String[] args) {
        System.out.print("Enter a numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(), i, tmp = number;
        while (tmp != 1) {
            for (i = 2; i < tmp; i++) {
                if (tmp % i == 0) {
                    System.out.print(i + " ");
                    tmp /= i;
                    break;
                }
            }
            if(i == tmp && tmp < number){
                System.out.print(tmp);
                break;
            }
            else if (tmp == number){
                System.out.print("None factor of " + number);
                break;
            }
        }
    }
}


