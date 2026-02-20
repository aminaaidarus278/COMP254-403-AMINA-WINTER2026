package ex1;/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      total += arr[j];
    return total;

    /*

     Let n = arr.length

     The for loop runs from 0 to n-1

     That means the loop executes n times

     Each iteration performs a constant-time operation:
     total += arr[j] → O(1)

     n * O(1) = O(n)

     The running time is O(n) (linear time)

     */

  }

  /** Returns the sum of the integers with even index in given array. */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j += 2)    // note the increment of 2
      total += arr[j];
    return total;

    /*
    Let n = arr.length

    The for loop runs from 0 to n-1 ( loop: j = 0,2,4,6,8)

    That means the loop executes n/2 times

    Each iteration performs a constant-time operation:
    total += arr[j] → O(2)

    n/2 * O(1) = O(n/2)

    In big oh , we drop constants , so O(n/2) = O(n)

    The running time is O(n) linear time

    */
  }

  /** Returns the sum of the prefix sums of given array. */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      for (int k=0; k <= j; k++)    // loop from 0 to j
        total += arr[j];
    return total;

       /*

    Let n = arr.length

    The outer loop runs n times
    For each iteration j, the inner loop runs j+ 1 times

    That means the loop executes n^2 times

    Each iteration performs a constant-time operation:
    total += arr[j] → O(2)

    n^2 * O(1) = O(n^2)

    The running time is O(n^2) quadratic time

    */


  }

  /** Returns the sum of the prefix sums of given array. */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0;
    for (int j=0; j < n; j++) {     // loop from 0 to n-1
      prefix += arr[j];
      total += prefix;
    }
    return total;

       /*

    Let n = arr.length

    The for loop runs from 0 to n-1

    That means the loop executes n times

    Each iteration performs a constant-time operation:
    prefix += arr[j] = O(1)
    total += prefix = O(1)

    The running time is O(n) linear time

    */


  }

  /** Returns the number of times second array stores sum of prefix sums from first. */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;
    for (int i=0; i < n; i++) {     // loop from 0 to n-1
      int total = 0;
      for (int j=0; j < n; j++)     // loop from 0 to n-1
        for (int k=0; k <= j; k++)  // loop from 0 to j
          total += first[k];
      if (second[i] == total) count++;
    }
    return count;

    /*
    Let n = first.length

    The outer loop runs n times
    the second loop inside it runs n times too
    and the third loop runs n+ 1 times for each value of n
    so, it runs n(n+1)/2 = approximately n^2/2 times

    inner two loops - O(n^2)
    outer loop - n
    n*n^2 = n^3

    The running time is O(n^3) cubic time

     */

  }

}
