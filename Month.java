import java.util.*;

public class Month {
	ArrayList<Cell> Days = new ArrayList<Cell>();
	String month_name;
	
	public Month(int num, String name)
	{
		month_name = name;
		for (int i = 0; i < num; i++)
		{
			Days.add(new Cell(i));
		}
	}
}
