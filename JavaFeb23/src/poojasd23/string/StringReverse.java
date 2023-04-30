package poojasd23.string;

public class StringReverse {

	public static void main(String[] args) {
		String name="SHAHSHANK";
		String reverse="";
		for(int index=name.length()-1;index>=0;index++) {
			char ch=name.charAt(index);
			reverse=reverse+ch;
		}
		
		System.out.println("Reverse of string is:-"+reverse);
				

	}

}
