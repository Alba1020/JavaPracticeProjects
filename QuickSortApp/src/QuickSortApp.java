
public class QuickSortApp 
{

	public static void main(String[] args) 
	{
		int maxSize = 16;
		
		ArrayIns arr = new ArrayIns(maxSize);
		
		arr.insert(69);
		arr.insert(0);
		arr.insert(70);
		arr.insert(6);
		arr.insert(38);
		arr.insert(38);
		arr.insert(24);
		arr.insert(56);
		arr.insert(44);
		arr.insert(26);
		arr.insert(73);
		arr.insert(77);
		arr.insert(30);
		arr.insert(45);
		arr.insert(97);
		arr.insert(65);
		
		arr.display();
		arr.quickSort();
		arr.display();

	}

}
