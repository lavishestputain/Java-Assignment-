// Swap
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a; a = b; b = temp;
        System.out.println("After Swap: " + a + ", " + b);
    }
}