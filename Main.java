import java.util.*;

public class Main {

	public static void main(String[] args) {

		int startYear = 2021;
		int endYear = 2023;
		HashMap<Integer, Year> Calendar = new HashMap<>();
		for (int i = startYear; i < endYear; i++)
		{
			//Check if its a leap year.  If not, create a regular year.
			if (i % 4 == 0)
				Calendar.put(i, new Year(i, true));
			else
				Calendar.put(i, new Year(i));
		}
		
		
		Scanner s = new Scanner(System.in);
		String user_input = " ";
		int p = 0;
		int q = 0;
		int r = 0;		
		
		
		//user loop
		while (!user_input.equals("exit") && !user_input.equals("Exit"))
		{
			System.out.print("1.  View all calendar years\n2.  View one year\n3.  View one month\n4.  View"
					+ " one week\n5.  View one day\n6.  Add info to a day\n7."
					+ "  Clear info from a day\nexit\n\n");
			user_input = s.nextLine();
			
			if (user_input.equals("1"))
				displayAll(Calendar, startYear, endYear);
			
			
			else if (user_input.contentEquals("2"))
			{
				
				System.out.print("Year: ");
				user_input = s.nextLine();
				try
				{
					try
					{
					p = Integer.parseInt(user_input.trim());

					displayAll(Calendar, p, p + 1);
				    }
					
				    catch (NumberFormatException nfe)
				    {
				      System.out.println("That was not a valid number!\n");
				    }
				}
				
		        catch(NullPointerException e) 
		        { 
		            System.out.println("That year couldn't be found!\n"); 
		        } 
			}
			
			else if (user_input.contentEquals("3"))
			{
				
				System.out.print("Year: ");
				user_input = s.nextLine();
				try
				{
					try
					{
					p = Integer.parseInt(user_input.trim());
					
					System.out.print("Month: ");
					user_input = s.nextLine();
					try
					{
						q = Integer.parseInt(user_input.trim());

						displayMonth(Calendar, p, q);
					}
						
					    catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
					
				    catch (NumberFormatException nfe)
				    {
				      System.out.println("That was not a valid number!\n");
				    }
				}
				
		        catch(NullPointerException e) 
		        { 
		            System.out.println("That date couldn't be found!\n"); 
		        } 
			}	
			
			else if (user_input.contentEquals("5"))
			{
				
				System.out.print("Year: ");
				user_input = s.nextLine();
				try
				{
					try
					{
					p = Integer.parseInt(user_input.trim());
					
					System.out.print("Month: ");
					user_input = s.nextLine();
					try
					{
						q = Integer.parseInt(user_input.trim());

						System.out.print("Day: ");
						user_input = s.nextLine();
						try
						{
							r = Integer.parseInt(user_input.trim());
							System.out.print("\n" + Calendar.get(p).Months.get(q).month_name + " " + 
									Calendar.get(p).Months.get(q).Days.get(r).day + "\n");
							
							Calendar.get(p).Months.get(q).Days.get(r).display();
							System.out.println();
						}
						catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
						
					    catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
					
				    catch (NumberFormatException nfe)
				    {
				      System.out.println("That was not a valid number!\n");
				    }
				}
				
		        catch(NullPointerException e) 
		        { 
		            System.out.println("That date couldn't be found!\n"); 
		        } 
			}
			
			else if (user_input.contentEquals("6"))
			{
				
				System.out.print("Year: ");
				user_input = s.nextLine();
				try
				{
					try
					{
					p = Integer.parseInt(user_input.trim());
					
					System.out.print("Month: ");
					user_input = s.nextLine();
					try
					{
						q = Integer.parseInt(user_input.trim());

						System.out.print("Day: ");
						user_input = s.nextLine();
						try
						{
							r = Integer.parseInt(user_input.trim());
							
							Calendar.get(p).Months.get(q).Days.get(r); //creates Exception before output
							
							System.out.println("What would you like to add?");
							
							//issue here - only allows for one line to be added
							user_input = s.nextLine();
							
							Calendar.get(p).Months.get(q).Days.get(r).add_string(user_input);
							System.out.println("Added!\n");
							System.out.println();
						}
						catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
						
					    catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
					
				    catch (NumberFormatException nfe)
				    {
				      System.out.println("That was not a valid number!\n");
				    }
				}
				
		        catch(NullPointerException e) 
		        { 
		            System.out.println("That date couldn't be found!\n"); 
		        } 
			}	
			
			else if (user_input.contentEquals("7"))
			{
				
				System.out.print("Year: ");
				user_input = s.nextLine();
				try
				{
					try
					{
					p = Integer.parseInt(user_input.trim());
					
					System.out.print("Month: ");
					user_input = s.nextLine();
					try
					{
						q = Integer.parseInt(user_input.trim());

						System.out.print("Day: ");
						user_input = s.nextLine();
						try
						{
							r = Integer.parseInt(user_input.trim());
							
							Calendar.get(p).Months.get(q).Days.get(r).info = null;
							System.out.println("Cleared!\n");
							System.out.println();
						}
						catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
						
					    catch (NumberFormatException nfe)
					    {
					      System.out.println("That was not a valid number!\n");
					    }
					}
					
				    catch (NumberFormatException nfe)
				    {
				      System.out.println("That was not a valid number!\n");
				    }
				}
				
		        catch(NullPointerException e) 
		        { 
		            System.out.println("That date couldn't be found!\n"); 
		        } 
			}	
				
		}
		s.close();
	}
	

	public static void displayAll(HashMap<Integer, Year> Calendar, int startYear, int endYear)
	{
		
		int count = 0;
		
		//For each year,
		for (int i = startYear; i < endYear; i++)
		{
			System.out.println(Calendar.get(i).year_num);
			
			//For each Month,
			for (int j = 1; j < 13; j++)
			{
				System.out.println(Calendar.get(i).Months.get(j).month_name + "\nMonday    "
						+ "Tuesday   Wednesday Thursday  Friday    Saturday  Sunday");
				
				
				//Formatting
				for (int m = 0; m < count; m++)
					System.out.print("          ");
				
				//For each day,
				for (int k = 1; k < Calendar.get(i).Months.get(j).Days.size() + 1; k++)
				{
					if (Calendar.get(i).Months.get(j).Days.get(k).info == null)
					{
						if (k > 9)
							System.out.print((k) + "        ");
						else
							System.out.print((k) + "         ");
					}
					else
					{
						if (k > 9)
							System.out.print((k) + "*       ");
						else
							System.out.print((k) + "*        ");
					}

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
	
	public static void displayMonth(HashMap<Integer, Year> Calendar, int year, int month)
	{
		int count = 0;
		
		System.out.println(Calendar.get(year).Months.get(month).month_name + "\nMonday    "
				+ "Tuesday   Wednesday Thursday  Friday    Saturday  Sunday");
		
		
		//Formatting
		for (int m = 0; m < count; m++)
			System.out.print("          ");
		
		//For each day,
		for (int k = 1; k < Calendar.get(year).Months.get(month).Days.size() + 1; k++)
		{
			if (Calendar.get(year).Months.get(month).Days.get(k).info == null)
			{
				if (k > 9)
					System.out.print((k) + "        ");
				else
					System.out.print((k) + "         ");
			}
			else
			{
				if (k > 9)
					System.out.print((k) + "*       ");
				else
					System.out.print((k) + "*        ");
			}

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

}
