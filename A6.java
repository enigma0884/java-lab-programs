import java.util.Scanner;

class Stack<E> {
  E stack[];
  int top = -1;
  final int size = 10;

  @SuppressWarnings("unchecked")
  Stack() {
    this.stack = (E[]) new Object[this.size];
  }

  void push(E item) {
    if (this.top == this.size - 1) {
      System.out.println("Stack overflow");
      return;
    }

    stack[++top] = item;
    System.out.println(stack[top] + " pushed into the stack");
  }

  void pop() {
    if (this.top == -1) {
      System.out.println("Stack underflow");
    } else {
      System.out.println(this.stack[this.top--] + " popped from the stack");
    }
  }

  void display() {
    for (int i = 0; i < this.top; i++) {
      System.out.println(stack[i]);
    }
  }
}

public class A6 {
  public static void main(String[] args) {

    Stack<Integer> s = new Stack<Integer>();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int num = sc.nextInt();

    System.out.println("Enter " + num + " elements");

    for (int i = 0; i < num; i++) {
      s.push(sc.nextInt());
    }

    s.pop();
    s.pop();

    s.display();
    sc.close();

  }
}
