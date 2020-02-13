package textbased;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import textbased.Game.ChoiceHandler;

public class UI {
	
	JFrame window;
	
	 Container con;
	 
	 JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	 
	 JLabel titleNameLabel, hpLabel, hpLabelNbr, sanityLabel, sanityLabelNbr, weaponLabel, weaponLabelName,
	 accuracyLabel, accuracyLabelNbr, agilityLabel, agilityLabelNbr,intelligenceLabel, intelligenceLabelNbr;
	 
	 JButton startButton, choice1, choice2, choice3, choice4;
	 
	 JTextArea mainTextArea;
	 
	
	 Font titleFont = new Font("Rockwell", Font.PLAIN, 45);
	 Font storyFont = new Font("Rockwell", Font.PLAIN, 25);
	 Font statFont = new Font("Rockwell", Font.PLAIN, 20);
	
	public void CreateUI(ChoiceHandler cHandler) {
		
		//window
		window = new JFrame();
		window.setSize(1500,900); //width, height
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		//TITLE
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(200,200,1000,150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("The Shadow Over Innsmouth");
		titleNameLabel.setForeground(Color.green);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		//START BUTTON
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(600,500,200,100);
		startButtonPanel.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.green);
		startButton.setFont(storyFont);
		startButton.addActionListener(cHandler);
		startButton.setActionCommand("start");
		startButton.setFocusPainted(false);
		startButtonPanel.add(startButton);
		
		window.add(titleNamePanel); 
		window.add(startButtonPanel);
		
		//GAME SCREEN

		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(5,100,700,700);
		mainTextPanel.setBackground(Color.black);
		window.add(mainTextPanel);
		
		mainTextArea = new JTextArea("First text area");
		mainTextArea.setBounds(5,100,700,700);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.green);
		mainTextArea.setFont(storyFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		mainTextPanel.setEnabled(false);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(750, 600, 600, 200);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		//Button 1
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.green);
		choice1.setFont(storyFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		//Button 2
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.green);
		choice2.setFont(storyFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		//Button 3
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.green);
		choice3.setFont(storyFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		//Button 4
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.green);
		choice4.setFont(storyFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(cHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(5,20,1345,50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,12));
		con.add(playerPanel);
		
		hpLabel = new JLabel("HP: " );
		hpLabel.setFont(statFont);
		hpLabel.setForeground(Color.green);
		playerPanel.add(hpLabel);
		
		hpLabelNbr = new JLabel();
		hpLabelNbr.setFont(statFont);
		hpLabelNbr.setForeground(Color.green);
		playerPanel.add(hpLabelNbr);
		
		sanityLabel = new JLabel("Sanity: " );
		sanityLabel.setFont(statFont);
		sanityLabel.setForeground(Color.green);
		playerPanel.add(sanityLabel);
		
		sanityLabelNbr = new JLabel();
		sanityLabelNbr.setFont(statFont);
		sanityLabelNbr.setForeground(Color.green);
		playerPanel.add(sanityLabelNbr);
		
		weaponLabel = new JLabel("Weapon: ");
		weaponLabel.setFont(statFont);
		weaponLabel.setForeground(Color.green);
		playerPanel.add(weaponLabel);
		
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(statFont);
		weaponLabelName.setForeground(Color.green);
		playerPanel.add(weaponLabelName);
		
		accuracyLabel = new JLabel("Accuracy: ");
		accuracyLabel.setFont(statFont);
		accuracyLabel.setForeground(Color.yellow);
		playerPanel.add(accuracyLabel);
		
		accuracyLabelNbr = new JLabel();
		accuracyLabelNbr.setFont(statFont);
		accuracyLabelNbr.setForeground(Color.yellow);
		playerPanel.add(accuracyLabelNbr);
		
		agilityLabel = new JLabel("Agility: ");
		agilityLabel.setFont(statFont);
		agilityLabel.setForeground(Color.orange);
		playerPanel.add(agilityLabel);
		
		agilityLabelNbr = new JLabel();
		agilityLabelNbr.setFont(statFont);
		agilityLabelNbr.setForeground(Color.orange);
		playerPanel.add(agilityLabelNbr);
		
		intelligenceLabel = new JLabel("Intellect: ");
		intelligenceLabel.setFont(statFont);
		intelligenceLabel.setForeground(Color.blue);
		playerPanel.add(intelligenceLabel);
		
		intelligenceLabelNbr = new JLabel();
		intelligenceLabelNbr.setFont(statFont);
		intelligenceLabelNbr.setForeground(Color.blue);
		playerPanel.add(intelligenceLabelNbr);
		
		window.setVisible(true);
		 
	}
}
