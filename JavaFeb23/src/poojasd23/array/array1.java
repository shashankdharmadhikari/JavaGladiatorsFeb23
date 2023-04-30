package poojasd23.array;
public class array1 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		for (int index=0;index<=a.length-1;index++)
		{
         System.out.print(a[index]+" ");
		}
		for(int innerindex=a.length-1;innerindex>=0;innerindex--)
		{
			System.out.print(a[innerindex]+" ");
		}

	}

}
