import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TempDriver { //* TEMP DRIVER - BEGINNING

  /*
   * AVG ITTERATES MONTHLY AVERAGE FROM ARR INTEGURES
   * @param ar = READ LINES DIVIDED BY TOTAL NUMBERS
   * @return total FOR EACH MONTH
   */
  public static int avg(final int[] ar) {
    //* INITIALIZED INSTANCES
    int total = 0;

    for (int i = 0; i < ar.length; i++) {
      total += ar[i];
    }
    total = total / ar.length;
    return total;
  }

  /*
   * READTEMPS VALIDATES TEMPS.TXT & PARSES TEMPS ROWS BY COLUMBS
   * TEMPATURES STORED IN ALLOCATED 2-DIMENSIONAL JAGGED ARRAY TEMPS
   * RECORD STORES THE ITTERATIONS OF READ COLUMBS
   * QUITS ON EXTERNAL ERROR
   * @param temps - ALLOCATION
   */
  public static void readtemps(final int[][] temps) {
    try {
      //* INITIALIZED INSTANCES
      final BufferedReader in = new BufferedReader(new FileReader("temps.txt"));
      String line;
      String[] ar = new String[0];
      int record = 0;

      for (int i = 0; i < temps.length; i++) {
        for (int j = 0; j < temps[i].length; j++) {
          if (record == 0) {
            if ((line = in.readLine()) != null) {
              ar = line.split(",");
              record = ar.length;
            } else {
              System.out.println("_PARSINIG_ERROR_");
              System.exit(1);
            }
          }
          temps[i][j] = Integer.parseInt(ar[ar.length - record].trim());
          record--;
        }
      }
      in.close();
    } catch (final IOException ioerror) {
      System.out.println("\nIssue_Reading_File\n");
      System.exit(1);
    }
  }

  /*
   * print OOH $0 PWETTY MONTHS
   * SWITCH STASTEMENT INDEXES EACH TEMPATURES CACLUATED AVERAGE
   * QUITS ON INTERNAL ERROR
   * @param arr POINTER TO PLACE HOLDER'S VALUES
   */
  public static void print(final int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      switch (i) {
      case 0:
        System.out.println("JANUARY~ " + arr[i]);
        break;
      case 1:
        System.out.println("FEBURARY~ " + arr[i]);
        break;
      case 2:
        System.out.println("MARCH~ " + arr[i]);
        break;
      case 3:
        System.out.println("APRIL~ " + arr[i]);
        break;
      case 4:
        System.out.println("MAY~ " + arr[i]);
        break;
      case 5:
        System.out.println("JUNE~ " + arr[i]);
        break;
      case 6:
        System.out.println("JULY~ " + arr[i]);
        break;
      case 7:
        System.out.println("AUGUST~ " + arr[i]);
        break;
      case 8:
        System.out.println("SEPTEMBER~ " + arr[i]);
        break;
      case 9:
        System.out.println("OCTOBER~ " + arr[i]);
        break;
      case 10:
        System.out.println("NOVEMBER~ " + arr[i]);
        break;
      case 11:
        System.out.println("DECEMBER~ " + arr[i]);
        break;
      default:
        System.out.println("_SoMeThInGs_Fu@Ed_");
        System.exit(1);
        break;
      }
    }
  }

  /*
   * MAIN ALLOCATES ARRAY TEMPS ARRAY FOR AVERAGE & ITTERATES INTO ARRAY ARR
   * CALLS PRINT TO DISPLAY MONTHLY TEMPATURE AVERAGES
   * @param args
   */
  public static void main(final String[] args) { //* MAIN FUNCTION
    //* INITIALIZED INSTANCES
    int[] arr;
    final int[][] temps = new int[12][];
    temps[0] = new int[31];  //* JANUARY
    temps[1] = new int[28];  //* FEBURARY
    temps[2] = new int[31];  //* MARCH
    temps[3] = new int[30];  //* APRIL
    temps[4] = new int[31];  //* MAY
    temps[5] = new int[30];  //* JUNE
    temps[6] = new int[31];  //* JULY
    temps[7] = new int[31];  //* AUGUST
    temps[8] = new int[30];  //* SEPTEMBER
    temps[9] = new int[31];  //* OCTOBER
    temps[10] = new int[30]; //* NOVEMBER
    temps[11] = new int[31]; //* DECEMBER

    readtemps(temps);
    arr = new int[12];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = avg(temps[i]);
    }

    System.out.println("\n========================"); //* OOH $0 PWETTY
    print(arr);
    System.out.println("========================"
                       + "\n+ + C# => C++ > JAVA + +"
                       + "\n========================\n");
    System.exit(0);
  }
}
