/*
 *  FILE:       POINT.JAVA
 *
 *  DATE:       SEPTEMBER 25, 2020
 *  CLASS:      IT 178
 */
package IT178.Inheritance;

public class Point { //* POINT CLASS
  //* INSTANCES
  private double x, y;

  public Point(final double x, final double y) { //* MODIFIED CONSTRUCTOR
    //* INITIALIZED INTANCES
    this.x = x;
    this.y = y;
  }

  //* SETTERS & GETTERS
  public double getX() { return x; }
  public void setX(final double x) { this.x = x; }
  public double getY() { return y; }
  public void setY(final double y) { this.y = y; }

  public String toString() { //* OVERRIDED STRING CLASS RETURNG POINTS
    return "(" + x + ", " + y + ")";
  }
}
