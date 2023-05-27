import java.util.Scanner;

public class FloatCheck {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextFloat();
        System.out.println("Enter second number");
        b = sc.nextFloat();
        System.out.println("Enter third number");
        c = sc.nextFloat();

        float max = Math.max(Math.max(a, b), c);
        if (max == a) {
            System.out.println("a is maximum: " + a);
        } else if (max == b) {
            System.out.println("b is maximum: " + b);
        } else {
            System.out.println("c is maximum: " + c);
        }
    }

}
