import java.util.*;

public class Month {

	
	HashMap<Integer, Cell> Days = new HashMap<>();
	String month_name;
	
	public Month(int num, String name)
	{
		month_name = name;
		for (int i = 0; i < num; i++)
		{
			Days.put(i+1, (new Cell(i)));
		}
	}
}
