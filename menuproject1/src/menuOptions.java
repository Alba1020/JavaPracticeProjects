import java.util.Scanner;

public class menuOptions {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int userSelection;
		boolean m = false;
		
		do
		{
			menuOptions();
			userSelection = scan.nextInt();
			
			switch(userSelection)
			{
			case 1:
				System.out.println("Printing Report of States");
				break;
			case 2:
				System.out.println("Sort states by name");
				break;
			case 3:
				System.out.println("Sort by Case Fatality Rate");
				break;
			case 4:
				System.out.println("Sort by MHI");
				break;
			case 5:
				System.out.println("Find and print a given State");
				break;
			case 6:
				System.out.println("Print Spearman's rho matrix");
				break;
			case 7:
				System.out.println("You decided to exit. Have a good day");
				m = true;
				break;
			default:
				System.out.println("Invalid input! Enter a number from 1-6");
			}
		}while(!m);
		

	}
	
	public static void menuOptions()
	{
		System.out.println("\n\n1. Print a States Report");
		System.out.println("2. Sort by Name");
		System.out.println("3.Sort by Case Fatality Rate");
		System.out.println("4. Sort by Median Household Income");
		System.out.println("5. Find and print a given State");
		System.out.println("6. Print Spearman's rho matrix");
		System.out.println("7. Exit");
		System.out.print("Enter your choice: ");
	}
}
