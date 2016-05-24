
public class Datetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date newDate = new Date(12, 12, 2004);
		System.out.println("newDate: " + newDate.toString());
		
		newDate.setMonth(5);
		System.out.println("newDate: " + newDate.toString());
		
		Date Date_no_default = new Date();
		Date_no_default.setDay(10);
		Date_no_default.setMonth(2);
		Date_no_default.setYear(2010);

		System.out.println("Date_no_default: " + Date_no_default.toString());
		
		int year_test = Date_no_default.getYear();
		int day_test = Date_no_default.getDay();
		int month_test = Date_no_default.getMonth();
		
		System.out.println("Tomorrow is: " + month_test + "/" + (day_test + 1) + "/" + year_test);
		
		
	}

}
