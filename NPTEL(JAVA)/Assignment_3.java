import java.util.Scanner;
public class Assignment_3 {
    static int factorial ( int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int x;
                x = in.nextInt();
                System.out.print(factorial(x));
            }
        }
