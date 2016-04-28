import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by robert on 16-4-28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String s = input.nextLine();
            Scanner st = new Scanner(s);
            double a = Double.parseDouble(st.next());
            String m = st.next();
            double b = Double.parseDouble(st.nextLine());
            double re = 0;
            switch (m) {
                case "+":
                    re = a + b;
                    break;
                case "-":
                    re = a - b;
                    break;
                case "/":
                    re = a / b;
                    break;
                case "*":
                    re = a * b;
                    break;
                default:
                    System.out.println("Wrong token");
                    exit(0);
            }
            System.out.print(re);
        } catch (NumberFormatException ex) {
            System.out.print("Wrong input");
            exit(1);
        }
    }
}
