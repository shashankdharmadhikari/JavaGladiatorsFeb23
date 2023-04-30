package poojasd23.string;

public class SwappingOfString {

	public static void main(String[] args) {
		String str="Pooja";
		String str1="Daware";
		System.out.println("Before Swapping String is- " +str+" "+str1);
		str=str+str1;
		str1=str.substring(0, str.length()-str1.length());
		str=str1.substring(str1.length());
		System.out.println("After Swapping String is- " +str+" "+str1);

	}

}
