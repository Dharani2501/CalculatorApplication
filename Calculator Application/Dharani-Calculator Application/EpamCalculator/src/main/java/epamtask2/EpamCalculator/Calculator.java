package epamtask2.EpamCalculator;
import epamtask2.EpamCalculator.Operation.*;
import java.util.Scanner;

	public class Calculator {

		static int c;
		private static int cur = 0, temp = 0;
		private static Scanner sc;

		
		public static int add(int a, int b) {
			return a+b;
		}

		
		public static int sub(int a, int b) {
			return a-b;
		}

		
		public static int mul(int a, int b) {
			return a*b;
		}

		
		public static int div(int a, int b) {
			return a/b;
		}

		static void printMenu(int cur) {
			
			System.out.println("[ " + cur + " ]");
			
			System.out.println("1. Addition of two numbers");
			System.out.println("2. Subtraction of two numbers");
			System.out.println("3. Multiplication of two numbers");
			System.out.println("4. Division of two numbers");
			System.out.println("5. Clear");
			System.out.println("6. Exit");
			System.out.println("Enter your choice : ");
		}

		
		public static void main(String[] args) {

			sc = new Scanner(System.in);
			do {
				printMenu(cur);
				c = takeInput() - 1;
				operator(Operation.values()[c]);
			} while (Operation.values()[c] != Operation.EXIT);
		}

		private static void operator(Operation c) {
			switch (c) {
			case ADD:
				System.out.println("Enter Number : ");
				temp = takeInput();
				cur = add(cur, temp);
				break;
			case SUB:
				System.out.println("Enter Number : ");
				temp = takeInput();
				cur = sub(cur, temp);
				break;
			case MUL:
				System.out.println("Enter Number : ");
				temp = takeInput();
				cur = mul(cur, temp);
				break;
			case DIV:
				System.out.println("Enter Number : ");
				temp = takeInput();
				cur = div(cur, temp);
				break;
			case CLEAR:
				cur = 0;
				break;
			case EXIT:
				System.out.println("Status: EXIT");
				break;
			default:
				System.out.println("Please, enter the correct option!");
			}

		}

		private static int takeInput() {
			int c = -1;
			try {
				c = sc.nextInt();
			} catch (Exception e) {
				c = -1;
				e.printStackTrace();
			}
			return c;
		}
	}

