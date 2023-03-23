class Box {
  int height;
  int width;

  Box(int height, int width) {
    System.out.println("Box constructor called");
    this.height = height;
    this.width = width;
  }
}

class BoxWeight extends Box {
  int depth;

  BoxWeight(int height, int width, int depth) {
    super(height, width);
    System.out.println("BoxWeight constructor called");
    this.depth = depth;
  }
}

class BoxShipment extends BoxWeight {
  int price;

  BoxShipment(int height, int width, int depth, int price) {
    super(height, width, depth);
    System.out.println("BoxShipment constructor called");
    this.price = price;
  }
}

public class B3 {
  public static void main(String[] args) {

    new BoxShipment(12, 13, 17, 18);
  }
}
