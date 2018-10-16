package model;

import java.util.ArrayList;

public class ChatBot
{
	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	
	private String name;
	private String userInput;
	private String content;
	private String joke;
	private String currentUser;
	
	
	public ChatBot()
	{
		this.joke = "No u";
		this.content = new String("This is the content and stuff");
		this.currentUser = new String("Default user lul boring");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("I don't understand? Could you ask that better?");
		responseList.add("I don't think that insults are necessary right now, could you ask that again?");
		responseList.add("I found a few things related to " + "searchResultPlaceholder" + " this search, which one did you mean?");
		
		spookyList.add("Halloween is better than Cashmas!");
		spookyList.add("Jack Skellington");
		spookyList.add("This is Halloween! THIS IS HALLOWEEN!");
		spookyList.add("Let's carve out some pumpkins to have some fun!");
		spookyList.add("When will we get Halloween Lucina in FEH? Smh seriously...");
	}

	public String processText(String userText)
	{
		String answer = "";
		answer += "You said: " + userText;
		return answer;
	}
}
