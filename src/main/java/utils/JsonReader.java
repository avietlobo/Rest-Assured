package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

public class JsonReader {
	
	
	public static String readJsonfile(String filename)
	{
		 String data="";
		
		try
		{
		
         data=new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"\\src\\main\\java\\JSON\\" + filename)));
	 
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return data;
    
	}

}
