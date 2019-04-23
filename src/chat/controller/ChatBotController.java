package chat.controller;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import chat.model.ChatBot;
import javax.swing.*;
import java.util.ArrayList;



public class ChatBotController
{
	private String userInput;
	private String simpleBot;
	private String userText;
	private ChatFrame appFrame;
	private boolean wasChecked;
	
	public ChatBotController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	public void start()
	{
		
	}
	
	/*public boolean contentChecker(String text)
	wasChecked = false;
	{
		 if(input )
	}
	*/
	
	public String processText(String userText)
	{
		String answer = "";
		
		if(!validityChecker(userText))
		{
			answer += "You really should not send null\n";
		}
		else
		{
			answer += "You said: " + userText + "\n";
			
			if (contentChecker(userText))
			{
				answer += "You said the special words.. \n";
			}
			int randomIndex = (int) (responseList.size() * Math.random());
			answer += "Chatbot says: " + responseList.get(randomIndex) + "\n";
		}
		return answer;
	}
	
	public boolean validityChecker(String text)
	{
		boolean isValid = false;
		
		if(text!= null && text.length() > 3)
		{
			isValid = true;
		}
		return isValid;
	}
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		output += simpleBot.processText(text);
		return output;
	}
	
	public String useChatbotCheckers(String text)
	{
		String testedValues = "The following checkers passed:";
		if (simpleBot.contentChecker(text))
		{
			testedValues =+ "\nContent Checker";
		}
		if (simpleBot.spookyChecker(text))
		{
			testedValues += "\nSpooky Checker Happy Halloween" ;
		}
		if (simpleBot.validityChecker(text))
		{
			testedValues+= "\nValidity Checker";
		}
		return testedValues;
	}
	
	private void close()
	{
		System.exit(0);
	}
	
	
	public ChatBot getChatbot()
	{
		return simpleBot;
	}
	
	
	
	private String interactWithChatBot(String text)
	{
		String output = "";
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
	
	private void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}
	
	public ChatBot getChatBot()
	{
		return simpleBot;
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