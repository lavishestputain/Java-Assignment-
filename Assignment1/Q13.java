// Q13 sum of natural numbers
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum: " + n * (n + 1) / 2);
    }
}