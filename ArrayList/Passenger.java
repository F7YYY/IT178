public class Passenger { //* PASSENGER CLASS
  //* INSTANCES
  private String passengername, cruisename, roomrequest;

  public Passenger() { //* DEFAULT CONSTRUCTOR
  }

  public Passenger(final String passengername, final String cruisename,
                   final String roomrequest) { //* CONSTRUCTOR
                                               //* INITIALIZED INSTANCES
    this.passengername = passengername;
    this.cruisename = cruisename;
    this.roomrequest = roomrequest;
  }
  //* SETTERS && GETTERS
  public String getpname() { return passengername; }
  public void setpname(final String passengername) {
    this.passengername = passengername;
  }
  public String getcname() { return cruisename; }
  public void setcname(final String cruisename) {
    this.cruisename = cruisename;
  }
  public String getroom() { return roomrequest; }
  public void setroom(final String roomrequest) {
    this.roomrequest = roomrequest;
  }

  public void printPassengers() { //* DOES EXACTLY AS ENTITLED
    System.out.println(passengername + "\t" + cruisename + "\t" + roomrequest);
  }

  public String toString() { return passengername; } //* STRING CLASS OVERRIDE
}
