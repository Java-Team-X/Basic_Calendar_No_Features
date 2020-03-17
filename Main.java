import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Year> Calendar = new ArrayList<Year>();
		
		//Create Calendar years based on a range of alterable dates
		for (int i = 2021; i < 2023; i++)
		{
			//Check if its a leap year.  If not, create a regular year.
			if (i % 4 == 0)
				Calendar.add(new Year(i, true));
			else
				Calendar.add(new Year(i));
		}
		
		int count = 0;
		
		//For each year,
		for (int i = 0; i < Calendar.size(); i++)
		{
			System.out.println(Calendar.get(i).year_num);
			
			//For each Month,
			for (int j = 0; j < Calendar.get(i).Months.size(); j++)
			{
				System.out.println(Calendar.get(i).Months.get(j).month_name + "\nMonday  Tuesday  "
						+ "Wednesday  Thursday  Friday  Saturday  Sunday");
				
				//For each day,
				for (int k = 0; k < Calendar.get(i).Months.get(j).Days.size(); k++)
				{
					System.out.print((Calendar.get(i).Months.get(j).Days.get(k).day + 1) + " ");
					count++;
					if (count % 7 == 0)
					{
						System.out.println();
						count = 0;
					}
				}
				System.out.println();
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}

}
