public class Bicycle { //* BICYCLE CLASS - BEGINNING
  //* PRIVATE INSTANCES
  private String type;
  private boolean assembled;
  private int wheelS;
  private char gender;

  /*
   * CONSTRUCTOR FOR ALL INSTANCES
   * @param type - BIKE
   * @param wheelS - SIZE
   * @param assembled - LNIB
   * @param gender - BLUE > PINK
   */
  public Bicycle(final String type, final int wheelS, final boolean assembled,
                 final char gender) {
    //* INITIALIEZED INSTANCES
    this.type = type;
    this.wheelS = wheelS;
    this.assembled = assembled;
    this.gender = gender;
  }

  /*
   * @set TYPE WHEELS, ASSEMBLED, GENDER FROM BICYCLE CONSTRUCTOR
   * @return TYPE WHEELS, ASSEMBLED, GENDER FROM INVENTORY CLASS
   */
  public String getType() { return type; }
  public void setType(final String type) { this.type = type; }
  public int getWheelSize() { return wheelS; }
  public void setWheelSize(final int wheelSize) { this.wheelS = wheelSize; }
  public char getGender() { return gender; }
  public void setGender(final char gender) { this.gender = gender; }
  public boolean getAssembled() { return assembled; }
  public void setAssembled(final boolean assembled) {
    this.assembled = assembled;
  }

  /*
   * OVERRIDES THE PARRENT CLASS OF JAVA TO PRINT INSTANCES
   */
  public String toString() { //* OOH $0 PWETTY!
    String sex;              //* INITIALIEZED INSTANCES

    if (gender == 'm') { //* CHAR-STRING CONVERSION
      sex = "Male";
    } else {
      sex = "Female";
    }
    return "\nBike Type: " + type + "\nWheel Size: " + wheelS +
        "\nGender: " + sex + "\nAssembled: " + assembled + "\n";
  }
}
