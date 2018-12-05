package chat.model;

import java.util.ArrayList;

public class ChatBot
{
	private ArrayList<String> spookyList;
	private ArrayList<String> responseList;
	private boolean isContentValid;
	private boolean isValid;
	
	private String name;
	private String userInput;
	private String content;
	private String joke;
	private String currentUser;
	
	
	public void Chatbot()
	{
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
		return answer;
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	public boolean contentChecker()
	{
		isContentValid = false;
		
		return isContentValid;
	}
	
	public boolean legitimacyChecker(String input)
	{
		isValid = false;
		
		return isValid;
	}
	
	
	public String useChatbotCheckers(String text)
	{
		String testedValues = "The follwing checkers passed:";
		if (simpleBot.contentChecker(text))
		{
			testedValues += 
		}
	}
	string answer = '';
	if usertext == nulll
			answer += you should really not send null
			else
				answer += you
	
	
	public boolean spookyChecker(String input)
	{
		Boolean isSpooky = false;
		
		if(input.contains("Halloween"))
		{
			isSpooky = true;
		}
		
		else if(input.contains("Easter"))
		{
			isSpooky = false;
		}
		return isSpooky;
	}
}
