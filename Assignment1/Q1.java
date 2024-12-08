//Question 1 Temp conversion
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().charAt(0);
        switch (unit) {
            case 'C':
                System.out.println("Fahrenheit: " + ((temp - 32) * 5/9));
                break;
            case 'F':
                System.out.println("Celsius: " + (temp * 9/5 + 32));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}