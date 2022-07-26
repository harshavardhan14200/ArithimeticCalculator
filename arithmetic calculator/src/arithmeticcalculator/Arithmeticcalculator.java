package arithmeticcalculator;
import java.util.Scanner;

public class Arithmeticcalculator {
		public static void main(String[] args) {
			char Operator;
			double num1,num2,Result;
			Scanner scanner = new Scanner(System.in);
			System.out.println("select an operator : (+) , (-) , (*) ,(/)");
			Operator = scanner.next().charAt(0);
		
			System.out.println("ENTER FIRST NUMBER");
			num1 = scanner.nextDouble();
			
			System.out.println("ENTER SECOND NUMBER");
			num2 = scanner.nextDouble();
					
			switch(Operator) {
			case '+':
				Result = num1 + num2;
				System.out.print("ANSWER IS : " );
				System.out.print(num1 + " + " + num2 +" = " + Result);
				break;
			case '-':
				Result = num1 - num2;
				System.out.print("ANSWER IS : " );
				System.out.print(num1 + " - " + num2 +" = " + Result);
			    break;
			case '*':
				Result = num1 * num2;
				System.out.print("ANSWER IS : " );
				System.out.print(num1 + " * " + num2 +" = " + Result);
				break;
			case '/':
				Result = num1 / num2;
				System.out.print("ANSWER IS : " );
				System.out.print(num1 + " / " + num2 +" = " + Result);
				break;
			default:
		        System.out.println("YOU ARE SELETED AN INAVLID OPERATOR");
		        break;		
			}
		}
	}


