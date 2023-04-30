package poojasd23.string;

public class StringPalindrome {

	static boolean isPalindrome(String str) {
		boolean a= false;
		String reverse="";
		for(int index=str.length()-1;index>=0;index--) {
			char ch=str.charAt(index);
			reverse=reverse+ch;
		}
		if (str.equals(reverse))
		{
			a=true;
		}
		return a;
	}
	public static void main(String[] args) {
		String str ="Ram";
		boolean a= StringPalindrome.isPalindrome(str);
		if(a) {
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		

	}

}
