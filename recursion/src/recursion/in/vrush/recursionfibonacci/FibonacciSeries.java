package recursion.in.vrush.recursionfibonacci;

public class FibonacciSeries {
	public int fibonacciSeries(int number) {
		if(number<=1) {
			return number;
		}
		return fibonacciSeries(number-1) + fibonacciSeries(number-2);
		
//		return (number<=1) ? number : fibonacciSeries(number-1)+ fibonacciSeries(number-2);
	}
}
