/*
 *  FILE:       DRIVER.JAVA
 *
 *  DATE:       SEPTEMBER 25, 2020
 *  CLASS:      IT 178
 */
package IT178.Inheritance;

public class Driver {                            //* DRIVER CLASS
  public static void main(final String[] args) { //* MAIN METHOD
    //* HARDCODING CORDINATES TO QUADRILATERAL CLASS
    final Quadrilateral quadrilateral =
        new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);

    //* HARDCODING CORDINATES TO TRAPIZOID CLASS
    final Trapezoid trapezoid =
        new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);

    //* HARDCODING CORDINATES TO PARALLELOGRAM CLASS
    final Parallelogram parallelogram =
        new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);

    //* HARDCODING CORDINATES TO RECTANGLE CLASS
    final Rectangle rectangle =
        new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);

    //* HARDCODING CORDINATES TO SQUARE CLASS
    final Square square = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);

    /*
     * OOH $0 PWETTY!
     * PRINTS EACH OBJECT IN A FORMATED STATEMENT
     */
    System.out.printf("\n_QUADRILATERAL_CORDINATES_\n%s\n"
                          + "\n_TRAPEZOID_CORDINATES_\n%s\n"
                          + "\n_PARALLELOGRAM_CORDINATES_\n%s\n"
                          + "\n_RECTANGLE_CORDINATES_\n%s\n"
                          + "\n_SQUARE_CORDINATES_\n%s\n\n",
                      quadrilateral, trapezoid, parallelogram, rectangle,
                      square);
  }
}
