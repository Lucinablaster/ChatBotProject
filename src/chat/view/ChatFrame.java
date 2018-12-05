package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatBotController;

public class ChatFrame extends JFrame
{

	private ChatBotController chatController;
	private ChatPanel chatPanel;
	
	public ChatFrame(ChatBotController chatController)
	{
		super();
		this.chatController = chatController;
		this.chatPanel = new ChatPanel(chatController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(chatPanel);;
		this.setSize(800, 600);
		this.setTitle("Chatbot 2.0");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
