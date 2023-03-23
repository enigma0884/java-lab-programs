import java.util.Scanner;

public class A2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and colums of matrix 1");
    int m = sc.nextInt();
    int n = sc.nextInt();

    System.out.println("Enter the rows and colums of matrix 2");
    int p = sc.nextInt();
    int q = sc.nextInt();

    if (n != p) {
      System.out.println("Matrix multiplication not possible");
      sc.close();
      return;
    }

    int a[][] = new int[m][n];
    int b[][] = new int[p][q];
    int c[][] = new int[m][q];

    System.out.println("Enter matrix 1 elements");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    System.out.println("Enter matrix 2 elements");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        b[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < q; j++) {

        c[i][j] = 0;
        for (int k = 0; k < n; k++) {
          c[i][j] = c[i][j] + a[i][k] * b[k][j];
        }
      }
    }

    System.out.println("Matrix after multiplication is");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < q; j++) {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
