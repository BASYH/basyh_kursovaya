package kursovaya;
//класс расчета
public class Calc{
	public static int calc(int cF,int pC,int hC,int dC, double k) {
		//формула расчета
		double fC = (cF*pC+hC*pC*dC)*k;
		return (int) fC;
	}
}