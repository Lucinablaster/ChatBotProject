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
		String userInput = "";
		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatBot(userInput);
		}
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
	
}