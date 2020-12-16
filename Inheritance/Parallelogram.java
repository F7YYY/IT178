/*
 *  FILE:       PARRALLELOGRAM.JAVA
 *
 *  DATE:       SEPTEMBER 25, 2020
 *  CLASS:      IT 178
 */
package IT178.Inheritance;

import java.text.DecimalFormat;

public class Parallelogram
    extends Trapezoid { //* PARALLELOGRAM INHERITING TRAP_CLASS

  public Parallelogram(final double x1, final double y1, final double x2,
                       final double y2, final double x3, final double y3,
                       final double x4,
                       final double y4) { //* MODIFIED CONSTRUCTOR
                                          //* INITIALIZED QUADRILATERAL INSTANES
    super(x1, y1, x2, y2, x3, y3, x4, y4);
    getWidth();
  }

  public double getWidth() {
    return w = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2) +
                         Math.pow((getP2().getY() - getP1().getY()), 2));
  } //* WIDTH CALQULIMATUN

  public double area() { return w * h; } //* AREA CALQULIMATUN

  public String toString() { //* OVERRIDED STRING CLASS RETURNING CALQULIMATUNZ
    DecimalFormat dp = new DecimalFormat(".0");
    return super.toString() + "\nWidth: " + dp.format(w);
  }
}
