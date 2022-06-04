
public class Main
{

	public static void main(String[] args)
	{
		Person john = new Person("John");
		Person hana = new Person("Hana");
		Person peter = new Person("Peter");
		Person tom = new Person("Tom");
		Person becky = new Person("Becky");
		
		john.parent = becky;
		peter.parent = tom;
		hana.parent = becky;
		becky.parent = peter;
		
		String result = hana.parent.parent.parent.name;
		
		System.out.println(tom.parent);
		
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		
		b.next = a;
		c.next = b;
		
		char resultNode = c.next.next.value;
		
		System.out.println(a.next);

	}
	


}
