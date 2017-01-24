import java.util.Scanner;

public class calculator
	{
		static int operation;
		static String problem;
		static double number1;
		static double number2;
		public static void main(String[] args)
			{
			greetUser();
			}
		public static void greetUser()
		{
			System.out.println("Please select the number for your chosen operation.");
			System.out.println("1.) Addition");
			System.out.println("2.) Subtraction");
			System.out.println("3.) Multiplication");
			System.out.println("4.) Division");
			System.out.println("5.) Exponents");
			Scanner userInput = new Scanner(System.in);
			int operation = userInput.nextInt ();
			if (operation == 1)
				{
					System.out.println("ok, what is the first number would you like to add?");
					Scanner userInput1 = new Scanner(System.in);
					number1 = userInput1.nextDouble ();
					System.out.println("ok, what is the second number would you like to add?");
					Scanner userInput2 = new Scanner(System.in);
					number2 = userInput2.nextDouble ();
					System.out.println(add (number1, number2));
					System.exit(0);
				}
				else if (operation == 2)
				{
					System.out.println("ok, what is the first number would you like to subtract?");
					Scanner userInput1 = new Scanner(System.in);
				 number1 = userInput.nextDouble ();
					System.out.println("ok, what is the second number would you like to subtract?");
					Scanner userInput2 = new Scanner(System.in);
					number2 = userInput.nextDouble ();	
					System.out.println(subtract (number1, number2));
					System.exit(0);
				}
				else if (operation == 3)
				{
					System.out.println("ok, what is the first number you want to multiply?");
					Scanner userInput1 = new Scanner(System.in);
					number1 = userInput1.nextDouble ();
					System.out.println("ok, what is the second number you want to multiply?");
					Scanner userInput2 = new Scanner(System.in);
					number2 = userInput2.nextDouble ();
					System.out.println( multiply (number1, number2));
					System.exit(0);
				}
				else if (operation == 4)
				{
					
					System.out.println("ok, what is the first number would you like to divide?");
					Scanner userInput1 = new Scanner(System.in);
					number1 = userInput1.nextDouble ();
					System.out.println("ok, what is the second number would you like to divide?");
					Scanner userInput2 = new Scanner(System.in);
					number2 = userInput2.nextDouble ();
					System.out.println(divide (number1, number2));
					System.exit(0);
				}
				else
				{
					System.out.println("ok, what is the first number in your operation?");
					Scanner userInput1 = new Scanner(System.in);
					number1 = userInput1.nextDouble ();
					System.out.println("ok, what is the second number in your operation?");
					Scanner userInput2 = new Scanner(System.in);
					number2 = userInput2.nextDouble ();		
					System.out.println(increaseExponent (number1, number2));
					System.exit(0);
				}
			
		}
		public static double add(double x, double y)
		{
			return x + y;
		}
		public static double divide(double x, double y)
		{
			
			return x / y;
		}
		public static double subtract(double x, double y)
		{
			
			return x - y;
		}
		public static double multiply(double x, double y)
		{
			
			return x * y;
		}
		public static double increaseExponent(double x, double y)
		{
			return Math.pow(x, y);
		}
		
		
			
			
			
	}
