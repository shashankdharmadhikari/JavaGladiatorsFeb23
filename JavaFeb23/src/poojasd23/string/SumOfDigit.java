package poojasd23.string;

public class SumOfDigit {
	
	int SumOfDigit1(String str)
	{
		int sum1=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
			sum1=sum1+Character.getNumericValue(ch);
			}
		}
		return sum1;
	}
	

	public static void main(String[] args) {
		String str="P4ooJ23A1";
		SumOfDigit sum1=new SumOfDigit();
		int sum=sum1.SumOfDigit1(str);
		System.out.println("Sum of digit in string is:="+sum);
		

	}

}
