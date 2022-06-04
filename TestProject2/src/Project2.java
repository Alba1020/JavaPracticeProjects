import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Project2 
{

	@SuppressWarnings("hiding")
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = null;
		Scanner kb = new Scanner(System.in);
		String fileName = null;
		State[] s = new State[50];
		Scanner lineScanner = null;
		String line = null;
		int i;
		int index = 0;
		String l;
		
		System.out.println("COP3530 Project 2");
		System.out.println("Instructor: Xudong Liu\n");
		System.out.println("Stacks and Priority Queues");
		System.out.println("Input Something: ");
		fileName = kb.nextLine();
		kb.close();

		try 
		{
			br = new BufferedReader(new FileReader(fileName));
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("Could not Find File!");
			e.printStackTrace();
		}

		catch (IOException e) 
		{
			e.printStackTrace();
		}
		line = br.readLine();
		for (i = 0; (line = br.readLine()) != null; i++)
		{
			s[i] = new State();
			index = 0;
				lineScanner = new Scanner(line);
				lineScanner.useDelimiter(",\r\n");
				while (lineScanner.hasNext())
				{
					String data = lineScanner.next();
					switch (index) 
						{

							case 0:
								s[i].setName(data);
					
								break;
							case 1:
								s[i].setCapitol(data);
								break;
							case 2:
								s[i].setRegion(data);
								lineScanner.next();
								index++;
								break;
							case 4:
								s[i].setPopulation(Long.parseLong(data));
								break;
							case 5:
								s[i].setcovidCases(Long.parseLong(data));
								break;
							case 6:
								s[i].setcovidDeaths(Long.parseLong(data));
								break;
							case 7:
								s[i].setMHI(Long.parseLong(data));
								break;
							case 8:
								s[i].setVCR(Float.parseFloat(data));
								break;
						}
							index++;

				}
		}
	}
}
