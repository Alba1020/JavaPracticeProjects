
public class ShellSortApp 
{

	public static void main(String[] args) 
	{
		int maxSize = 12;
		
		ArraySh arr = new ArraySh(maxSize);
		
		arr.insert(23);
		arr.insert(54);
		arr.insert(45);
		arr.insert(2);
		arr.insert(91);
		arr.insert(65);
		arr.insert(5);
		arr.insert(31);
		arr.insert(8);
		arr.insert(44);
		arr.insert(4);
		arr.insert(30);
		
		arr.display();
		arr.shellSort();
		arr.display();


	}

}
