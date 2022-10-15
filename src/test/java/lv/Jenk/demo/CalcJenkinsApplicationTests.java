package lv.Jenk.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcJenkinsApplicationTests {

	@Test
	public void testCalculator() {
		CalcJenkinsApplication calc = new CalcJenkinsApplication();

	        assertTrue(calc.doMath("1", 5, 7) == 12.0);
	        assertTrue(calc.doMath("2", 5, 7) == -2.0);
	        assertTrue(calc.doMath("3", 5, 7) == (5.0/7.0));
	        assertTrue(calc.doMath("4", 5, 7) == (5.0*7.0));
	}

}
