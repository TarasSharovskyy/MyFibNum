import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public int n;
    public static int u;
    public double isEven = 0;
    public double isOdd = 0;
    public static BigInteger fibonacci2(int n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        if (n<2){
            return a;
        }
        BigInteger c = null;
        while(n-- >=2){
            c=a.add(b);
            a=b;
            b=c;
        }
        return c;
    }
    public static void myElement(int u) {
        System.out.println("element #" + u + " " + fibonacci2(u - 1));
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter a positive number: ");
            while (!sc.hasNextInt()) {
                System.out.println("That`s not a number!");
                System.out.println("Please enter a positive number: ");
                sc.next();
            }
            main.n = sc.nextInt();
        } while (main.n <= 0);
        for (int i = 0; i < main.n; i++) {
            System.out.println(i + " - " + fibonacci2(i));
            if (fibonacci2(i).testBit(1)) {
                main.isEven++;
            } else {
                main.isOdd++;
            }
        }
        System.out.println(" ");
        System.out.println("even - " + ((main.isEven / main.n) * 100) + "%");
        System.out.println("odd - " + ((main.isOdd / main.n) * 100) + "%");
        System.out.println(" ");
        Scanner sc2 = new Scanner(System.in);
        do {

            System.out.println("Please enter a number FROM 1 to " + main.n);
            while (!sc2.hasNextInt()) {
                System.out.println("That`s not a number!");
                System.out.println("Please enter a positive number: ");
                sc2.next();
            }
            main.u = sc2.nextInt();
        } while (main.u <= 0 || main.u > main.n);
        myElement(u);
    }
}