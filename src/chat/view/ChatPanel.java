package chat.view;

import javax.swing.*;
import chat.controller.ChatBotController;
import chat.controller.IOController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class ChatPanel extends JPanel
{
	private ChatBotController chatController;
	private SpringLayout appLayout;
	private SpringLayout appLayout_1;
	private JLabel chatLabel;
	private JButton saveButton;
	private JButton loadButton;
	private JButton chatButton;
	private JButton checkerButton;
	private JTextField chatField;
	private JTextField chatField_1;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatBotController chatController)
	{
		super();
		
		
		this.chatController = chatController;
		appLayout = new SpringLayout();
		

		chatButton = new JButton("Chat");
		saveButton = new JButton("Save");
		checkerButton = new JButton("Check Text");
		chatField = new JTextField("Talk to the bot here", 50);
		loadButton = new JButton("Load");
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chatArea = new JTextArea("Chat Area", 20, 50);
		
		
		
		chatButton.setBackground(Color.WHITE);
		appLayout_1 = new SpringLayout();
		appLayout_1.putConstraint(SpringLayout.WEST, chatButton, 35, SpringLayout.EAST, checkerButton);
		appLayout_1.putConstraint(SpringLayout.EAST, chatButton, -61, SpringLayout.WEST, saveButton);
		appLayout_1.putConstraint(SpringLayout.SOUTH, checkerButton, 0, SpringLayout.SOUTH, chatButton);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatButton, -53, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, loadButton, -53, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, saveButton, -53, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, saveButton, -176, SpringLayout.WEST, loadButton);
		appLayout_1.putConstraint(SpringLayout.EAST, saveButton, -61, SpringLayout.WEST, loadButton);
		chatPane = new JScrollPane();
		chatField_1 = new JTextField();
		appLayout_1.putConstraint(SpringLayout.EAST, checkerButton, 160, SpringLayout.WEST, chatField_1);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatButton, 26, SpringLayout.SOUTH, chatField_1);
		appLayout_1.putConstraint(SpringLayout.NORTH, checkerButton, 28, SpringLayout.SOUTH, chatField_1);
		appLayout_1.putConstraint(SpringLayout.WEST, checkerButton, 0, SpringLayout.WEST, chatField_1);
		appLayout_1.putConstraint(SpringLayout.NORTH, loadButton, 26, SpringLayout.SOUTH, chatField_1);
		appLayout_1.putConstraint(SpringLayout.NORTH, saveButton, 26, SpringLayout.SOUTH, chatField_1);
		appLayout_1.putConstraint(SpringLayout.WEST, loadButton, -135, SpringLayout.EAST, chatField_1);
		appLayout_1.putConstraint(SpringLayout.EAST, loadButton, 0, SpringLayout.EAST, chatField_1);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatField_1, 22, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, chatField_1, 42, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatField_1, 445, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.EAST, chatField_1, 731, SpringLayout.WEST, this);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
		
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void changeBackground()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout_1);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.MAGENTA);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(chatLabel);
		this.add(chatField_1);
		this.add(checkerButton);
		chatArea = new JTextArea();
		
		add(chatArea);
	}
	
	private void setupLayout()
	{
		appLayout_1 = new SpringLayout();
		appLayout_1.putConstraint(SpringLayout.NORTH, saveButton, 436, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, checkerButton, -50, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, loadButton, -50, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, saveButton, 11, SpringLayout.EAST, loadButton);
		appLayout_1.putConstraint(SpringLayout.SOUTH, saveButton, -50, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.EAST, saveButton, -6, SpringLayout.WEST, chatButton);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatButton, 0, SpringLayout.SOUTH, saveButton);
		appLayout_1.putConstraint(SpringLayout.WEST, loadButton, 12, SpringLayout.EAST, checkerButton);
		appLayout_1.putConstraint(SpringLayout.EAST, loadButton, -445, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.EAST, checkerButton, 193, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatButton, 436, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, chatButton, -242, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.WEST, checkerButton, 48, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatLabel, 30, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, chatLabel, 50, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatLabel, -580, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.EAST, chatLabel, -795, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatPane, 250, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, chatPane, 25, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatField_1, 49, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, chatField_1, 19, SpringLayout.EAST, chatPane);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatField_1, 357, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.EAST, chatField_1, -79, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatArea, -202, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, checkerButton, 38, SpringLayout.SOUTH, chatArea);
		appLayout_1.putConstraint(SpringLayout.NORTH, loadButton, 38, SpringLayout.SOUTH, chatArea);
		appLayout_1.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		appLayout_1.putConstraint(SpringLayout.WEST, chatArea, 48, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.EAST, chatArea, -67, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				String input = chatField.getText();
				String output = "";
				output = chatController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
		saveButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				String chatText = chatArea.getText();
				String path = ".";
				IOController.saveText(chatController, path, chatText);
				chatArea.setText("Chat saved!");
			}
		});
		loadButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackground();
			}
		});
		checkerButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackground();
			}
		});
	}
	
	
}
