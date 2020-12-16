/*
 *  FILE:       Cruise.java
 *
 *  DATE:       20 SEPTEMBER, 2020
 *  CLASS:      IT 178
 */
package IT178.ArrayList;

public class Cruise { //* CRUISE CLASS
  //* INSTANCES
  private String cruisename, shipname, port, rport, destination;

  public Cruise() {} //* DEFAULT CONSTRUCTOR

  public Cruise(final String cruisename, final String shipname,
                final String port, final String rport,
                final String destination) { //* CONSTRUCTOR
                                            //* INITIALIZED INSTANCES
    this.cruisename = cruisename;
    this.shipname = shipname;
    this.port = port;
    this.rport = rport;
    this.destination = destination;
  }
  //* GETTERS && SETTERS
  public String getcruise() { return cruisename; }
  public void setcruise(final String cruisename) {
    this.cruisename = cruisename;
  }
  public String getship() { return shipname; }
  public void setship(final String shipname) { this.shipname = shipname; }
  public String getport() { return port; }
  public void setport(final String port) { this.port = port; }
  public String getrport() { return rport; }
  public String setrport(final String rport) { return rport; }
  public String getdest() { return destination; }
  public String setdest(final String destination) { return destination; }

  public void printCruiseDetails() { //* DOES EXACTLY AS ENTITLED
    System.out.printf(cruisename + "\t" + shipname + "\t" + port + "\t" +
                      rport + "\t" + destination);
  }

  public String toString() { return cruisename; } //* STRING CLASS OVERRIDE
}
