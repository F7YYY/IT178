/*
 *  FILE:       SQUARE.JAVA
 *
 *  DATE:       SEPTEMBER 25, 2020
 *  CLASS:      IT 178
 */
package IT178.Inheritance;

public class Square extends Parallelogram { //* SQUARE INHERITING QUAD_CLASS

  public Square(final double x1, final double y1, final double x2,
                final double y2, final double x3, final double y3,
                final double x4, final double y4) { //* MODIFIED CONSTRUCTOR
    //* INITIALIZED INSTANCES WITH QUADRILATERAL
    super(x1, y1, x2, y2, x3, y3, x4, y4);
  }

  public double area() { return 4 * w; } //* CALQULIMATUN

  public String toString() { //* OVERRIDED STRING CLASS RETURNING CALQULIMATUNZ
    return super.toString();
  }
}
