package chat.controller;

import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JFileChooser;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	public static void saveText(ChatBotController app, String path, String textToSave)
	{
		try
		{
			// This creates a variable with the name "filename" that contains path. Then it accesses the Calendar io method to set the day and month.
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + date.get(Calendar.MONTH)+ " " + date.get(Calendar.DAY_OF_MONTH);
			filename += date.get(Calendar.HOUR) + " " + date.get(Calendar.DAY_OF_MONTH); 
			filename += " chatbot save.txt";
			
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			textScanner.close();
			saveText.close();
			
		}
		catch(IOException error)
		{
			.handleErrors(error);
		}
		catch(Exception genericError)
		{
			.handleErrors(genericError);
		{
	}
	public static void loadFile(ChatBotController app, String path, String textToSave)
	{
		String contents = "";
		
			try
			{
				File saveFile = new File(path);
				Scanner fileScanner;
				if(saveFile.exists())
				{
					fileScanner = new Scanner(saveFile);
					while (fileScanner.hasNext())
					{
						contents += fileScanner.nextLine() + "\n";
					}
				}
			}
		catch(IOException error)
			{
			app.handleErrors(error);
			}
		catch(Exception genericError)
			{
			app.handleErrors(genericError);
			}
		   return contents;
		}
	
	
	private String getPath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if (choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
				
			}
			
		}
		else
		{
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		return path;
	}
	
	}
}
