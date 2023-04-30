package poojasd23.string;

public class StringRotation {

	
	public static void main(String[] args) {
	  String str1="abcdef";
	  String str2="fghijk";
	  if(str1.length()!=str2.length()) {
		  System.out.println("Strings are not rotational");
	  }
	  else {
		  str1=str1.concat(str2);
		  System.out.println(str1);
	  }
	  if(str1.indexOf(str2)!=-1)
		  System.out.println("Strings are rotational");
	  else
		  System.out.println("Strings are not rotational");
	}

}
