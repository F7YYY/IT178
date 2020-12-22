import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Inventory { //* INVENTORY CLASS - BEGINNING
  //* PRIVATE INSTANCES
  private int size;
  private final Bicycle[] bikes;

  /*
   * INVENTORY CONSTRUCTS BICYCLE OBJECT ARRAY WITH SIZE
   */
  public Inventory() {
    //* INITIALIZED INSTANCES
    bikes = new Bicycle[100];
    size = 0;
  }

  /*
   * READINVENTORY TRIES READING THROUGHT BICYCLE.TXT
   * CHECKS IF THERE IS A BIKE IN TEXT
   * SKIPS WHITE SPACES IF BIKE WAS FOUND
   * COPIES CHAR-STRING TO BICYCLE OBJECT
   * CATCHES ISSUES READING FILE OR PARSIING TEXT
   */
  public void readInventory() {
    try {
      final BufferedReader in =
          new BufferedReader(new FileReader("Bicycle.txt"));
      String line = in.readLine();
      while (line != null) {
        final String[] chartemp = line.split("\\s");
        bikes[size] = new Bicycle(chartemp[0], Integer.parseInt(chartemp[1]),
                                  Boolean.parseBoolean(chartemp[2]),
                                  chartemp[3].charAt(0));
        line = in.readLine();
        size++;
      }
      in.close();
    } catch (final IOException ioerror) {
      System.out.println("\nIssue_Reading_File\n");
      System.exit(1);
    }
  }

  /*
   * OVERLAODING GETCHOICES FUNCTION FOR WHEEL SIZE
   * ITERATES THROUGHT ALL POSSIABLE BIKE COMBINATIONS
   * @param max LIMIT
   * @param wheelS SPECIFICATION
   * @return SELECTION - MAX LIMIT
   */
  public Bicycle[] getChoices(final int max, final int wheelS) {
    int s = 0; //* INITIALIZED INSTANCES

    final Bicycle[] selection = new Bicycle[max];
    for (int i = 0; i < size; i++) {
      if (bikes[i].getWheelSize() == wheelS && s < max) {
        selection[s++] = bikes[i];
      }
    }
    return selection;
  }

  /*
   * OVERLAODING GETCHOICES FUNCTION FOR GENDER
   * ITERATES THROUGHT ALL POSSIABLE BIKE COMBINATIONS
   * @param max LIMIT
   * @param gender SPECIFICATION
   * @return SELECTION - MAX LIMIT
   */
  public Bicycle[] getChoices(final int max, final char gender) {
    int s = 0; //* INITIALIZED INSTANCES

    final Bicycle[] selection = new Bicycle[max];
    for (int i = 0; i < size; i++) {
      if (bikes[i].getGender() == gender && s < max) {
        selection[s++] = bikes[i];
      }
    }
    return selection;
  }

  /*
   * OVERLAODING GETCHOICES FUNCTION FOR TYPES
   * ITERATES THROUGHT ALL POSSIABLE BIKE COMBINATIONS
   * @param max LIMIT
   * @param type SPECIFICATION
   * @return SELECTION - MAX LIMIT
   */
  public Bicycle[] getChoices(final int max, final String type) {
    int s = 0; //* INITIALIZED INSTANCES

    final Bicycle[] selection = new Bicycle[max];
    for (int i = 0; i < size; i++) {
      if (bikes[i].getType().toLowerCase().contains(type.toLowerCase()) &&
          s < max) {
        selection[s++] = bikes[i];
      }
    }
    return selection;
  }

  /*
   * OVERLAODING GETCHOICES FUNCTION FOR ASSEMBLED
   * ITERATES THROUGHT ALL POSSIABLE BIKE COMBINATIONS
   * @param max LIMIT
   * @param assembled SPECIFICATION
   * @return SELECTION - MAX LIMIT
   */
  public Bicycle[] getChoices(final int max, final boolean assembled) {
    int s = 0; //* INITIALIZED INSTANCES

    final Bicycle[] selection = new Bicycle[max];
    for (int i = 0; i < size; i++) {
      if (bikes[i].getAssembled() == assembled && s < max) {
        selection[s++] = bikes[i];
      }
    }
    return selection;
  }

  /*
   * GETCHOICE GATHERS ALL POSSIABLE HELPER GETCHOICIES SPECIFICATIONS
   * CHECKS IF ALL SPECIFICATIONS MATCH THE USERS PARAMATERS
   * @param max - LIMIT FOUND
   * @param type - BICYCLE
   * @param wheelS - WHEEL SIZE
   * @param gender - SEX
   * @param assembled - LNIB
   * @return SELECTION - @param TO DRIVER OUTPUT LIST
   */
  public Bicycle[] getChoices(final int max, final String type,
                              final int wheelS, final char gender,
                              final boolean assembled) {
    int s = 0; //* INITIALIZED INSTANCES

    final Bicycle[] selection = new Bicycle[max];
    for (int i = 0; i < size; i++) {
      if (bikes[i].getType() == type && bikes[i].getType() == type &&
          bikes[i].getType() == type && bikes[i].getType() == type &&
          s <= max) {
        selection[s++] = bikes[i];
      }
    }
    return selection;
  }

  /* ============================================================
   * OVERLOADED CHOOSEONE RANDOMALLY SELECTS GETCHOICES BIKE TYPE
   * CALLS GETCHOICES TYPE TILL VALID RANDOM BIKE IS SELECTED
   * @param max - LIMIT FOUND
   * @param type - VERSION
   * @return RANDOM BIKE TYPE
   */
  public Bicycle chooseOne(final int max, final String type) {
    final Bicycle[] bike = getChoices(max, type);

    //* INITIALIZED INSTANCES
    final Random rand = new Random();
    int choice = rand.nextInt(max);

    if (bike[0] == null) {
      return null;
    } else {
      while (bike[choice] == null) {
        choice = rand.nextInt(max);
      }
    }
    return bike[choice];
  }

  /*
   * OVERLOADED CHOOSEONE RANDOMALLY SELECTS GETCHOICES BIKE WHEEL SIZE
   * CALLS GETCHOICES WHEELS TILL VALID RANDOM BIKE IS SELECTED
   * @param max - LIMIT FOUND
   * @param wheelS - LENGTH
   * @return RANDOM BIKE WHEEL SIZE
   */
  public Bicycle chooseOne(final int max, final int wheelS) {
    final Bicycle[] bike = getChoices(max, wheelS);

    //* INITIALIZED INSTANCES
    final Random rand = new Random();
    int choice = rand.nextInt(max);

    if (bike[0] == null) {
      return null;
    } else {
      while (bike[choice] == null) {
        choice = rand.nextInt(max);
      }
    }
    return bike[choice];
  }

  /*
   * OVERLOADED CHOOSEONE RANDOMALLY SELECTS GETCHOICES BIKE ASSEMBLY
   * CALLS GETCHOICES ASSEMBLED TILL VALID RANDOM BIKE IS SELECTED
   * @param max - LIMIT FOUND
   * @param assembled - BUILT OR NOT
   * @return RANDOM BIKE STRUCTURE
   */
  public Bicycle chooseOne(final int max, final boolean assembled) {
    final Bicycle[] bike = getChoices(max, assembled);

    //* INITIALIZED INSTANCES
    final Random rand = new Random();
    int choice = rand.nextInt(max);

    if (bike[0] == null) {
      return null;
    } else {
      while (bike[choice] == null) {
        choice = rand.nextInt(max);
      }
    }
    return bike[choice];
  }

  /*
   * OVERLOADED CHOOSEONE RANDOMALLY SELECTS GETCHOICES BIKE GENDER
   * CALLS GETCHOICES GENDER TILL VALID RANDOM BIKE IS SELECTED
   * @param max - LIMIT FOUND
   * @param gender - SEX APPEAL
   * @return RANDOM BIKE APPEAL
   */
  public Bicycle chooseOne(final int max, final char gender) {
    final Bicycle[] bike = getChoices(max, gender);

    //* INITIALIZED INSTANCES
    final Random rand = new Random();
    int choice = rand.nextInt(max);

    if (bike[0] == null) {
      return null;
    } else {
      while (bike[choice] == null) {
        choice = rand.nextInt(max);
      }
    }
    return bike[choice];
  }

  /*
   * OVERLOADED CHOOSEONE GATHERS ALL POSSIABLE HELPER CHOOSEONES SPECIFICATIONS
   * CHECKS IF ALL SPECIFICATIONS MATCH THE USERS PARAMATERS
   * @param max - LIMIT FOUND
   * @param gender - SEX
   * @param type - BICYCLE
   * @param assembled - LNIB
   * @param wheelS - WHEEL SIZE
   * @return bike @param TO DRIVER SEARCH FUNCTION
   */
  public Bicycle chooseOne(final int max, final char gender, final String type,
                           final boolean assembled, final int wheelS) {
    final Bicycle[] bike = getChoices(max, type, wheelS, gender, assembled);

    //* INITIALIZED INSTANCES
    final Random rand = new Random();
    int choice = rand.nextInt(max);

    if (bike[0] == null) {
      return null;
    } else {
      while (bike[choice] == null) {
        choice = rand.nextInt(max);
      }
    }
    return bike[choice];
  }

  /* ===========================================
   * getbikes creates copy
   * Loops until index of size transfers to copy
   * @return copy OF BICYCLES IN FILE
   */
  public Bicycle[] getbikes() {
    final Bicycle[] copy = new Bicycle[size];

    for (int i = 0; i < size; i++) {
      copy[i] = bikes[i];
    }
    return copy;
  }

  /*
   * @return size OF ARRAY
   */
  public int getSize() { return size; }
}
