import java.util.Scanner;
public class Array {
  public static void main(final String[] args) {
    final int[][] t = new int[2][3];
    for (int i = 0; i < t[0].length; i++) {
      System.out.println(t[1][i]);
    }
    for (int i = 0; i < t.length; i++) {
      System.out.println(t[i][2]);
    }

    //* i
    for (int i = 0; i < t.length; i++) {
      for (int j = 0; j < t[i].length; j++) {
        t[i][j] = 0;
      }
    }

    //* j
    final Scanner scan = new Scanner(System.in);
    for (int i = 0; i < t.length; i++) {
      for (int j = 0; j < t[i].length; j++) {
        t[i][j] = scan.nextInt();
      }
    }

    //* k
    int small = t[0][0];
    for (int i = 0; i < t.length; i++) {
      for (int j = 0; j < t[i].length; j++) {
        if (t[i][j] < small) {
          small = t[i][j];
        }
      }
    }

    //* l
    System.out.printf("%d%d%d\n", t[0][0], t[0][1], t[0][2]);

    //* m
    final int total = t[0][2] + t[1][2];

    //* n
    System.out.println("\t0\t1\t2\n");
    for (int i = 0; i < t.length; i++) {
      System.out.println(i);
      for (int j = 0; j < t.length; j++) {
        System.out.printf("\tt[i][j]");
        System.out.println();
      }
    }
    scan.close();
  }
}
