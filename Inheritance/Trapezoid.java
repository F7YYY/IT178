import java.text.DecimalFormat;
public class Trapezoid
    extends Quadrilateral { //* TRAPEZOID INHERITNG QUAD_CLASS
  //* INSTANCES
  public double h, w, s1, s2;

  public Trapezoid(final double x1, final double y1, final double x2,
                   final double y2, final double x3, final double y3,
                   final double x4,
                   final double y4) { //* MODIFIED CONSTRUCTOR
                                      //* INITIALIZED QUADRILATERAL INSTANCES
    super(x1, y1, x2, y2, x3, y3, x4, y4);
    getheight();
  }

  public double getheight() { //* HEIGHT CALQULIMATUN
    return h = getP4().getY() - getP1().getY();
  }

  public double getSumOf2Sides() { //* LENGTH CALQULIMATUN
    s1 = getP2().getX() - getP1().getX();
    s2 = getP3().getX() - getP4().getX();
    return s1 + s2;
  }

  public double area() { //* AREA CALQULIMATUN
    return getSumOf2Sides() * h / 2;
  }

  public String toString() { //* OVERRIDED STRING CLASS RETURNING CALQULIMATUNZ
    DecimalFormat dp = new DecimalFormat(".###");
    return super.toString() + "\nHeight: " + dp.format(h) +
        "\nArea: " + dp.format(area());
  }
}
