package com.myjava.string;

import java.io.BufferedReader;
import java.io.FileReader;

public class GenerateID {
	private String generate_id()
	{
		String id=" ";
		String thisLine;
		String[] fullText = new String[200];
		String[] lastLine=new String[5];
		int counter=0,nid=0,l=0,z=0;

		boolean b=checkFile("Item.txt");

		if(b==false)
		{
			id="00001";
		}
		else
		{
			try
			{
				frs=new FileReader("Item.txt");
			 	br=new BufferedReader(frs);
				while((thisLine=br.readLine()) != null)
				{
					counter=counter+1;
					fullText[counter] = thisLine;
				}
				frs.close();
 				lastLine=fullText[counter].split(",");
 				nid=Integer.parseInt(lastLine[0]);
 				nid=nid+1;
 				l=(String.valueOf(nid)).length();
 				z=5-l;
 				for(int i=1;i<=z;i++)
 				{
 					id=id+"0";	
 				}
 				id=id+String.valueOf(nid);
 				id=id.substring(1);
			}
			catch(Exception ex)
			{
				System.out.println("Could not generate the Item ID...!");
			}
		}
		return id;
	}



}
