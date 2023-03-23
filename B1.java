import java.util.Scanner;

public class B1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the values of a b c one by one");
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    double root1, root2;

    if (a == 0 && b == 0) {
      System.out.println("No solution");
    } else if (a == 0) {
      System.out.println("Linear equation root = " + (-c / b));
    } else {

      int d = b * b - 4 * a * c;
      if (d > 0) {
        System.out.println("The roots are real and distinct");
        root1 = (-b + Math.sqrt(d)) / (2 * a);
        root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Root 1 = " + root1 + " Root 2 = " + root2);

      } else if (d == 0) {
        System.out.println("The roots are real and equal");
        root1 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("Root 1 = Root 2 = " + root1);

      } else {
        System.out.println("No real solution. The roots are imaginary");
      }
    }

    sc.close();
  }
}
