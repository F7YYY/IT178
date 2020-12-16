/*
 *  FILE:       BicycleRide.java
 *
 *  DATE:       AUGUST 20, 2020
 *  CLASS:      IT 178
 */
package IT178.BikeRev;

import java.util.Scanner;

public class BicycleRide { //* BICYCLE DRIVER CLASS - BEGINNING
  //* STATIC INSTANCES
  static Scanner in = new Scanner(System.in);
  static Inventory inv;
  static boolean accepted = false;

  /*
   * LOOPS MENU SUGGESTIONS UNTILL USER SPECIFIES QUIT
   * PROCESS VALID USER INPUTS THROUGH SWITCH STATEMENT
   * DISPLAYS ALL POSSIABLE MATCHING CRITERIA
   */
  public static void main(final String[] args) { //* MAIN FUNCTION
    //* INITIALIZED INSTANCES
    int num;
    inv = new Inventory();
    inv.readInventory();

    do { //* OOH $0 PWETTY
      num = menuOptions();
      switch (num) {
      case 1:
        search(determineSearch());
        break;
      case 2:
        outputList(1);
        break;
      case 3:
        outputList(2);
        break;
      case 4:
        outputList(3);
        break;
      case 5:
        outputList(4);
        break;
      case 6:
        outputList(5);
        break;
      default:
        System.out.println("\n_Invalid_Input_\n"); //* YEEET
      case 0:
        break;
      }
    } while (num != 0);
    System.out.println("\n=============================="
                       + "\n+ DAVID KIM - BICYCLE REVIEW +"
                       + "\n=============================="
                       + "\n+ + +  C# => C++ > JAVA  + + +"
                       + "\n==============================\n");
    System.exit(0);
  }

  /*
   * VALIDATION YEEETS NON-INTEGER USER INPUTS
   * @return INTEGER TO MENUOPTIONS OR DETERMINESEARCH
   */
  public static int validation() {
    //* INITIALIZED INSTANCES
    boolean accepted = false;
    int selection = 0;

    do {
      try {
        selection = Integer.parseInt(in.nextLine());
        accepted = true;
      } catch (final NumberFormatException e) { //* YEEET
        System.out.println("\n_Invalid_Input_\n");
        System.out.println("New Choice: ");
      }
    } while (!accepted);
    return selection;
  }

  /*
   * PRINTS MAIN MENU
   * @return VALID INTEGER TO MAIN SWITCH STATEMENT FOR PROCESSING
   */
  public static int menuOptions() { //* OOH $0 PWETTY
    System.out.println("\n==============================\n"
                       + "1- Choose one for me\n"
                       + "2- List Inventory: Wheel Size\n"
                       + "3- List Inventory: Type\n"
                       + "4- List Inventory: Gender\n"
                       + "5- List Inventory: Assembled\n"
                       + "6- List Inventory: ALL\n"
                       + "0- QUIT\n"
                       + "==============================\n");
    System.out.println("Choice: ");
    return validation();
  }

  /*
   * PRINTS DEFINED SECOND MENU
   * @return VALID INTEGER TO MAIN SWITCH STATEMENT FOR PROCESSING
   */
  public static int determineSearch() { //* OOH $0 PWETTY
    System.out.println("\n==============================\n"
                       + "1- Select one by: Wheel Size\n"
                       + "2- Select one by: Type\n"
                       + "3- Select one by: Gender\n"
                       + "4- Select one by: Assembled\n"
                       + "5- Select one by: ALL\n"
                       + "==============================\n");
    System.out.println("Choice: ");
    return validation();
  }

  /*
   * PRINTS AVAILABLE BICYCLE TOSTRING
   * @param bikes INDEXES THROUGH BICYCLE OBJECT AND PRINTS TOSTRING
   */
  public static void printlist(final Bicycle[] bikes) {
    for (int i = 0; i < bikes.length; i++) {
      if (bikes[i] != null) {
        System.out.println(bikes[i].toString());
      }
    }
  }

  /*
   * @param inp SWITCHES THORUGH OVERLOADED GETCHOICES METHODS FROM INVENTORY
   */
  public static void outputList(final int inp) {
    switch (inp) {
    case 1:
      printlist(inv.getChoices(inv.getSize(), wheelSize()));
      break;
    case 2:
      printlist(inv.getChoices(inv.getSize(), type()));
      break;
    case 3:
      printlist(inv.getChoices(inv.getSize(), gender()));
      break;
    case 4:
      printlist(inv.getChoices(inv.getSize(), assembled()));
      break;
    case 5:
      printlist(inv.getbikes());
      break;
    }
  }

  /*
   * SPECIFIES WHEEL VERSIONS - [14 OR 16]
   * REQUESTS & VERIFIES USER SPECIFICATION KNOWING LIST VALUES
   * @return VALID BICYCLE WHEEL SIZE - NUMBER
   */
  public static int wheelSize() {
    //* INITIALIZED INSTANCES
    boolean check = false;
    int number;

    do {
      System.out.println("Wheel Size[14|16]: ");
      number = in.nextInt();
      in.nextLine();
      if (number == 14 || number == 16) {
        check = true;
      } else
        System.out.println("\n_Invalid_Input_\n"); //* YEEET
    } while (!check);
    return number;
  }

  /*
   * SPECIFIES BIKE VERSIONS - [DIRT, SPEED, HYBRID, ROAD, MOUNTAIN]
   * REQUESTS & VERIFIES USER SPECIFICATION KNOWING LIST VALUES
   * @return VALID BICYCLE TYPE - BIKE
   */
  public static String type() {
    //* INITIALIZED INSTANCES
    boolean check = false;
    String bike;

    do {
      System.out.println("What Bike Type: ");
      bike = in.nextLine();
      if (bike.toLowerCase().contains("dirt") ||
          bike.toLowerCase().contains("speed") ||
          bike.toLowerCase().contains("hybrid") ||
          bike.toLowerCase().contains("road") ||
          bike.toLowerCase().contains("mountain")) {
        check = true;
      } else
        System.out.println("\n_Invalid_Input_\n"); //* YEEET
    } while (!check);
    return bike;
  }

  /*
   * SPECIFIES GENDER VERSIONS - [MALE OR FEMALE]
   * REQUESTS & VERIFIES USER SPECIFICATION KNOWING LIST VALUES
   * @return VALID BICYCLE GENDER - SEX
   */
  public static char gender() {
    //* INITIALIZED INSTANCES
    boolean check = false;
    char sex;

    do {
      System.out.println("Gender[M|F]: ");
      sex = in.nextLine().charAt(0);
      if (sex == 'f') {
        check = true;
      } else if (sex == 'm') {
        check = true;
      } else
        System.out.println("\n_Invalid_Input_\n"); //* YEEET
    } while (!check);
    return sex;
  }

  /*
   * SPECIFIES ASSEMBLED VERSIONS - [ASSEMBLED OR NOT]
   * REQUESTS & VERIFIES USER SPECIFICATION KNOWING LIST VALUES
   * @return VALID BICYCLE ASSEMBLY - ASSNULL
   */
  public static boolean assembled() {
    //* INITIALIZED INSTANCES
    boolean check = false, assNull = false;
    String ass;

    do {
      System.out.println("Assembled[Y|N]: ");
      ass = in.nextLine();
      if (ass.toLowerCase().contains("n")) {
        check = true;
      } else if (ass.toLowerCase().contains("y")) {
        assNull = true;
        check = true;
      } else
        System.out.println("\n_Invalid_Input_\n"); //* YEEET
    } while (!check);
    return assNull;
  }

  /*
   * SEARCH REQUESTS & VERIFIES USER BICYCLE QUANTITY FROM OVERLOADED CHOOSEONE
   * PRINTS DETERMINESEARCH CRITERIA TOSTRING OF AVAILABLE SPECIFICATIONS
   * @param num SWITCHES THORUGH OVERLOADED CHOOSEONE METHODS FROM INVENTORY
   */
  public static void search(final int num) {
    //* INITIALIZED INSTANCES
    int num2;
    Bicycle b;

    //* REQUESTS USER SPECIFICATION
    System.out.println("Bike Quantity: ");
    num2 = in.nextInt();
    in.nextLine();

    switch (num) {
    case 1:
      b = inv.chooseOne(num2, wheelSize());
      if (b != null) {
        System.out.println(b.toString());
      } else
        System.out.println("\n_N0_ITEM_F0UND_\n"); //* YEEET
      break;
    case 2:
      b = inv.chooseOne(num2, type());
      if (b != null) {
        System.out.println(b.toString());
      } else
        System.out.println("\n_N0_ITEM_F0UND_\n"); //* YEEET
      break;
    case 3:
      b = inv.chooseOne(num2, gender());
      if (b != null) {
        System.out.println(b.toString());
      } else
        System.out.println("\n_N0_ITEM_F0UND_\n"); //* YEEET
      break;
    case 4:
      b = inv.chooseOne(num2, assembled());
      if (b != null) {
        System.out.println(b.toString());
      } else
        System.out.println("\n_N0_ITEM_F0UND_\n"); //* YEEET
      break;
    case 5:
      b = inv.chooseOne(num2, gender(), type(), assembled(), wheelSize());
      if (b != null) {
        System.out.println(b.toString());
      } else
        System.out.println("\n_N0_ITEM_F0UND_\n"); //* YEEET
      break;
    }
  }
}
