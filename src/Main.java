import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger fibonacci2(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return fibonacci2(n - 2).add(fibonacci2(n - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Please enter a positive number: ");
            while(!sc.hasNextInt()){
                System.out.println("That`s not a number!");
                System.out.println("Please enter a positive number: ");
                sc.next();
            }
            num = sc.nextInt();
        } while (num <= 0);

        for (int i = 0; i < num; i++) {
            System.out.println(i+" - " +fibonacci2(i));
        }

    }
}
