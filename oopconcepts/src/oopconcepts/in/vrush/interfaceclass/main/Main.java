package oopconcepts.in.vrush.interfaceclass.main;
import oopconcepts.in.vrush.interfaceclass.implementation.*;
import oopconcepts.in.vrush.interfaceclass.*;

public class Main {
	public static void main(String[] args) {
		 Calculator calc = new AddCalc();
		 calc.printMessage("Hello");
		 calc.printMessage(calc.calculate(10, 20)+"");
		 
		 Calculator calc1 = new SubCalc();
		 calc1.printMessage(calc1.calculate(20, 10)+"");
		 
		 Calculator calc2 = new MultiCalc();
		 calc2.printMessage(calc2.calculate(10, 20)+"");
		 
		 Calculator calc3 = new DivCalc();
		 calc3.printMessage(calc3.calculate(20, 10)+"");
	}
}
