import java.util.ArrayList;
import java.util.Scanner;

public class ShipSail { //* SHIP DRIVER CLASS
  //* INSTANCES - HATE ME IDC
  private static Scanner in = new Scanner(System.in);
  private static String input, pass;
  private static char selection;
  private static int num;
  private static boolean inser, quit = false, good = false;
  private static ArrayList<Ship> shipList = new ArrayList<>();
  private static ArrayList<Cruise> cruiseList = new ArrayList<>();
  private static ArrayList<Passenger> passengerList = new ArrayList<>();

  /*
   * HARD CODED SHIPS FOR SHIP LIST
   */
  public static void initializeShipList() {
    shipList.add(new Ship("HARDCORE", 1, 2, 3, 4, true));
    shipList.add(new Ship("sofcore", 1, 2, 3, 4, false));
  }

  /*
   * HARD CODED CRUISES FOR CRUISE LIST
   */
  public static void initializeCruiseList() {
    cruiseList.add(
        new Cruise("HARDER", "HARDCORE", "Chicago", "Miami", "Chicago"));
    cruiseList.add(
        new Cruise("SOFTER", "sofcore", "Miami", "Bahamas", "Miami"));
  }

  /*
   * HARD CODED PASSENGERS FOR PASSENGER LIST
   */
  public static void initializePassengerList() {
    passengerList.add(new Passenger("This Guy", "HARDER", "OCEAN VIEW"));
    passengerList.add(new Passenger("Zoomer", "softcore", "Balcony"));
  }

  public static void editPassenger(final int passdex) {
    int selection, secondSelection, i;
    String name;

    if (passengerList.isEmpty()) {
      System.out.println("_N0_PASSENGERS_");
    } else {
      for (i = 0; i < passengerList.size(); i++) {
        System.out.printf("[%d] - %s\n", i + 1,
                          passengerList.get(i).getpname());
      }
      System.out.println("\nEnter Passenger: ");

      do {
        selection = Integer.parseInt(in.nextLine());
        if (selection != 0 && selection <= i) {
          good = true;
        } else
          System.out.println("_INVALID_INPUT_");
      } while (!good);

      System.out.printf("\nEDITINIG PASSENGER:\n",
                        passengerList.get(passdex).getpname());
      System.out.println("\n[1] - Edit Name."
                         + "\n[2] - EDIT CRUISE"
                         + "\n[3] - EDIT ROOM"
                         + "\n[4] - EDIT ALL"
                         + "\n[5] - DELETE"
                         + "\n[6] - QUIT"
                         + "\nENTER SELECTION: ");

      good = false;

      do {
        secondSelection = Integer.parseInt(in.nextLine());
        if (secondSelection > 0 && secondSelection <= 6) {
          good = true;
        } else
          System.out.println("_INVALID_INPUT_");
      } while (!good);

      switch (selection) {
      case 1: //* CHANGE PASSENGER NAME
        System.out.println("Enter passenger name:");
        name = in.nextLine();
        passengerList.get(passdex).setpname(name);
        break;
      case 2: //*CHANGE CRUISE PASSENGER BOARDED
        String cruise;
        cruise = getCruise();
        passengerList.get(passdex).setcname(cruise);
        break;
      case 3: //* CHANGE ROOM
        selection = getRoomSelection();
        setPassengerRoomType(passdex, selection);
        break;
      case 4: //* CHANGE ALL PASSENGER SELECTIONS
        System.out.println("Enter passenger name:");
        name = in.nextLine();
        passengerList.get(passdex).setpname(name);
        cruise = getCruise();
        passengerList.get(passdex).setcname(cruise);
        selection = getRoomSelection();
        setPassengerRoomType(passdex, selection);
        break;
      case 5: //* DELETE PASSENGER
        System.out.println("DELETE PASSENGER? [Y|N]: ");
        input = in.nextLine().toLowerCase();
        if (input == "y") {
          passengerList.remove(passdex);
          System.out.println("Passenger Removed.");
        } else
          System.out.println("Passenger was NOT removed.");
        break;
      case 6:
        System.out.println("Returning to main menu.");
        break;
      }
    }
  }

  /*
   * REQUESTS USERS SPECIFIED DETAILS AND CREATES A PASSENGER
   * ADDS PASSENGER TO THE LIST OF PASSENGERS
   */
  public static void addPassenger() {
    //* INSTANCES - INITIALIZED
    String cru;
    int i;

    if (cruiseList.size() != 0) {
      System.out.println("\nPASSENGER NAME: ");
      pass = in.nextLine();

      System.out.println("\nENTER CRUISE #: ");
      for (i = 0; i < cruiseList.size(); i++) {
        System.out.printf("\n[%d] - %s\n", i + 1,
                          cruiseList.get(i).getcruise());
      }
      num = Integer.parseInt(in.nextLine());
    }

    cru = cruiseList.get(num - 1).getcruise();

    System.out.println("\n[1] - BALCONY"
                       + "\n[2] - OCEAN VIEW"
                       + "\n[3] - SUITE"
                       + "\n[4] - INTERIOR"
                       + "\nENTER ROOM TYPE: ");

    num = Integer.parseInt(in.nextLine());
    good = false;
    do {
      if (num >= 1 && num <= 4) {
        good = true;
      } else
        System.out.println("_INVALID_INPUT_");
    } while (good != true);

    if (num == 1) {
      passengerList.add(new Passenger(pass, cru, "balcony"));
    } else if (num == 2) {
      passengerList.add(new Passenger(pass, cru, "ocean view"));
    } else if (num == 3) {
      passengerList.add(new Passenger(pass, cru, "suite"));
    } else if (num == 4) {
      passengerList.add(new Passenger(pass, cru, "interior"));
    } else
      System.out.println("_N0_CRUISES_");
  }

  public static void cruisemenu(final int crudex) {
    System.out.printf("Edit CRUISE: ", cruiseList.get(crudex));
    System.out.println("\n[1] - EDIT CRUISE NAME"
                       + "\n[2] - EDIT SHIP FOR CRUISE"
                       + "\n[3] - EDIT CRUISE DEPARTURE"
                       + "\n[4] - EDIT CRUISE DESTINATION"
                       + "\n[5] - EDIT CRUISE RETURN PORT"
                       + "\n[6] - EDIT ALL CRUISE OPTIONS"
                       + "\n[7] - DELETE CRUISE"
                       + "\n[8] - QUIT EDITING");
  }

  public static void editCruise() {
    int selection, secondSelection, i;

    if (cruiseList.size() != 0) {
      System.out.println("\nSELECT CUISE TO EDIT: ");
      for (i = 0; i < cruiseList.size(); i++) {
        System.out.printf(cruiseList.get(i).getcruise());
      }
      selection = Integer.parseInt(in.nextLine());
      if (selection == 0 || selection > i + 1) {
        System.out.println("_INVALID_INPUT_");
      } else {
        cruisemenu(selection - 1);
        do {
          secondSelection = Integer.parseInt(in.nextLine());
          if (secondSelection != 0 && secondSelection <= 8) {
            good = true;
          } else
            System.out.println("_INVALID_INPUT_");
        } while (!good);
        PassengerEdit(secondSelection, selection - 1);
      }
    } else
      System.out.println("_N0_CRUISES_");
  }

  public static String getCruise() {
    int i;
    int selection;

    System.out.println("\nENTER CRUISE #: ");
    for (i = 0; i < cruiseList.size(); i++) {
      System.out.printf("\n[%d] - %s\n", i + 1, cruiseList.get(i).getcruise());
    }

    do {
      selection = Integer.parseInt(in.nextLine());
      if (selection != 0 && selection <= i + 1) {
        good = true;
      } else
        System.out.println("_INVALID_INPUT_");
    } while (!good);

    return cruiseList.get(selection - 1).getcruise();
  }

  /*
   * REQUESTS USERS SPECIFIED DETAILS AND CREATES A CRUISE
   * ADDS CRUISE TO THE LIST OF CRUISES
   */
  public static void addCruise() {
    //* INSTANCES - INITIALIZED
    String cn, sn, dp, dn, rp;

    System.out.println("New Cruise Name: ");
    cn = in.nextLine();
    System.out.println("Ship Name: ");
    sn = in.nextLine();
    System.out.println("Departure: ");
    dp = in.nextLine();
    System.out.println("Destination: ");
    dn = in.nextLine();
    System.out.println("Return Port: ");
    rp = in.nextLine();
    cruiseList.add(new Cruise(cn, sn, dp, rp, dn));
  }

  public static void shipmenu(final int shipdex) {
    System.out.printf("Ship Edit Menu for: ",
                      shipList.get(shipdex).getshipnames());
    System.out.println("\n[1] - EDIT SHIP NAME"
                       + "\n[2] - EDIT # OF BALCONIES"
                       + "\n[3] - EDIT # OF OCEAN VIEWS"
                       + "\n[4] - EDIT # OF SUITES"
                       + "\n[5] - EDIT # OF INTERIORS"
                       + "\n[6] - EDIT SERVICE STATUS"
                       + "\n[7] - EDIT ALL SHIP OPTIONS"
                       + "\n[8] - DELETE SHIP"
                       + "\n[9] - QUIT EDITING"
                       + "\nENTER SELECTION: ");
  }

  public static int getRoomSelection() {
    good = false;
    int selection;
    System.out.println("\n[1] - BALCONY"
                       + "\n[2] - OCEAN VIEW"
                       + "\n[3] - SUITE"
                       + "\n[4] - INTERIOR"
                       + "\nENTER SELECTION: ");
    do {
      selection = Integer.parseInt(in.nextLine());
      if (selection > 0 && selection <= 4) {
        good = true;
      } else
        System.out.println("That was not a valid option. Please try again.");
    } while (!good);
    return selection;
  }

  public static void setPassengerRoomType(final int passdex,
                                          final int selection) {
    switch (selection) {
    case 1:
      passengerList.get(passdex).setroom("balcony");
      break;
    case 2:
      passengerList.get(passdex).setroom("ocean view");
      break;
    case 3:
      passengerList.get(passdex).setroom("suite");
      break;
    case 4:
      passengerList.get(passdex).setroom("interior");
      break;
    }
  }

  public static void PassengerEdit(final int menuSelection, final int passdex) {
    switch (menuSelection) {
    case 1: //* CHANGE PASSENGER NAME
      String name;
      System.out.println("\nEnter Passenger Name: ");
      name = in.nextLine();
      passengerList.get(passdex).setpname(name);
      break;
    case 2: //* CHANGE CRUISE PASSENGER BOARDED
      String cruise;
      cruise = getCruise();
      passengerList.get(passdex).setcname(cruise);
      break;
    case 3: //* CHANGE ROOM
      System.out.println("\n[1] - BALCONY"
                         + "\n[2] - OCEAN VIEW"
                         + "\n[3] - SUITE"
                         + "\n[4] - INTERIOR"
                         + "\nENTER SELECTION: ");

      while (!good) {
        if (selection != 0 && selection <= 4) {
          good = true;
        } else
          System.out.println("_INVALID_INPUT_");
      }
      setPassengerRoomType(passdex, selection);
      break;
    case 4: //* CHANGE ALL
      System.out.println("Enter passenger name:");
      name = in.nextLine();
      passengerList.get(passdex).setpname(name);
      cruise = getCruise();
      passengerList.get(passdex).setcname(cruise);
      System.out.println("\n[1] - BALCONY"
                         + "\n[2] - OCEAN VIEW"
                         + "\n[3] - SUITE"
                         + "\n[4] - INTERIOR"
                         + "\nENTER SELECTION: ");

      while (!good) {
        if (selection != 0 && selection <= 4) {
          good = true;
        } else
          System.out.println("_INVALID_INPUT_");
      }
      setPassengerRoomType(passdex, selection);
      break;
    case 5: //* DELETE PASSENGER
      System.out.println("\nDELETE PASSENGER? [Y|N]: ");
      input = in.nextLine().toLowerCase();
      if (input == "y") {
        passengerList.remove(passdex);
        System.out.println("DELETED");
      } else
        System.out.println("CANCELED");
      break;
    case 6:
      System.out.println("MENU");
      break;
    }
  }

  public static void shipEdit(final int menuSelect, final int shipdex) {
    switch (menuSelect) {
    case 1: { //* RENAME SHIP
      String name;
      System.out.print("\nNAME OF SHIP: ");
      name = in.nextLine();
      shipList.get(shipdex).setshipnames(name);
      break;
    }
    case 2: { //* CHANGE # OF BALCONY ROOMS
      int bal;
      System.out.printf("\n# OF BALCONY ROOMS ON SHIP: ",
                        shipList.get(shipdex).getshipnames());
      bal = Integer.parseInt(in.nextLine());
      shipList.get(shipdex).setbalcony(bal);
      System.out.printf("Room count updated for %s. \n",
                        shipList.get(shipdex).getshipnames());
      break;
    }
    case 3: { //* CHANGE # OF OCEAN VIEW ROOMS
      int ov;
      System.out.printf("\nHow many ocean view rooms are on %s? ",
                        shipList.get(shipdex).getshipnames());
      ov = Integer.parseInt(in.nextLine());
      shipList.get(shipdex).setoceanview(ov);
      System.out.printf("Room count updated for %s. \n",
                        shipList.get(shipdex).getshipnames());
      break;
    }
    case 4: { //* CHANGE # OF SUITES
      int suite;
      System.out.printf("\nHow many suite rooms are on %s? ",
                        shipList.get(shipdex).getshipnames());
      suite = Integer.parseInt(in.nextLine());
      shipList.get(shipdex).setsuite(suite);
      System.out.printf("Room count updated for %s. \n",
                        shipList.get(shipdex).getshipnames());
      break;
    }
    case 5: { //* CHANGE # OF INTERIOR ROOMS
      int inter;
      System.out.printf("\nHow many interior rooms are on %s? ",
                        shipList.get(shipdex).getshipnames());
      inter = Integer.parseInt(in.nextLine());
      shipList.get(shipdex).setinterior(inter);
      System.out.printf("Room count updated for %s. \n",
                        shipList.get(shipdex).getshipnames());
      break;
    }
    case 6: //* CHANGE SHIP STATUS
      System.out.printf(
          "\nIs %s in service? Does it have an assigned cruise? [Y|N]: ",
          shipList.get(shipdex).getshipnames());
      input = in.nextLine().toString();

      if (input == "y") {
        inser = true;
      } else if (input == "n") {
        inser = false;
      }
      shipList.get(shipdex).setservices(inser);
      break;
    case 7: //* ABOVE ALL
      shipEdit(1, shipdex);
      shipEdit(2, shipdex);
      shipEdit(3, shipdex);
      shipEdit(4, shipdex);
      shipEdit(5, shipdex);
      shipEdit(6, shipdex);
      break;
    case 8: //* DELETE SHIP
      System.out.printf("\nARE YOU SURE YOU WISH TO DELETE '%s'? [Y|N]: ",
                        shipList.get(shipdex).getshipnames());
      input = in.nextLine().toLowerCase();

      if (input == "y") {
        inser = true;
      } else if (input == "n") {
        inser = false;
      }

      if (inser == true) {
        shipList.remove(shipdex);
        System.out.println("DELETED");
      } else
        System.out.println("CANCELED");
      break;
    case 9:
      System.out.println("_DONE_");
      break;
    }
  }

  public static void editShip() {
    // display available ships
    System.out.println("Which ship would you like to edit: ");

    for (int i = 0; i < shipList.size(); i++) {
      int currentShip = i + 1;
      System.out.println(currentShip + "- " + shipList.get(i));
    }
    int finalChoice = shipList.size() + 1;
    System.out.println(finalChoice + "- Return to previous menu");

    int shipChoice = in.nextInt() - 1;

    System.out.println("Which item do you wish to edit:\r\n"
                       + "1-	Ship name\r\n"
                       + "2-	Number of balconies\r\n"
                       + "3-	Number of Ocean Views\r\n"
                       + "4-	Number of Suites\r\n"
                       + "5-	Number of Interior\r\n"
                       + "6-	Service status\r\n"
                       + "7-	Update all\r\n"
                       + "8-	Return to previous menu\r\n");

    int itemChoice = in.nextInt();

    switch (itemChoice) {
    case 1:
      System.out.println("New ship name: ");
      shipList.get(shipChoice).setshipnames(in.next());
      break;

    case 2:
      System.out.println("Number of balconies: ");
      shipList.get(shipChoice).setbalcony(in.nextInt());
      break;

    case 3:
      System.out.println("Number of Ocean Views: ");
      shipList.get(shipChoice).setoceanview(in.nextInt());
      break;

    case 4:
      System.out.println("Number of Suites: ");
      shipList.get(shipChoice).setsuite(in.nextInt());
      break;

    case 5:
      System.out.println("Number of interior: ");
      shipList.get(shipChoice).setinterior(in.nextInt());
      break;

    case 6:
      String service = "";
      if (shipList.get(shipChoice).getservices()) {
        service = "in service";
      } else {
        service = "not in sevice";
      }
      System.out.println("Ship " + shipList.get(shipChoice).getshipnames() +
                         " is currently" + service);
      System.out.println("Would you like this ship to be in service?");

      if (in.next().toUpperCase().charAt(0) == 'Y') {
        shipList.get(shipChoice).setservices(true);
      } else
        shipList.get(shipChoice).setservices(false);
      break;
    case 7:
      String service1 = "";
      if (shipList.get(shipChoice).getservices()) {
        service1 = "in service";
      } else
        service1 = "not in sevice";
      System.out.println("Ship " + shipList.get(shipChoice).getshipnames() +
                         " is currently" + service1);
      System.out.println("Would you like this ship to be in service?");
      if (in.next().toUpperCase().charAt(0) == 'Y') {
        shipList.get(shipChoice).setservices(true);
      } else
        shipList.get(shipChoice).setservices(false);
      break;
    case 8:
      editShip();
      break;
    }
  }

  /*
   * REQUESTS USERS SPECIFIED DETAILS AND CREATES A SHIP
   * ADDS SHIP TO THE LIST OF SHIPS
   */
  public static void addShip() {
    //* INSTANCES - INITIALIZED
    String sn, ss;
    int bn, on, ir, st;
    boolean sb = false;

    System.out.println("New Ship Name: ");
    sn = in.nextLine().toLowerCase();
    System.out.println("# of Balcony rooms: ");
    bn = Integer.parseInt(in.nextLine());
    System.out.println("# of Ocean-View rooms: ");
    on = Integer.parseInt(in.nextLine());
    System.out.println("# of Interior rooms: ");
    ir = Integer.parseInt(in.nextLine());
    System.out.println("# of Suites: ");
    st = Integer.parseInt(in.nextLine());
    System.out.println("Assign Ship InService [Y|N]: ");
    ss = in.nextLine().toLowerCase();
    if (ss.equals("y")) {
      sb = true;
    }
    shipList.add(new Ship(sn, bn, on, ir, st, sb));
  }

  /*
   * REQUESTS USERS SELECTED PASSENGERS AND PRINTS SUGGESTED PASSENGERS
   * NO PASSENGERS ARE PRINTED IF NOT IN LIST
   */
  public static void printPassengerList() {
    System.out.println("\n____________________PASSENGERS____________________"
                       + "\nNAME\t| CRUISE\t| ROOM");
    if (passengerList.size() != 0) {
      for (final var pass : passengerList) {
        System.out.printf("\n" + pass.getpname() + "\t " + pass.getcname() +
                          "\t" + pass.getroom());
      }
    } else
      System.out.println("\n_N0_PASSENGERS_\n");
  }

  /*
   * REQUESTS USERS SELECTED CRUISES AND PRINTS SUGGESTED CRUISE
   * NO CRUISES ARE PRINTED IF NOT IN LIST
   * @param string SPECIFIES CRUISES DETAILED VIEW
   */
  public static void printCruiseList() {
    System.out.println(
        "\nCRUISE\t| SHIPS\t| DEPARTURE\t| DESTINATION\t| RETURN\n");
    for (Cruise c : cruiseList) {
      c.printCruiseDetails();
    }
  }

  /*
   * REQUESTS USERS SELECTED SHIP AND PRINTS SUGGESTED SHIP
   * NO SHIPS PRINTED IF NOT IN LIST
   * @param input SPECIFIES SHIPS DETAILED VIEW
   */
  public static void PrintShipList(final String input) {
    if (shipList.size() == 0) {
      System.out.println("\n_N0_SHIPS_");
    } else if (input.contains("name")) {
      System.out.println("\n____________________SHIP_LIST____________________");
      num = 1;
    } else if (input.contains("inservice")) {
      System.out.println(
          "\n____________________ACTIVE_SHIP_LIST____________________"
          + "\n~~~~~~~~~~~~~~~~~~~~~ _#_OF_ROOMS_ ~~~~~~~~~~~~~~~~~~~~~"
          + "\nSHIPS\t| Balcony | OceanView | Suite | Interior | Service");
      num = 2;
    } else if (input.contains("service")) {
      System.out.println(
          "\n___________________INACTIVE_SHIP_LIST___________________"
          + "\n~~~~~~~~~~~~~~~~~~~~~ _#_OF_ROOMS_ ~~~~~~~~~~~~~~~~~~~~~"
          + "\nSHIPS\t| Balcony | OceanView | Suite | Interior | Service");
      num = 3;
    } else {
      System.out.println(
          "\n_____________________FULL_SHIP_LIST_____________________"
          + "\n~~~~~~~~~~~~~~~~~~~~~ _#_OF_ROOMS_ ~~~~~~~~~~~~~~~~~~~~~"
          + "\nSHIPS\t| Balcony | OceanView | Suite | Interior | Service");
      num = 4;
    }

    for (final var shit : shipList) { //* IDC - PRINTS SHIPLIST'S SHIT ITERATION
      switch (num) {
      case 1:
        System.out.println(shit.toString());
        break;
      case 2:
        if (shit.getservices()) {
          System.out.printf(shit.getshipnames() + "\t" + shit.getbalcony() +
                            "\t" + shit.getoceanview() + "\t" +
                            shit.getsuite() + "\t" + shit.getinterior() +
                            "\t   " + shit.getservices() + "\n");
        }
        break;
      case 3:
        if (!shit.getservices()) {
          System.out.printf(shit.getshipnames() + "\t" + shit.getbalcony() +
                            "\t" + shit.getoceanview() + "\t" +
                            shit.getsuite() + "\t" + shit.getinterior() +
                            "\t   " + shit.getservices() + "\n");
        }
        break;
      case 4:
        System.out.printf(shit.getshipnames() + "\t" + shit.getbalcony() +
                          "\t" + shit.getoceanview() + "\t" + shit.getsuite() +
                          "\t" + shit.getinterior() + "\t   " +
                          shit.getservices() + "\n");
        break;
      }
    }
    System.out.println("\n");
  }

  /*
   * SECONDARY OPERATION OF PROCESSING
   * TAKES USER'S SELECTION AND EXECUTES SPECIFIED METHOD
   * @returns QUIT TO MAIN IF SELECTED
   */
  public static boolean switchion() {
    switch (selection) {
    case '1':
      System.out.println(
          "\n____________________Adding_Ship____________________\n");
      addShip();
      break;
    case '2':
      System.out.println(
          "\n____________________Editing_Ship____________________\n");
      editShip();
      break;
    case '3':
      System.out.println(
          "\n____________________Adding_Cruise____________________\n");
      addCruise();
      break;
    case '4':
      System.out.println(
          "\n____________________Editing_Cruise____________________\n");
      editCruise();
      break;
    case '5':
      System.out.println(
          "\n____________________Adding_Passenger____________________\n");
      addPassenger();
      break;
    case '6':
      System.out.println(
          "\n____________________Editing_Passenger____________________\n");
      editPassenger(num);
      break;
    case 'a':
      PrintShipList("name");
      break;
    case 'b':
      PrintShipList("inservice");
      break;
    case 'c':
      PrintShipList("service");
      break;
    case 'd':
      System.out.println(
          "\n___________________Printing_Cruise_List____________________\n");
      for (Cruise c : cruiseList) {
        System.out.println(c);
      }
      break;
    case 'e':
      System.out.println(
          "\n____________________Printing_Cruise_Details____________________\n");
      printCruiseList();
      break;
    case 'f':
      System.out.println(
          "\n____________________Printing_Passenger_List____________________\n");
      printPassengerList();
      break;
    case '0':
      System.out.println("\n___________________QUITTING____________________\n");
      quit = true;
      break;
    default:
      System.out.println("\n_INVALID_INPUT_\n");
    }
    return quit;
  }

  /*
   * DISPLAYS A SELECTION FOR USER TO CHOOSE FROM
   * @returns SELECTION FOR FURTHER PROCESSING
   */
  public static char menu() {
    System.out.println( //* OOH $0 PWETTY
        "\n================================================\n"
        + "\tLuxury Ocean Cruise Outings\n\t     System Menu List");
    System.out.println("\n[1] Add Ship            [A] Print Ship Names"
                       + "\n[2] Edit Ship           [B] Print Ships In-Service"
                       + "\n[3] Add Cruise          [C] Print Ships"
                       + "\n[4] Edit Cruise         [D] Print Cruises"
                       + "\n[5] Add Passenger       [E] Print Cruise Details"
                       + "\n[6] Edit Passenger      [F] Print Passengers"
                       + "\n[0] QUIT\n\nSELECTION: ");
    selection = in.nextLine().toLowerCase().charAt(0);
    return selection;
  }

  /*
   * INITIALIES HARDCODED DATA FOR MENU
   * RUNS THROUGH THE MENU TILL USER SPECIFIES QUIT
   * @param args
   */
  public static void main(final String[] args) { //* MAIN METHOD
    //* HARDCODED ARRAYLIST DATA SET
    initializeShipList();
    initializeCruiseList();
    initializePassengerList();

    do {
      menu();
      switchion();
      System.out.println("\n_______________________________________________");
      in.nextLine();
    } while (!quit);
    System.out.println( //* OOH $0 PWETTY
        "========================"
        + "\n+ + C# >= C++ > JAVA + +"
        + "\n========================\n");
  }
}
