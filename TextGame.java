package textbased;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextGame {
	 
	 JFrame window;
	 Container con;
	 JPanel titleNamePanel, startButtonPanel, firstTextPanel, choiceButtonPanel, playerPanel;
	 JLabel titleNameLabel, hpLabel, hpLabelNbr, sanityLabel, sanityLabelNbr, weaponLabel, weaponLabelName
	 , accuracyLabel, accuracyLabelNbr, agilityLabel, agilityLabelNbr,
	 intelligenceLabel, intelligenceLabelNbr;
	 Font titleFont = new Font("Rockwell", Font.PLAIN, 45);
	 Font storyFont = new Font("Rockwell", Font.PLAIN, 25);
	 Font statFont = new Font("Rockwell", Font.PLAIN, 18);
	 JButton startButton, choice1, choice2, choice3, choice4;
	 JTextArea firstTextArea;
	 int playerHP, playerSanity;
	 String weapon, position, lastPosition;
	 
	 	int playerAccuracy = 0;
		int playerAgility = 60;
		int playerIntelligence = 50;
	 	
	 Random rand = new Random();
	 TitleScreenHandler tsHandler = new TitleScreenHandler();
	 ChoiceHandler choiceHandler = new ChoiceHandler();
	 
	
	 
	public static void main(String[] args) {
		
		new TextGame();

	}
	
	public TextGame() {
		
		window = new JFrame();
		window.setSize(1500,900); //width, height
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(200,200,1000,150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("The Shadow Over Innsmouth");
		titleNameLabel.setForeground(Color.green);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(600,500,200,100);
		startButtonPanel.setBackground(Color.black);
		
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.green);
		startButton.setFont(storyFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel); 
		con.add(startButtonPanel);
		
		window.setVisible(true);
	}

	public void createGameScreen() {
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		firstTextPanel = new JPanel();
		firstTextPanel.setBounds(5,100,700,700);
		firstTextPanel.setBackground(Color.black);
		con.add(firstTextPanel);
		
		firstTextArea = new JTextArea("First text area");
		firstTextArea.setBounds(5,100,700,700);
		firstTextArea.setBackground(Color.black);
		firstTextArea.setForeground(Color.green);
		firstTextArea.setFont(storyFont);
		firstTextArea.setLineWrap(true);
		firstTextPanel.add(firstTextArea);
		firstTextPanel.setEnabled(false);
		
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
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		//Button 2
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.green);
		choice2.setFont(storyFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		//Button 3
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.green);
		choice3.setFont(storyFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		//Button 4
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.green);
		choice4.setFont(storyFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(5,20,1345,50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,12));
		con.add(playerPanel);
		
		hpLabel = new JLabel("HP: " + playerHP );
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
		
		intelligenceLabel = new JLabel("Intelligence: ");
		intelligenceLabel.setFont(statFont);
		intelligenceLabel.setForeground(Color.blue);
		playerPanel.add(intelligenceLabel);
		
		intelligenceLabelNbr = new JLabel();
		intelligenceLabelNbr.setFont(statFont);
		intelligenceLabelNbr.setForeground(Color.blue);
		playerPanel.add(intelligenceLabelNbr);
		
		
	
		
		playerSetup();
		
		
	}
	public void playerSetup() {
		
		
		
		playerHP = 5;
		playerSanity = 5;
		weapon = "Revolver";
		weaponLabelName.setText(weapon);
		hpLabelNbr.setText("" + playerHP);
		sanityLabelNbr.setText("" + playerSanity);
		accuracyLabelNbr.setText(""+ playerAccuracy+"%");
		agilityLabelNbr.setText(""+ playerAgility+"%");
		intelligenceLabelNbr.setText("" + playerIntelligence+"%");
		
		beach();
		
	}
	public void returnToLastPosition() {
		position = lastPosition;
				
	}
	public void fightCheck() {
		lastPosition = position;
		position = "fightCheck";
		
		int a = rand.nextInt(101);
		if (playerAccuracy >= a) {
			attackSucces();
		}else {
			attackFail();
		}
	}
	public void clueCheck() {
		lastPosition = position;
		position = "clueCheck";
		
		int i = rand.nextInt(101);
		if (playerIntelligence >= i) {
			
		}
	}
	public void runCheck() {
		lastPosition = position;
		position = "runCheck";
		
		int r = rand.nextInt(101);
		if (playerAgility >= r) {
			runSucces();
		}else {
			runFail();
		}
	}
	public void sanityCheck() {
		if(playerSanity <= 0) {
			sanityOver();
			
		}
		
	}
	public void attackFail() {
		position = "attackFail";
		firstTextArea.setText("Your shots misses, the enemy at hand \n"
				+ "seems invulnerable no matter what. \nYou begin to doubt your actions and your will decreases.\n"
				+ "The enemy counter attacks and you feel nothing but pain.\n"
				+ "(You recive 2 damage!) (You lose 1 sanity!)");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		playerSanity = playerSanity -1;
		sanityLabelNbr.setText(""+ playerSanity);
		playerHP = playerHP -2;
		hpLabelNbr.setText(""+ playerHP);
		position = lastPosition;
	}
	public void attackSucces() {
		position = "attackSucces";
		firstTextArea.setText("The enemy falls to the ground due to your attack to your suprise.\n"
				+ "For a brief moment you feel at ease, but the thought of whats at hand brings you back\n"
				+ "to your reality.");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void runFail() {
		position = "runFail";
		firstTextArea.setText("You fail to run from your enemy,");
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		playerSanity = playerSanity -1;
		sanityLabelNbr.setText(""+ playerSanity);
		playerHP = playerHP -2;
		hpLabelNbr.setText(""+ playerHP);
	}
	public void runSucces() {
		position = "runSucces";
		firstTextArea.setText("");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void clueFail() {
		position = "clueFail";
		firstTextArea.setText("");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void clueSucces() {
		position = "clueSucces";
		firstTextArea.setText("");
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void sanityOver() {
		position = "sanityOver";
		firstTextArea.setText("Game over!\nYou have gone insane");
		choice1.setText("Start over");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		playerSanity = 15;
		sanityLabelNbr.setText(""+ playerSanity);
		playerHP = 15;
		hpLabelNbr.setText(""+ playerHP);
	}
	
	public void hpOver() {
		position = "hpOver";
		firstTextArea.setText("Game over!\nYou tried your best but faliled, rest in piece");
		choice1.setText("Start over");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		playerHP = 15;
		hpLabelNbr.setText(""+ playerHP);
		sanityLabelNbr.setText(""+ playerSanity);
		playerHP = 15;
	}
	public void hpCheck() {
		if(playerHP <= 0)  {
			hpOver();
		}
		
	}
	
	public void beach() {
		position = "TheBeach";
		
		firstTextArea.setText("You stand on a beach, you wonder where you are and how\n you got there. "
				+ "\nYou look around for a while, you see a strange \ngrotesque 'man' stairing at you. To the east is a \nvillage and "
				+ "to the north is what looks to be a forest.\n \nWhat do you do?");
		
		choice1.setText("Talk to the 'man'");
		choice2.setText("Walk towards the vilage");
		choice3.setText("Attack the hideous 'man'");
		choice4.setText("Walkt towards the forest");
		
	}
	
	public void talkMan() {
		position = "TalkToMan";
		
		firstTextArea.setText("The man screeches strange words and points at you.\n Your vision blures and you fall to the ground."
				+ "\nThe words 'Dagon Rises' seem to edge themself in your mind.\n\n (Your lose 1 sanity!) ");
		
		playerSanity = playerSanity -1;
		sanityLabelNbr.setText(""+ playerSanity);
		sanityCheck();
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void walkVilage() {
		position = "walkVilage";
		
		firstTextArea.setText("You arrive at the vilage, \nthe streets are emty but you can se movement in the houses and shops.\n\nWhat do you do?");
		
		choice1.setText("Investigate the village");
		choice2.setText("Go back to the beach");
		choice3.setText("");
		choice4.setText("");

	}
	public void attackMan() {
		position ="attackMan";
		firstTextArea.setText("You shoot the man with your "+ weapon + "and the man disapear");
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void walkForest() {
		position ="walkForest";
		firstTextArea.setText("The forest seems to get further away the more you walk towards it. \n You begin to get thirsty.\n What do you do?");
		choice1.setText("Go back");
		choice2.setText("Keep walking");
		choice3.setText("");
		choice4.setText("");
	}
	public void beachSec() {
		position = "beachSec";
		firstTextArea.setText("You are at the beach where you woke up. \n What do you do?");
		choice1.setText("");
		choice2.setText("Walk towards the vilage");
		choice3.setText("");
		choice4.setText("Walkt towards the forest");
	}
	public void investVilage() {
		position = "investVilage";
		firstTextArea.setText("You look around for a while,\n the town looks like it's in rough shape.\n You have spoted a manion of sorts and a goods trader.\n What do you do? ");
		choice1.setText("Go to mansion");
		choice2.setText("Go to shop");
		choice3.setText("Go back");
		choice4.setText("");
	}
	public void mansionDoor() {
		position = "mansionDoor";
		firstTextArea.setText("You walk up to the mansion doors and knock, you wait for a while....\n Nothing hapends! \nWhat do you do?");
		choice1.setText("Kick down the door");
		choice2.setText("Go back");
		choice3.setText("");
		choice4.setText("");
		
		
	}
	public void mansionEn() {
		position = "mansionEn";
		firstTextArea.setText("Kick open the door. Walk inside and is met with\n a coridore leading both to your left and right.\n"
				+ "The walls have tear marks all over them.\n The stench of rot fills your nose.\n Where do you go?");
		choice1.setText("Right");
		choice2.setText("Left");
		choice3.setText("");
		choice4.setText("");
	}
	public void mansionRight() {
		position = "mansionRight";
		firstTextArea.setText("You end up in a emty room exept for a latch on the floor.\n You open the latch and find a tunnel leading to an "
				+ "\nunknown location. \n "
				+ "What do you do?");
		choice1.setText("Enter Tunnel");
		choice2.setText("Leave it and go left");
		choice3.setText("");
		choice4.setText("");
	}
	public void mansionLeft() {
		position = "mansionLeft";
	firstTextArea.setText("You see something further down in the coridor but it's to dark to tell. \nWhat do you do?");
	choice1.setText("Go forth");
	choice2.setText("Turn back");
	choice3.setText("Go right");
	choice4.setText("");
	}
	public void tunnelEnter() {
		position = "tunnelEnter";
		firstTextArea.setText("You enter the tunnel,\n it is weakly lit bly candels along the walls, do you keep walking?");
		choice1.setText("Yes");
		choice2.setText("No, turn back");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void mansionMonster() {
		position = "mansionMonster";
		firstTextArea.setText("A strange fishlike humanoid charges att you.\nYou need to think fast, what do you do?");
		choice1.setText("Shoot it");
		choice2.setText("run away");
		choice3.setText("");
		choice4.setText("");
		
	}
	/*public void shootMonster() {
		position = "shootMonster";
		firstTextArea.setText("You emty yor magazine in to the abomination but\n it gets one slash at you\n(You take 3 damage!)");
		playerHP = playerHP -3;
		hpLabelNbr.setText(""+ playerHP);
		hpCheck();
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}*/
	/*public void runAwayMonster() {
		position = "runAwayMonster";
		firstTextArea.setText("You run away from the monster but\n the sight of the abomination scars you\n(You lose 2 sanity!)");
		playerSanity = playerSanity -3;
		sanityLabelNbr.setText(""+ playerSanity);
		sanityCheck();
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}*/
	public void tunnelMidWay() {
		position = "tunnelMidWay";
		firstTextArea.setText("You have lost track of time in the dark tunnel and\nyou hear a strange sound coming from the wall.\nYou see that there is a hole in the wall.\n\n"
				+ "What do you do? ");
		choice1.setText("Look through the hole");
		choice2.setText("Ignore it");
		choice3.setText("Turn back");
		choice4.setText("");
	}
	public void tunnelEnd() {
		position = "tunnelEnd";
		firstTextArea.setText("Enter City");
		choice1.setText("Go back");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void tunnelLookHole() {
		position = "tunnelLookHole";
		firstTextArea.setText("You look through the hole.\n You witness some kind of occult scrifice.\n You see things humans are not made to comprehend\n"
				+ "(You lose 2 Sanity!) ");
		playerSanity = playerSanity -2;
		sanityLabelNbr.setText(""+ playerSanity);
		sanityCheck();
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void cityEn() {
		position = "cityEn";
		firstTextArea.setText("You come through the tunnel a vast underground city.\nYou see alot of movement in the city but can't tell what's\n going on");
		choice1.setText("Enter city");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void cityStart() {
		position = "cityStart";
		firstTextArea.setText("You stand on the edge of the city, \nevery part of you tells you to just leave.\n"
				+ "How do you proceed?");
		choice1.setText("Sneak through");
		choice2.setText("Run through");
		choice3.setText("");
		choice4.setText("");
	}
	public void cityRun() {
		position = "cityRun";
		firstTextArea.setText("");
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void cityRunAttack() {
		position ="cityRunAttack";
		firstTextArea.setText("The sound of your loud footseps as you run echo throughout the city. \\nA human dressed in a black coat runs afer you. \\n\"\r\n" + 
				"				+ \"He slashes you with his blade butt stumbles and falls to the floor. \\n You run around a corner and he loses track of you.\\n\"\r\n" + 
				"				+ \"(You lose 2HP from the slash!)\\n What's next?");
		choice1.setText("Continue forward");
		choice2.setText("Go back");
		choice3.setText("");
		choice4.setText("");
	}
	public void citySneak() {
		position = "";
		firstTextArea.setText("");
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public void shopDoor() {
		position = "shopDoor";	
		firstTextArea.setText("");
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	
	
	
	
	
	public class TitleScreenHandler implements ActionListener {
		

		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
			
		}
			
		
	}
	
	public class ChoiceHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
			String yourChoice = event.getActionCommand();
			
			switch(position) {
			case "TheBeach":
				switch(yourChoice) {
				case "c1": talkMan(); break;
				case "c2": walkVilage(); break;
				case "c3": attackMan(); break;
				case "c4": walkForest(); break;
				}
				break;
			case "TalkToMan":
				switch(yourChoice) {
				case "c1": beachSec(); break;
					
				}
				break;
			case "walkVilage":
				switch(yourChoice) {
				case "c1":investVilage();break;
				case "c2":beachSec(); break;
				case "c3":break;
				case "c4":break;
				}
				break;
			case "attackMan":
				switch(yourChoice) {
				case "c1": beachSec(); break;
				
				}
				break;
			case"walkForest":
				switch(yourChoice) {
				case "c1":break;
				case "c2": beachSec();break;
				case "c3":break;
				case "c4":break;
				}
				break;
			case"beachSec":
				switch(yourChoice) {
				case"c2": walkVilage(); break;
				case"c4": walkForest(); break;
				}
				break;
			case "investVilage":
				switch(yourChoice) {
				case "c1":mansionDoor();break;
				case "c2":investVilage();break;
				
				}
				break;
			case "mansionDoor":
				switch(yourChoice) {
				case"c1": mansionEn(); break;
				case "c2":investVilage(); break;
				}
				break;
			case "mansionEn":
				switch(yourChoice) {
				case"c1":mansionRight(); break;
				case"c2":mansionLeft();break;
				}
				break;
			case "mansionRight":
				switch(yourChoice) {
				case "c1":tunnelEnter(); break;
				case "c2":mansionLeft(); break;
				case "c3":break;
				case "c4":break;
				}
				break;
			case "mansionLeft":
				switch(yourChoice) {
				case "c1":mansionMonster();break;
				case "c2":mansionEn();break;
				case "c3":mansionRight();break;
				case "c4":break;
				}
				break;
			case "mansionMonster":
				switch(yourChoice) {
				case "c1":fightCheck();break;
				case "c2":runCheck();break;
				case "c3":break;
				case "c4":break;
				}
				break;
			case "shootMonster":
				switch(yourChoice) {
				case "c1":mansionEn();break;
				case "c2":break;
				case "c3":break;
				case "c4":break;
				}
				break;
			case "runAwayMonster":
				switch(yourChoice) {
				case "c1":mansionEn();break;
				}
				break;
			case "tunnelEnter":
				switch(yourChoice) {
				case "c1": tunnelMidWay();break;
				case "c2": mansionEn();break;
				}
				break;
			case "tunnelMidWay":
				switch(yourChoice) {
				case "c1":tunnelLookHole(); break;
				case "c2":tunnelEnd(); break;
				case "c3":mansionRight(); break;
				}
				break;
			case "tunnelLookHole":
				switch(yourChoice) {
				case "c1":tunnelEnd();break;
				}
				break;
			case "tunnelEnd":
				switch(yourChoice) {
				case "c1": cityEn(); break;
				case "c2": mansionEn(); break;
				
				}
				break;
			case "cityEn":
				switch(yourChoice) {
				case "c1":cityStart();break;
				case "c2":break;
				}
				break;
			case "sanityOver":
				switch(yourChoice) {
				case"c1":beach();break;
				
				}
				break;
			case "hpOver":
				switch(yourChoice) {
				case"c1":beach();break;
				}
				break;
			case "attackFail":
				switch(yourChoice) {
				case"c1":returnToLastPosition();break;
				}
				break;
			case "attackSucces":
				switch(yourChoice) {
				case"c1":break; //inte tillbaka till fight
				}
		
			
		}
	}
	
	
	}
	
}
	
	
