package poojasd23.string;

public class string1 {

	public static void main(String[] args)
	{
		String name = "POOJA SD";
		String reverse="";
		for(int index=name.length()-1;index>=0;index--)
		{
			char ch=name.charAt(index);
			reverse=reverse+ch;
		}
		System.out.print (reverse);
	}
}
