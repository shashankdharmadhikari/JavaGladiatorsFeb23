package poojasd23.string;
import java.util.Scanner;
public class ReverseArray {
    int[] reversearray(int a[]) {
    	int rarr[]=new int[a.length];
    	int count=0;
    	for(int index=a.length-1;index>=0;index--) {
    		rarr[count]=a[index];
    		count++;
    	}
    	return rarr;
    }
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		ReverseArray ar=new ReverseArray();
		
		System.out.println("Enter the number of elements you wants to store:-");
		a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the elements in the array:- ");
		for(int index=0;index<a;index++) 
			arr[index]=sc.nextInt();
		
		
	    System.out.println("Elements in the array are:- ");
		for(int index=0;index<a;index++) {
			System.out.println(arr[index]);
		}
		int r[]=ar.reversearray(arr);
		for(int index=0;index<r.length;index++) {
			System.out.println(r[index]+" ");
		}
		
	}
}
