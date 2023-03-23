import java.util.Scanner;

interface FixedDeposit {
  double getBalance();

  void calculateInterest();

  void getDetails();
}

class CanaraBank implements FixedDeposit {
  double roi = 0.5;
  double principal, interest, period;
  String name;
  Scanner sc = new Scanner(System.in);

  @Override
  public void getDetails() {
    System.out.println("Enter the name");
    name = sc.nextLine();

    System.out.println("Enter the principal amount");
    principal = sc.nextDouble();

    System.out.println("Enter the time period");
    period = sc.nextDouble();
    sc.close();
  }

  @Override
  public double getBalance() {
    return principal + interest;
  }

  @Override
  public void calculateInterest() {
    interest = (principal * period * roi) / 100;
  }
}

class AxisBank implements FixedDeposit {
  double roi = 0.8;
  double principal, interest, period;
  String name;
  Scanner sc = new Scanner(System.in);

  @Override
  public void getDetails() {
    System.out.println("Enter the name");
    name = sc.nextLine();

    System.out.println("Enter the principal amount");
    principal = sc.nextDouble();

    System.out.println("Enter the time period");
    period = sc.nextDouble();
  }

  @Override
  public double getBalance() {
    return principal + interest;
  }

  @Override
  public void calculateInterest() {
    interest = (principal * period * roi) / 100;
  }
}

public class A4 {
  public static void main(String[] args) {

    CanaraBank canara = new CanaraBank();
    // AxisBank axis = new AxisBank();

    canara.getDetails();
    canara.calculateInterest();

    System.out.println("The interest for canara bank is " + canara.interest);
    System.out.println("The balance is " + canara.getBalance());

    // same for axis
  }
}
