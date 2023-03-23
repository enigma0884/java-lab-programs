class ComplexNumber {
  double real;
  double imag;

  ComplexNumber() {
    this.real = 0.0;
    this.imag = 0.0;
  }

  ComplexNumber(double real) {
    this.real = real;
    this.imag = 0.0;
  }

  ComplexNumber(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  ComplexNumber(ComplexNumber c) {
    this.real = c.real;
    this.imag = c.imag;
  }

  void add(ComplexNumber a1, ComplexNumber a2) {
    double realSum = a1.real + a2.real;
    double imagSum = a2.imag + a2.imag;

    System.out.println("Sum is: " + realSum + "+i" + imagSum);
  }

  void diff(ComplexNumber a1, ComplexNumber a2) {
    double realDiff = a1.real - a2.real;
    double imagDiff = a2.imag - a2.imag;

    System.out.println("Sum is: " + realDiff + "-i" + imagDiff);
  }
}

public class B2 {
  public static void main(String[] args) {

    ComplexNumber c1 = new ComplexNumber();
    ComplexNumber c2 = new ComplexNumber(12.5, 13.5);
    c1.add(c1, c2);
    c1.diff(c1, c2);
  }
}
