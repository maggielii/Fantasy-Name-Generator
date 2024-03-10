package code;

import java.io.File;
import java.util.Scanner;

public class FantasyNameGenerator {

	public static void main(String[] args)throws Exception {
		
		File maleNamesInfile = new File("maleNames.txt");
		File femaleNamesInfile = new File("femaleNames.txt");
		File lastNamesInfile = new File("lastNames.txt");
		
		for(int count = 0; count < 10; count++)
		{	
			int min = 0, max = 1;
			int gender = (int)(Math.random()*(max-min + 1)+ min);
			
			Scanner maleNamesInput = new Scanner( maleNamesInfile );
			Scanner femaleNamesInput = new Scanner( femaleNamesInfile );
			Scanner lastNamesInput = new Scanner( lastNamesInfile );
			
			min = 1;
			max = 20;
			
			int randomNameNumber = (int)(Math.random()*(max-min + 1)+ min); 
			
			String name = "";
		
			if(gender == 0)
			{
				for(int x = 0; x < randomNameNumber; x++)
				{
					name = maleNamesInput.next();
				}
				System.out.print(name + " ");
			}
			else 
			{
				for(int x = 0; x < randomNameNumber; x++)
				{
					name = femaleNamesInput.next();
				}
				System.out.print(name + " ");
			}
			
			int randomLastNameNumber = (int)(Math.random()*(max-min + 1)+ min);
			for(int x = 0; x < randomLastNameNumber; x++)
			{
				name = lastNamesInput.next();
			}
			System.out.println(name);
			
//			maleNamesInput.close();
//			femaleNamesInput.close();
//			lastNamesInput.close();
		}
	}
}
