import java.util.Scanner;

class Sort {

  void ascending(int arr[]) {
    int temp;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  void descending(int arr[]) {
    int temp;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}

public class A3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");

    int num = sc.nextInt();
    System.out.println("Enter " + num + " elements");
    int arr[] = new int[num];

    for (int i = 0; i < num; i++) {
      try {
        arr[i] = sc.nextInt();
      } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
      }
    }

    Sort s = new Sort();
    System.out.println("Ascending order");
    s.ascending(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }

    System.out.println();

    System.out.println("Descending order");
    s.descending(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }

    sc.close();
  }
}