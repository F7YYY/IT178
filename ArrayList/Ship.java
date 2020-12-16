/*
 *  FILE:       Ship.java
 *
 *  DATE:       20 SEPTEMBER, 2020
 *  CLASS:      IT 178
 */
package IT178.ArrayList;

public class Ship { //* SHIP CLASS
  //* INSTANCES
  private String shipnames;
  private int balcony, oceanview, suite, interior;
  private boolean service;

  public Ship(final String shipnames, final int balcony, final int oceanview,
              final int suite, final int interior,
              final boolean service) { //* CONSTUCTOR
                                       //* INITIALIZED INSTANCES
    this.shipnames = shipnames;
    this.balcony = balcony;
    this.oceanview = oceanview;
    this.suite = suite;
    this.interior = interior;
    this.service = service;
  }
  //* SETTERS && GETTERS
  public String getshipnames() { return shipnames; }
  public void setshipnames(final String shipnames) {
    this.shipnames = shipnames;
  }
  public int getbalcony() { return balcony; }
  public void setbalcony(final int balcony) { this.balcony = balcony; }
  public int getoceanview() { return oceanview; }
  public void setoceanview(final int oceanview) { this.oceanview = oceanview; }
  public int getsuite() { return suite; }
  public void setsuite(final int suite) { this.suite = suite; }
  public int getinterior() { return interior; }
  public void setinterior(final int interior) { this.interior = interior; }
  public boolean getservices() { return service; }
  public void setservices(final boolean service) { this.service = service; }

  public void printShipData() { //* DOES EXACTLY AS ENTITLED
    System.out.println(shipnames + "\t" + balcony + "\t" + oceanview + "\t" +
                       suite + "\t" + interior + "\t" + service);
  }

  public String toString() { return shipnames; } //* STRING CLASS OVERRIDE
}
