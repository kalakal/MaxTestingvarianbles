import java.util.Scanner;

public class IntegersCheck {
    public static void main(String[] args) {

      int a,b,c;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b= sc.nextInt();
        System.out.println("Enter third number");
        c= sc.nextInt();

        int max = Math.max(Math.max(a, b),c);
        if (max == a) {
            System.out.println("a is maximum: " + a);
        } else if (max == b) {
            System.out.println("b is maximum: " + b);
        } else {
            System.out.println("c is maximum: " + c);
        }
    }
}
