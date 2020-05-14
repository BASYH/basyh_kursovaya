package kursovaya;

import static org.junit.Assert.*;
import org.junit.Test;

//создание класса
public class HelpMe {
	@Test
	public void test() {
		//создание экземпл€ра класса
		Calc calc = new Calc();
		//расчет тура с введенными данными
		int result = Calc.calc(20000, 1,3000,7,1);
		//сравнение переменной result и верного значени€
				assertEquals(41000,result);

	}
	}

