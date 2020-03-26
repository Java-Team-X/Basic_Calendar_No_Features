import java.util.*;

public class Year {
	
	HashMap<Integer, Month> Months = new HashMap<>();
	boolean leapYear = false;
	int year_num;
	
	public Year(int year)
	{
		year_num = year;
		Months.put(1, new Month(31, "January"));
		Months.put(2, new Month(28, "February"));
		Months.put(3, new Month(31, "March"));
		Months.put(4, new Month(30, "April"));
		Months.put(5, new Month(31, "May"));
		Months.put(6, new Month(30, "June"));
		Months.put(7, new Month(31, "July"));
		Months.put(8, new Month(31, "August"));
		Months.put(9, new Month(30, "September"));
		Months.put(10, new Month(31, "October"));
		Months.put(11, new Month(30, "November"));
		Months.put(12, new Month(31, "December"));
	}
	
	public Year(int year, boolean this_is_a_leap_year)
	{
		year_num = year;
		leapYear = true;
		Months.put(1, new Month(31, "January"));
		Months.put(2, new Month(29, "February"));
		Months.put(3, new Month(31, "March"));
		Months.put(4, new Month(30, "April"));
		Months.put(5, new Month(31, "May"));
		Months.put(6, new Month(30, "June"));
		Months.put(7, new Month(31, "July"));
		Months.put(8, new Month(31, "August"));
		Months.put(9, new Month(30, "September"));
		Months.put(10, new Month(31, "October"));
		Months.put(11, new Month(30, "November"));
		Months.put(12, new Month(31, "December"));
	}
	
}