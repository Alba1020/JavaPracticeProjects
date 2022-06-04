
public class StackApp 
{

	public static void main(String[] args) 
	{
		StackTest theStack = new StackTest(10); // make new stack
		theStack.push(20); // push items onto stack
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);

		while( !theStack.isEmpty() ) // until it’s empty,
		{ // delete item from stack
		long value = theStack.pop();
		System.out.print(value); // display it
		System.out.println();
		} // end while
		System.out.println();

		

	}

}
