import java.io.*;

import org.gedcom4j.parser.GedcomParserException;

public class Gedcom {
	
	public static String line =null;
	public static int indi;
	
	//Print total number of individual in the family
	public static void individual(BufferedReader br) throws IOException
	{
		BufferedReader br1 = br;
		while ((line = br1.readLine()) != null) {
			if (line.contains("@I") && (line.contains("INDI"))) 
				indi = indi + 1;
		}
		System.out.println("Total Individual in the family are "+indi);
	} //[Sprint1_US01_AM]
	
	public static void birthBeforeDeath(BufferedReader br) throws IOException
	{
		BufferedReader br1 = br;
		while ((line = br1.readLine()) != null) {
			if (line.contains("@I") && (line.contains("INDI"))) 
				indi = indi + 1;
		}
		System.out.println("Total Individual in the family are "+indi);
	} //[Sprint1_US01_AM]	
		
	
	public static void main(String[] args) throws IOException,GedcomParserException {
		// TODO Auto-generated method stub
		
		FileReader fin= new FileReader("C:/Users/Ambika/Documents/GitHub/CS-555WS-Team-1/Project 3/Family.ged");
		//PrintWriter output = new PrintWriter(new FileWriter("C:/Users/Ambika/Documents/GitHub/CS-555WS-Team-1/Project 3/p03output.txt"));
		BufferedReader br = new BufferedReader(fin);
		
		individual(br); 
	
		
		//[Sprint1_US01_AM]
		
		
	}

}
