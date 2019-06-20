
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BinarySearchTest {
  
  private int[] numbers;
  
  @BeforeEach
  public void init() {
    numbers = new int[]{22, 48, 69, 90, 150, 168, 182, 199, 201, 240};
  }
  
  @Test
  public void test_givenASortedArray_correctIndexIsFound() {    
    assertEquals(2, BinarySearch.findIndex(numbers, 69), "The index of 69 should be 3");
  
    assertEquals(5, BinarySearch.findIndex(numbers, 168), "The index of 168 should be 5");
  
    assertEquals(7, BinarySearch.findIndex(numbers, 199), "The index of 240 should be 9");
  }
  
  @Test
  public void test_givenEmptyArray_noIndexIsFound() {
    numbers = new int[0];
    
    assertEquals(-1, BinarySearch.findIndex(numbers, 0), "The index of 0 should be -1 since array is empty"); 
  }
  
  @Test
  public void test_givenNumberHasMiddleIndex_correctIndexIsFound() {
    assertEquals(4, BinarySearch.findIndex(numbers, 150), "The index of 150 should be 4");
  }

  @Test
  public void test_givenNumberHasLowestIndex_correctIndexIsFound() {
    assertEquals(0, BinarySearch.findIndex(numbers, 22), "The index of 2 should be 0");
  }
  
  @Test
  public void test_givenNumberHasHighestIndex_correctIndexIsFound() {
    assertEquals(9, BinarySearch.findIndex(numbers, 240), "The index of 240 should be 9");
  }
}
