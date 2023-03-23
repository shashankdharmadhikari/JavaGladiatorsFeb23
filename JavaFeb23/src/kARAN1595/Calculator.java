package kARAN1595;

public class Calculator {

		// TODO Auto-generated method stub
		int x = 20;
		int y = 30;
		int z;
		static int operationCount = 0;

		void additionOfTwoNumbers(int input1, int input2) {
			operationCount++;
			z = input1 + input2;
			displayTotalOperationCount();		
		}

		void subtractionOfTwoNumbers(int input1, int input2) {
			operationCount++;
			z = input1 - input2;
			displayTotalOperationCount();		
		}

		void multiplicationOfTwoNumbers(int input1, int input2) {
			operationCount++;
			z = input1 * input2;
			displayTotalOperationCount();		
		}

		void divisionOfTwoNumbers(int input1, int input2) {
			operationCount++;
			z = input1 / input2;
			displayTotalOperationCount();		
		}
		
		public static  void displayTotalOperationCount() {		
			System.out.println(operationCount);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 Calculator calculator = new Calculator();
			 calculator.additionOfTwoNumbers(calculator.x, calculator.y);
			 calculator.subtractionOfTwoNumbers(calculator.x, calculator.y);
			 calculator.multiplicationOfTwoNumbers(calculator.x, calculator.y);
			 calculator.divisionOfTwoNumbers(calculator.x, calculator.y);
			 System.out.println("Count of operation is " + calculator.operationCount);
	}
}
