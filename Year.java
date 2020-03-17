import java.util.*;

public class Year {
	
	ArrayList<Month> Months = new ArrayList<Month>();
	boolean leapYear = false;
	int year_num;
	
	public Year(int year)
	{
		year_num = year;
		Months.add(new Month(31, "January"));
		Months.add(new Month(28, "February"));
		Months.add(new Month(31, "March"));
		Months.add(new Month(30, "April"));
		Months.add(new Month(31, "May"));
		Months.add(new Month(30, "June"));
		Months.add(new Month(31, "July"));
		Months.add(new Month(31, "August"));
		Months.add(new Month(30, "September"));
		Months.add(new Month(31, "October"));
		Months.add(new Month(30, "November"));
		Months.add(new Month(31, "December"));
	}
	
	public Year(int year, boolean this_is_a_leap_year)
	{
		year_num = year;
		leapYear = true;
		Months.add(new Month(31, "January"));
		Months.add(new Month(29, "February"));
		Months.add(new Month(31, "March"));
		Months.add(new Month(30, "April"));
		Months.add(new Month(31, "May"));
		Months.add(new Month(30, "June"));
		Months.add(new Month(31, "July"));
		Months.add(new Month(31, "August"));
		Months.add(new Month(30, "September"));
		Months.add(new Month(31, "October"));
		Months.add(new Month(30, "November"));
		Months.add(new Month(31, "December"));
	}
	
}