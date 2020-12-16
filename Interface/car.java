/*
 *  FILE:       CAR.JAVA
 *
 *  DATE:       OCTOBER 1, 2020
 *  CLASS:      IT 178
 */
package IT178.Interface;

public class car implements carbonfootprint { //* FOOTPRINT INTERFACING CAR
  //* INSTANCES
  private double gallons;
  private double co = 20;

  public car(double gallons) { //* MODIFIED CONSTRUCTOR
    //* INITIALIZED INSTANCE
    this.gallons = gallons;
  }

  public double getCarbonFootprint() { //* RETURNS CALCULATED FOOTPRINT
    return gallons * co;
  }

  public String toString() { //* OVERRIDED STRING CLASS RETURNS PWETTY STATEMENT
    return "Car's " + gallons +
        " gallons, has carbon-foot-print: " + getCarbonFootprint();
  }
}
