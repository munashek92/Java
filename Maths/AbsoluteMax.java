package Maths;

import java.util.Arrays;
//import

/**
 * description:
 *
 * <p>absMax([0, 5, 1, 11]) = 11, absMax([3 , -10, -2]) = -10
 */
public class AbsoluteMax {
  public static void main(String[] args) {
    int[] testnums = {-2, 0, 16};
    assert absMax(testnums) == 16;

    int[] numbers = {3, -10, -2};
    System.out.println("absMax(" + Arrays.toString(numbers) + ") = " + absMax(numbers));
  }

  /**
   * get the value, return the absolute max value
   *
   * @param numbers contains elements
   * @return the absolute max value
   */
  public static int absMax(int[] numbers) {
    int absMaxValue = numbers[0];
    for (int i = 1, length = numbers.length; i < length; ++i) {
      if (Math.abs(numbers[i]) > Math.abs(absMaxValue)) {
        absMaxValue = numbers[i];
      }
    }
    return absMaxValue;
  }
}
