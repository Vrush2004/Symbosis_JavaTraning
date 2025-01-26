package in.vrush.menudriven;
import java.util.*;
import in.vrush.menudriven.Helper.*;

public class MainHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        
        int option = 0;
        do {
            option = helper.printMenu(scanner);
            System.out.println(option);
            switch(option) {
                case 1: helper.checkPalindromeNumber(scanner); 
                        break;
                case 2: helper.checkPerfectNumber(scanner);  
                        break;
                case 3: helper.checkPrimeNumber(scanner);  
                        break;
                case 4: helper.checkArmstrongNumber(scanner); 
                        break;
                case 5: helper.reverseStrings(scanner);  
                		break;
                case 6: helper.reverseStringLine(scanner);  
        				break;
                case 7: helper.characterCount(scanner); 
						break;
                case 8: helper.fibonacciSeries(scanner); 
						break;
                case 0: System.out.println("Bye....");
                        break;
                default: System.out.println("Invalid Input....");
            }
            
        } while(option != 0);
    }
}