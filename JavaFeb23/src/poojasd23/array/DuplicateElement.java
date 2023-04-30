package poojasd23.array;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[]= {2,3,4,3,0,4};
		for(int index=0;index<arr.length;index++) {
			
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++){
				
			 if(arr[index]==arr[innerIndex]) {
			 System.out.println(arr[index]);
			 break;
			 }
			}
		}

	}

}
