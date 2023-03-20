package tejas;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Month=7;
		String monthnumber="";
		
		
		switch(Month) {
		
		case 1:
			monthnumber="Jan";
			break;
			
		case 2:
			monthnumber="Feb";
			break;
			
		case 3:
			monthnumber="march";
			break;
			
		case 4:
			monthnumber="April";	
			break;
			
		case 5:
			monthnumber="may";
			break;
			
		case 6:
			monthnumber="June";
			break;
			
		case 7:
			monthnumber="july";
			break;
			
		case 8:
			monthnumber="august";
			break;
			
		case 9:
			monthnumber="sept";
			break;
			
		case 10:
			monthnumber="oct";
			break;
			
		case 11:
			monthnumber="nov";
			break;
			
		case 12:
			monthnumber="dec";
			break;
			
		default : 
			monthnumber="month not avaliable";

	}
		System.out.println("The month is "+ monthnumber);
}
}
