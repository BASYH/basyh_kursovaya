package kursovaya;
import static org.junit.Assert.*;
import org.junit.Test;

public class HelpMe2 {

	@Test
	public void test1() {
		boolean actual = NewJFrame.isDigit("14");
	    assertTrue(actual);

	    actual = NewJFrame.isDigit("32");
	    assertFalse(actual);
	}
}
