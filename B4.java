abstract class Solid {
  abstract double getVolume();

  abstract double getSurfaceArea();

  double r, h;
}

class Cylinder extends Solid {
  @Override
  double getVolume() {
    return 3.14 * this.r * this.r * h;
  }

  @Override
  double getSurfaceArea() {
    return (2 * 3.14 * this.r * this.h) + (2 * 3.14 * this.r * this.r);
  }
}

class Cone extends Solid {
  @Override
  double getVolume() {
    return (3.14 * this.r * this.r) * (this.h / 3);
  }

  @Override
  double getSurfaceArea() {
    return 3.14 * this.r * (this.r + Math.sqrt((this.h * this.h) + this.r * this.r));
  }
}

class Sphere extends Solid {
  @Override
  double getVolume() {
    return 4 * 3.14 * this.r * this.r;
  }

  @Override
  double getSurfaceArea() {
    return (4 / 3) * 3.14 * this.r * this.r * this.r;
  }
}

public class B4 {
  public static void main(String[] args) {

    Cylinder cylinder = new Cylinder();
    cylinder.h = 12.5;
    cylinder.r = 19.2;

    System.out.println("Volume is " + cylinder.getVolume());
    System.out.println("Surface area is " + cylinder.getSurfaceArea());
  }
}
