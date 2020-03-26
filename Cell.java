
public class Cell {
	int day;
	String info = null;
	
	public Cell(int num)
	{
		day = num;
	}
	
	public void add_string(String arg)
	{
		if (info == null)
			info = arg;
		else
			info = info + ("\n" + arg);
	}
	
	public void display()
	{
		if (info == null)
			System.out.println("Nothing on the agenda!\n");
		else
			System.out.println(info + "\n");
	}
}
