/*
 *  FILE:       QUADRILATERAL.JAVA
 *
 *  DATE:       SEPTEMBER 25, 2020
 *  CLASS:      IT 178
 */
package IT178.Inheritance;

public class Quadrilateral { //* QUADRILATERAL CLASS
  //* INSTANCES
  private Point p1, p2, p3, p4;

  public Quadrilateral(final double x1, final double y1, final double x2,
                       final double y2, final double x3, final double y3,
                       final double x4,
                       final double y4) { //* MODIFIED CONSTRUCTOR
                                          //* INITIALIZED INSTANCES TO POINT
    this.p1 = new Point(x1, y1);
    this.p2 = new Point(x2, y2);
    this.p3 = new Point(x3, y3);
    this.p4 = new Point(x4, y4);
  }

  //* SETTERS & GETTERS
  public Point getP1() { return p1; }
  public void setP1(final Point p1) { this.p1 = p1; }
  public Point getP2() { return p2; }
  public void setP2(final Point p2) { this.p2 = p2; }
  public Point getP3() { return p3; }
  public void setP3(final Point p3) { this.p3 = p3; }
  public Point getP4() { return p4; }
  public void setP4(final Point p4) { this.p4 = p4; }

  public String getCordinatesAsString() { //* RETURNS FORMATED CORDINATES
    return p1 + ", " + p2 + ", " + p3 + ", " + p4;
  }

  public String toString() { //* OVERRIDED STRING CLASS CALLING FORMATED CORDS
    return getCordinatesAsString();
  }
}
