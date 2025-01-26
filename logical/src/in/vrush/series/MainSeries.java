package in.vrush.series;

import java.util.Scanner;

public class MainSeries {
		public static void main(String[] args) {
			Series series = new Series();
			
			System.out.println("Enter a Number");
			Scanner scanner = new Scanner(System.in);
			int variable = scanner.nextInt();
//			
//			series.setLimit(variable);
//			series.printFibonacciSeries();
			scanner.close();
			
//			series.setLimit(variable);
//			series.printqubeSqureSeries();
			
			series.setLimit(variable);
			series.printNewSeries2();
		}
}
