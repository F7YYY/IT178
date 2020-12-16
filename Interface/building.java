/*
 *  FILE:       BUILDING.JAVA
 *
 *  DATE:       OCTOBER 1, 2020
 *  CLASS:      IT 178
 */
package IT178.Interface;

public class building
    implements carbonfootprint { //* FOOTPRINT INTERFACING BUILDING
                                 //* INSTANCES
  private String psteel = "", pwood = "", pbasement = "", pconcrete = "";
  private double fp = 0, sf, concrete = 47, steel = 17, basement = 20,
                 wood = 50;
  private boolean woody = false, basementy = false, concretey = false,
                  steely = false;

  public building(double sf, Boolean woody, Boolean basementy,
                  Boolean concretey, Boolean steely) { //* MODIFIIED CONSTRUCTOR
                                                       //* INITIALIZED INSTANCES
    this.sf = sf;
    this.woody = woody;
    this.concretey = concretey;
    this.steely = steely;
    this.basementy = basementy;
  }

  public double getCarbonFootprint() { //* RETURNS CALCULATE FOOTPRINT-fp
    if (woody && basementy && concretey && steely) {
      fp = wood + basement + concrete + steel;
    }
    if (woody) {
      fp += wood;
    }
    if (concretey) {
      fp += concrete;
    }
    if (steely) {
      fp += steel;
    }
    if (basementy) {
      fp += basement;
    }
    return sf * fp;
  }

  public String toString() { //* OVERRIDED STRING CLASS RETURNS PWETTY STATEMENT
    if (woody) {
      pwood = "wood frame";
    } else if (basementy) {
      pbasement = "basement";
    } else if (concretey) {
      pconcrete = "concrete";
    } else if (steely) {
      psteel = "steel";
    }

    return "Building's " + sf + " square-feet, with " + pwood + pbasement +
        pconcrete + psteel + ", has carbon-foot-print: " + getCarbonFootprint();
  }
}
