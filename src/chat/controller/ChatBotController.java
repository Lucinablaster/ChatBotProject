package chat.controller;
import java.util.Scanner;

import javax.swing.JOptionPane;

import chat.model.ChatBot;

import java.util.ArrayList;



public class ChatBotController
{
	private String t;
	private String e;
	private String userInput;
	private String simpleBot;
	
	public ChatBotController()
	{
		simpleBot = new Chatbot();
	}
	public void start()
	{
		interactWithChatBot();
		
		
		String userInput = "";
		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatBot(userInput);
		}
	}
	
	public ChatBot getChatbot()
	{
		return simpleBot;
	}
	
	private String interactWithChatBot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hi what's up??");
		output = simpleBot.processText(userResponse);
		return output;
	}

	public String userInput()
	{
		String description =  "Hello";
		return description;
	}
	
	public boolean sentimentChecker(String text)
	{
		boolean hasSentiment = false;
		
		return hasSentiment;
	}
	
	
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2)
		{
			isValid = false;
		}

		else if (input.contains("sdf") || input.contains("cvb"))
		{
			isValid = false;
			
		}
		return isValid;
	}
	
}