import java.util.Random;
import java.util.Scanner;

public class test2ex 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int result = Math.abs(rand.nextInt(100) % 5);

		
				System.out.println(result);
				

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		System.out.println(sentence);
	

	}
}

