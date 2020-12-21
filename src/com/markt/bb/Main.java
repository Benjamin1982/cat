package com.markt.bb;
import java.io.*;
import java.util.Scanner;

public class Main 
{
	static File datei = null;
	static boolean scanning = true;
	public static void main(String[] args) 
	{
		System.out.println("Geben Sie einen Namen der Datei ein:");
		Scanner s = new Scanner(System.in);
		String neu = s.next();
		while(scanning)
		{
		System.out.println("Sie wollen eine Datei mit Namen "+neu+" öffen? (J|N)");
		Scanner c = new Scanner(System.in);
		String x = c.next();
		char[] test = x.toCharArray();
		for(int z = 0 ; z < test.length ; z++)
		{
			System.out.println(">>"+test[z]);
		}
		if(test[0]== 'J')
		{
			scanning = false;
			String FILENAME;
			FILENAME = "./"+neu+".txt";
			datei = new File(FILENAME);
			if(datei.exists())
				System.out.println("Datei gefunden");
			else
				// let error be true
				System.err.println("Datei wurde nicht gefunden");
			try
			{
				System.out.println("Es wird nur lesend auf die Datei zugegriffen . . .");
				Thread.sleep(3000);
				// 
				System.out.println();
				System.out.println("Ergebnis:");
				BufferedReader br = new BufferedReader(new FileReader(datei)); 
				  
				  String st; 
				  while ((st = br.readLine()) != null) 
				    System.out.println(st);
				  System.out.println("EOF erreicht");
			}
			catch(Exception iowait)
			{
				// make a doc
				System.err.println("Ein unerwartetes Ereignis ist aufgetreten. Programm wird beendet. Exit code = 0x78");
			}
		}
		else if(test[0] == 'N')
		{
			scanning = false;
			System.out.println("Programm beendet");
		}
		else
		{
			System.out.println("ungueltige Eingabe!");
		}
		}
		String[] menge = {};
		
		// TODO Auto-generated method stub,"Herrenberg,
		
		 
	}

}
