import java.util.Scanner;

public class A1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the basic salary");

    double basic = sc.nextDouble();
    double da = 0.4 * basic;
    double hra = 0.2 * basic;
    double cca = 250;
    double pf = 0.1 * basic;
    double pt = 100;

    double grossIncome = basic + da + hra + cca;
    double it = 0.1 * grossIncome;
    double deductions = pf + pt + it;

    double netIncome = grossIncome - deductions;

    System.out.println("The gross income is " + grossIncome + " and the net income is " + netIncome);
    sc.close();
  }
}