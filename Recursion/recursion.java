import java.util.Scanner;
public class recursion {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String EXTENSION = "edu";
    String[] addresses = new String[5];
    System.out.println("Enter 5 Internet Addresses: ");

    for (int i = 0; i < 5; i++) {
      addresses[i] = scan.next();
    }
    int count = countExRecursion(addresses, 0, EXTENSION);
    System.out.println("The # of addresses with: " + EXTENSION + " is " +
                       count);
    scan.close();
  }

  public static int countExRecursion(String[] arr, int start, String ext) {
    if (start > arr.length - 1) {
      return 0;
    } else
      return countExRecursion(arr, start, ext);
  }
}
