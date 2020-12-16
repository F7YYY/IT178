/*
 *  FILE:       BICYCLE.JAVA
 *
 *  DATE:       OCTOBER 1, 2020
 *  CLASS:      IT 178
 */
package IT178.Interface;

public class bicycle
    implements carbonfootprint { //* FOOTPRINT INTERFACING BICYCLE
  public double getCarbonFootprint() { return 0; } //* ZER0 EMISSIONS
  public String toString() { //* OVERRIDED STRING CLASS RETURNING ZER0
    return "Bicycle has carbon-foot-print: " + getCarbonFootprint();
  }
}
