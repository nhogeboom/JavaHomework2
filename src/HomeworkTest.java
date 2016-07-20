import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class HomeworkTest {

	@Test
	public void testGetSumOfNumbers() {
		Homework homework1 = new Homework();
		int actual = homework1.getSumOfNumbers("Does 1 + 1 equal 5?");
		int expected = 7;
		assertEquals(actual, expected, 0);
	}
	
	@Test
	public void testSortIgnoringSpaces() {
		Homework homework2 = new Homework();
		String[] stringToSort = {"name","Awesome","my","is"};
		String[] actual = homework2.sortIgnoringSpaces(stringToSort);
		String[] expected = {"Awesome","is","my","name"};
		assertArrayEquals(actual, expected);
	}
}