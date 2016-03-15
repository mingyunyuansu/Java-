import java.util.Scanner;

/**
 * Created by 俊杰 on 2016/3/3.
 */
public class TYPETEST {
    public static void main(String[] args) {
        int number, sum = 0, positives = 0, negatives = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers, the input ends if it is 0:");
        do{
            number = input.nextInt();
            if(number < 0)
                positives ++;
            if(number > 0)
                negatives ++;
            sum += number;
        } while(number != 0);
        System.out.println("The number of positive is " + positives);
        System.out.println("The number of negative is " + negatives);
        System.out.println("The total is " + sum);
        System.out.print("The average is " + (double)sum / (positives + negatives));
    }
}