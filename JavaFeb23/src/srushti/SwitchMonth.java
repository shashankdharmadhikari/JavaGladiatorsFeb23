package srushti;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MonthNum=9;
		String Month="";
		
		switch (MonthNum) {
		
		case 1:
			Month="Jan";
			break;
		
		case 2:
			Month="Feb";
			break;
		case 3:
			Month="Mar";
			break;
		case 4:
			Month="April";
			break;
		case 5:
			Month="May";
			break;
		case 6:
			Month="June";
			break;
		case 7:
			Month="July";
			break;
		case 8:
			Month="Aug";
			break;
		case 9:
			Month="Sept";
			break;
		case 10:
			Month="Oct";
			break;
		case 11:
			Month="Nov";
			break;
		case 12:
			Month="Dec";
			break;
			
			default:
			Month ="Invalid";
		}
System.out.println(Month);
	}

}
