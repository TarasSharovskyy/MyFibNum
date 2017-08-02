import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public long n;
    public long i;


    public static BigInteger fibonacci2(long n) {

        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }

        return (a);

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please enter a positive number: ");
            while(!sc.hasNextLong()){
                System.out.println("That`s not a number!");
                System.out.println("Please enter a positive number: ");
                sc.next();
            }
            main.n = sc.nextLong();
        } while (main.n <= 0);

        for (long i = 0; i < main.n; i++) {
            System.out.println(i+" - " +fibonacci2(i));
        }

    }
}
