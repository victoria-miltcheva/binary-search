
public class BinarySearch {

  /**
   * 
   * Takes in a sorted array and a number which it attempts to find the index of.
   * The middle index is returned if it equals that number, otherwise low and high
   * indices are set according to whether the middle value was too high or too
   * low. This process is repeated until the index is found, or until the indices
   * are equal. -1 is returned if the number's index was not found.
   * 
   * @param numbers Sorted array of integers
   * @param number  Number to find the index of
   * @return
   */
  protected static int findIndex(int[] numbers, int number) {
    if (numbers.length == 0) {
      return -1;
    }

    int low = 0;
    int high = numbers.length - 1;
    int mid;
    int midValue;

    while (low <= high) {
      mid = (low + high) / 2;
      midValue = numbers[mid];

      if (number == midValue) {
        return mid;
      } else if (number < midValue) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }
}
