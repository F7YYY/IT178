public class carbonFootprintDriver { //* CARBON-FOOTPRINT DRIVER
  //* INSTANCES
  static carbonfootprint[] cfp = new carbonfootprint[3];
  public static void
  main(final String[] args) { //* MAIN
                              //* HARDCODED FOOTPRINT ARRAY TYPES
    cfp[0] = new bicycle();
    cfp[1] = new building(12345, true, false, true, false);
    cfp[2] = new car(10);

    for (var print : cfp) { //* ENHANCED FORLOOP RETURNING EACH OVERRIDE
      System.out.println(print.toString());
    }
  }
}
