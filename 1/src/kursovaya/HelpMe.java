package kursovaya;

import static org.junit.Assert.*;
import org.junit.Test;

//�������� ������
public class HelpMe {
	@Test
	public void test() {
		//�������� ���������� ������
		Calc calc = new Calc();
		//������ ���� � ���������� �������
		int result = Calc.calc(20000, 1,3000,7,1);
		//��������� ���������� result � ������� ��������
				assertEquals(41000,result);

	}
	}

