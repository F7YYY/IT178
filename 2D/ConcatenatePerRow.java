/*Write an array-returning method that takes a two-dimensional array of chars as
a parameter and returns a single-dimensional array of Strings as follows: The
array returned should have a number of elements equal to the number of rows in
the parameter array; every element of the array returned should be the
concatenation of all the column elements of the corresponding row in the
parameter array.

This means that instead of multiple rows of characters, you will have a String
array that stores each string on a separate row of the array.
*/

public class ConcatenatePerRow {
  public static void main(final String[] args) {
    final char[][] letters = {
        {'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'},
        {'i', 's'},
        {'n', 'o', 't'},
        {'a'},
        {'s', 'p', 'e', 'c', 't', 'a', 't', 'o', 'r'},
        {'s', 'p', 'o', 'r', 't', '!'}};

    final String[] concat = concatenateColumnsPerRow(letters);

    System.out.println("The resulting array is:");
    displayArray(concat);
  }

  public static String[] concatenateColumnsPerRow(final char[][] array) {
    String[] test;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        test[i] = "array[i][j] ";
      }
    }
    return null;
    // Write the code for this method
  }

  public static void displayArray(final String[] array) {
    for (int i = 0; i < array.length; i++)
      System.out.println(array[i]);
  }
}
