
public class Cell {
	int day;
	String info;
	
	public Cell(int num)
	{
		day = num;
	}
	
	public void add_string(String arg)
	{
		info = info + (arg + "\n");
	}
	
	public void display()
	{
		System.out.println(info);
	}
}
