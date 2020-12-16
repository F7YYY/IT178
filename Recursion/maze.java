/*
 *  FILE:       MAZE.JAVA
 *
 *  DATE:       OCTOBER 10, 2020
 *  CLASS:      IT 178
 */
package Recursion;
import java.util.Scanner;

public class maze { //* DRIVER
                    //* INSTANCES / INITIALIZED
  static Scanner in = new Scanner(System.in);
  static boolean done = false;
  static int r, c;
  static char x = 'X';
  static private char[][] maze = new char[][] {
      {'█', '█', '█', '█', '█', '█', '█', '█', '█', '█', '█', '█'},
      {'█', ' ', ' ', ' ', '█', ' ', ' ', ' ', ' ', ' ', ' ', '█'},
      {' ', ' ', '█', ' ', '█', ' ', '█', '█', '█', '█', ' ', '█'},
      {'█', '█', '█', ' ', '█', ' ', ' ', ' ', ' ', '█', ' ', '█'},
      {'█', ' ', ' ', ' ', ' ', '█', '█', '█', ' ', '█', ' ', ' '},
      {'█', '█', '█', '█', ' ', '█', ' ', '█', ' ', '█', ' ', '█'},
      {'█', ' ', ' ', '█', ' ', '█', ' ', '█', ' ', '█', ' ', '█'},
      {'█', '█', ' ', '█', ' ', '█', ' ', '█', ' ', '█', ' ', '█'},
      {'█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '█', ' ', '█'},
      {'█', '█', '█', '█', '█', '█', ' ', '█', '█', '█', ' ', '█'},
      {'█', ' ', ' ', ' ', ' ', ' ', ' ', '█', ' ', ' ', ' ', '█'},
      {'█', '█', '█', '█', '█', '█', '█', '█', '█', '█', '█', '█'}};
  static private String shit = "\n_________THIS_CLASS_________"
                               + "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░"
                               + "\n░░░░░░░░░░░░░░░░▓▓▓▓▀█░░░░░░"
                               + "\n░░░░░░░░░░░░░▄▀▓▓▄██████▄░░░"
                               + "\n░░░░░░░░░░░░▄█▄█▀░░▄░▄░█▀░░░"
                               + "\n░░░░░░░░░░░▄▀░██▄░░▀░▀░▀▄░░░"
                               + "\n░░░░░░░░░░░▀▄░░▀░▄█▄▄░░▄█▄░░"
                               + "\n░░░░░░░░░░░░░▀█▄▄░░▀▀▀█▀░░░░"
                               + "\n░░░░░░░░░░░░░█░░░░░░░░▄▀▀░▐░"
                               + "\n░░░░░░░░░░░▄▀░░░░░░░░▐░▄▄▀░░"
                               + "\n░░░░░░░░░▄▀░░░▐░░░░░█▄▀░▐░░░"
                               + "\n░░░░░░░░░█░░░▐░░░░░░░░▄░█░░░"
                               + "\n░░░░░░░░░░█▄░░▀▄░░░░▄▀▐░█░░░"
                               + "\n░░░░░░░░░░█▐▀▀▀░▀▀▀▀░░▐░█░░░"
                               + "\n░░░░░░░░░▐█▐▄░░▀░░░░░░▐░█▄▄░"
                               + "\n░░░░░░░░░░▀▀░░░▀░░░░░░▐▄▄▄▀░"
                               + "\n░░░░░░░░░░░░░░░▀░░░░░░░░░░░░"
                               + "\n░░░░░▓▓▓▓▓▓▓▓▓▓▀░░░░░░░░░░░░"
                               + "\n░░░▓▓▓▓▓▓▒▒▒▒▒▒▀▓░░░░░░░░░░░"
                               + "\n░░▓▓▓▓▒░░▒▒▓▓▒▒▓▓▓▓░░░░░░░░░"
                               + "\n░▓▓▓▓▒░░▓▓▓▒▄▓░▒▄▄▄▓░░░░░░░░"
                               + "\n▓▓▓▓▓▒░░▒▀▀▀▀▒░▄░▄▒▓▓░░░░░░░"
                               + "\n▓▓▓▓▓▒░░▒▒▒▒▒▓▒▀▒▀▒▓▒▓░░░░░░"
                               + "\n▓▓▓▓▓▒▒░░░▒▒▒░░▄▀▀▀▄▓▒▓░░░░░"
                               + "\n▓▓▓▓▓▓▒▒░░░▒▒▓▀▄▄▄▄▓▒▒▒▓░░░░"
                               + "\n░▓█▀▄▒▓▒▒░░░▒▒░░▀▀▀▒▒▒▒░░░░░"
                               + "\n░░▓█▒▒▄▒▒▒▒▒▒▒░░▒▒▒▒▒▒▓░░░░░"
                               + "\n░░░▓▓▓▓▒▒▒▒▒▒▒▒░░░▒▒▒▓▓░░░░░"
                               + "\n░░░░░▓▓▒░░▒▒▒▒▒▒▒▒▒▒▒▓▓░░░░░"
                               + "\n░░░░░░▓▒▒░░░░▒▒▒▒▒▒▒▓▓░░░░░░"
                               + "\n░░░░░░__THE_STUDENTS__░░░░░░\n";

  /*
   * PINT - PRINTS THE CHARACTER ARRAY
   */
  public static void print() {
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze[i].length; j++) {
        System.out.printf(" " + maze[i][j]);
      }
      System.out.println();
    }
  }

  /*
   * MOVE VALIDATES WHETHER A MOVE A AVAILABLE
   * @param r - ROWS
   * @param c - COLUMBS
   * @return TRUE OR FALSE DEPENDING ON CHECK
   */
  public static boolean move(int r, int c) {
    if ((r >= 0 && r <= 11 && c >= 0 && c <= 11) && maze[r][c] == ' ') {
      return true;
    } else if ((r == 0 || r == 11 || c == 0 || c == 11) && maze[r][c] == x) {
      System.out.println("\n~~ FINISHED ~~\n");
      return done = true;
    } else
      return false;
  }

  /*
   * BACKTRACK RETRACES THE # OF MOVES MADE IN MAZETRAVERSE RECURSIVELY
   * IF A NEW SPACE IS FOUND THEN MAZE CAN TRAVERSE
   * @param count - COUNTS THE MOVES
   * @param r - ROWS
   * @param c - COLUMBS
   */
  public static void backtrack(int count, int r, int c) {
    while (count >= 2) {
      if (maze[r][c] == x)
        maze[r][c] = ' ';
      backtrack(count - 1, r, c);
    }
  }

  /*
   * MAZETRAVERSE RECURSIVELY ITERATES THROUGHT THE MAZE
   * CALLS MOVE TO FIND A VALID POSITION AND COMPLETENESS
   * CALL BACKTRACK IF NO MOVES ARE LEFT TO REVERSE TO OUTLET
   * WHILE VALIDATING USER INPUT TIL QUIT
   * @param r - ROWS
   * @param c - COLUMBS
   */
  public static void mazeTravere(int r, int c) {
    //* INSTANCES / INITIALIZED
    char yn;
    int count = 0;

    maze[r][c] = x;
    print();
    System.out.println("\nCONTNUE? [Y|N]: ");
    yn = in.nextLine().toLowerCase().charAt(0);
    if (yn == 'y') {
      if (move(r + 1, c)) {
        count += 1;
        mazeTravere(r + 1, c);
      } else if (move(r - 1, c)) {
        count += 1;
        mazeTravere(r - 1, c);
      } else if (move(r, c + 1)) {
        count += 1;
        mazeTravere(r, c + 1);
      } else if (move(r, c - 1)) {
        count += 1;
        mazeTravere(r, c - 1);
      } else if (!move(r, c)) {
        backtrack(count, r, c);
      }
    } else if (yn == 'n') {
      done = true;
    } else {
      System.out.println("\n_INVALID_INPUT_\n");
      in.nextLine();
    }
  }

  public static void main(String[] args) { //* MAIN
    do {                 //* CONTINUE UNTIL USER SPECIFIES QUIT
      mazeTravere(2, 0); //* HARDCODED START
    } while (!done);
    System.out.println(shit);
    in.close();
    System.exit(0);
  }
}
