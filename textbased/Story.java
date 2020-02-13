package textbased;

import java.util.Random;

import Characters.Character_AkachiOnyele;
import Characters.Character_AmandaSharpe;
import Characters.Character_DarrelKane;
import Characters.Character_UrsulaDowns;
import Enemies.Enemy_Ghast;
import Enemies.Enemy_Gug;
import Enemies.Enemy_HalfDeepOne;
import Enemies.Enemy_SpawnOfCthulhu;
import Enemies.Enemy_SpawnOfYog;
import Enemies.Enemy_CultLeader;
import Enemies.Enemy_CultLeaderBuffed;
import Enemies.Enemy_Cultist;
import Enemies.Enemy_DeepOne;
import Enemies.Enemy_ElderSpawn;
import Enemies.SuperEnemy;
import Weapons.Weapon_Artifact;
import Weapons.Weapon_Knife;
import Weapons.Weapon_Revolver;
import Weapons.Weapon_Rifle;
import Weapons.Weapon_Shotgun;

public class Story {
	
	String fightPosition, cluePosition, runPosition, failPosition;
	Game game;
	UI ui;
	VisibilityManager vm;
	Player player = new Player();
	SuperEnemy enemy;
	Random rand = new Random();
	
	public Story(Game g, UI userInterface, VisibilityManager vManager) {
		
		game = g;
		ui = userInterface;
		vm = vManager;
		
	}

	public void defultSetup() {
		
		player.hp = 20;
		player.sanity = 20;
		player.agility = 60;
		player.intellect = 60;
		
		
		//Show on PlayerPanel
		ui.hpLabelNbr.setText(""+ player.hp);
		ui.sanityLabelNbr.setText(""+ player.sanity);
		ui.agilityLabelNbr.setText(""+player.agility);
		ui.intelligenceLabelNbr.setText(""+player.intellect);
		
		//Show Weapon stats on PlayerPannel
		player.currentWeapon = new Weapon_Knife();
		ui.weaponLabelName.setText(player.currentWeapon.name);
		ui.accuracyLabelNbr.setText(""+ player.currentWeapon.accuracy);
		
		
	}
	public void selectPosition(String nextPosition) {
		
		
		switch(nextPosition) {
		case "characterChoice":characterChoice();break;
		case "akachiBeach":akachiBeach();break;
		case "amandaBeach":amandaBeach();break;
		case "darrelBeach":darrelBeach();break;
		case "ursulaBeach":ursulaBeach();break;
		case "talkMan":talkMan();break;
		case "walkVillage":walkVillage();break;
		case "attackMan":attackMan();break;
		case "walkForest":walkForest();break;
		case "beachSec": beachSec(); break;
		case "investVillage":investVilage();break;
		case "mansionDoor":mansionDoor();break;
		case "mansionEn":mansionEn(); break;
		case "mansionRight":mansionRight(); break;
		case "mansionLeft":mansionLeft();break;
		case "mansionAttack":mansionAttack();break;
		case "tunnelEn":tunnelEnter(); break;
		case "tunnelMidWay": tunnelMidWay();break;
		case "tunnelLook":tunnelLookHole(); break;
		case "tunnelEnd":tunnelEnd(); break;
		case "cityEn": cityEn(); break;
		case "cityStart":cityStart();break;
		case "cityBuilding":cityBuilding();break;
		case "cityCrowd1":cityCrowd1();break;
		case "cityBuildingFight":cityBuildingFight();break;
		case "cityBuildingClue":cityBuildingClue();
		case "cityCrowd2":cityCrowd2();break;
		case "cityElderSign":cityElderSign();break;
		case "cityWin":cityWin();break;
		case "cityWatch":cityWatch();
		case "cityTalkSlave":cityTalkSlave();
		case "playerAttack":playerAttack();break;
		case "enemyAttack":enemyAttack();break;
		case "win":win();break;
		case "mansionEn2":mansionEn2();break;
		case "hpOver":hpOver();break;
		case "sanityOver":sanityOver();break;
		case "mansionRight2":mansionRight2();break;
		case "keepWForest":keepWForest();break;
		case "forestTownEn":forestTownEn();break;
		case "forestTownInvest":forestTownInvest();break;
		case "forestShopEn":forestShopEn();break;
		case "forestShop":forestShop();break;
		case "forestBarEn":forestBarEn();break;
		case "forestBar":forestBar();break;
		case "portal":portal();break;
		case "portalDestroy":portalDestroy();break;
		case "fightDarkSpawn":fightDarkSpawn();break;
		case "shopClue":shopClue();break;
		case "walkForestCenter":forestCenter();break;
		case "summoningEn":summoningEn();break;
		case "stopSummoning":stopSummoning();break;
		case "fightGug":fightGug();break;
		case "forestWin":forestWin();break;
		case "forestBarTalk":forestBarTalk();break;
		case "forestBarCellar":forestBarCellar();break;
		case "cellarAttack":cellarAttack();break;
		case "infected":infected();break;
		case "forestCenter2":forestCenter2();break;
		case "summoningEn2":summoningEn2();break;
		case "stopSummoining2":stopSummoning2();break;
		case "fightGug2":fightGug2();break;
		case "forestWin2":forestWin2();break;
		case "shopDoor":shopDoor();break;
		case "shopInDoors":shopInDoors();break;
		case "shopSneak":shopSneak();break;
		case "shopInvest":shopInvest();break;
		case "shopAttack":shopAttack();break;
		case "boatEn":boatEn();break;
		case "oceanEn":oceanEn();break;
		case "shipwreckEn":shipwreckEn();break;
		case "shipwreckAttack":shipwreckAttack();break;
		case "shipwreckInvest":shipwreckInvest();break;
		case "shipwreckArtifact":shipwreckArtifact();break;
		case "shipwreckRifle":shipwreckRifle();break;
		case "waterCityEn":waterCityEn();break;
		case "waterCityInvest":waterCityInvest();break;
		case "waterCityObelisk":waterCityObelisk();break;
		case "waterCityFight":waterCityFight();break;
		case "tempelEnD":tempelEnD();break;
		case "tempelEnP":tempelEnP();break;
		case "Rlyeh":Rlyeh();break;
		case "ctFight":ctFight();break;
		case "stopCthulhu":stopCthulhu();break;
		case "reef":reef();break;
		case "fight":fight();break;
		case "run":runCheck();break;
		case "clue":clueCheck();break;
		
		
		}
		
			
		
		
	
		
		
	}
	public void characterChoice() {
		ui.mainTextArea.setText("Chose your character: \n"
				+ "1. Akachi Onyele The Shaman\n"
				+ "2. Amanda Sharpe The Student \n"
				+ "3. Darrel Kane The Journalist\n"
				+ "4. Ursula Downs The Explorer");

		ui.choice1.setText("Akachi");
		ui.choice2.setText("Amanda");
		ui.choice3.setText("Darrel");
		ui.choice4.setText("Ursula");
		
		game.nextPosition1 = "akachiBeach";
		game.nextPosition2 = "amandaBeach";
		game.nextPosition3 = "darrelBeach";
		game.nextPosition4 = "ursulaBeach";


	}
	public void akachiBeach() {
		ui.mainTextArea.setText("You stand on a beach, you wonder where you are and how\n you got there."
				+ "\nYou look around for a while, you see a strange \n'man' stairing at you. To the east is a \nvillage and"
				+ "to the north is what looks to be a forest.\n \nWhat do you do?");
		ui.choice1.setText("Talk to the 'man'");
		ui.choice2.setText("Walk towards the village");
		ui.choice3.setText("Attack the hideous 'man'");
		ui.choice4.setText("Walkt towards the forest");
		
		game.nextPosition1 = "talkMan";
		game.nextPosition2 = "walkVillage";
		game.nextPosition3 = "attackMan";
		game.nextPosition4 = "walkForest";
		player.chosenCharacter = new Character_AkachiOnyele();
				
		player.hp = player.chosenCharacter.hp;
		player.sanity = player.chosenCharacter.sanity;
		player.agility = player.chosenCharacter.agility;
		player.intellect = player.chosenCharacter.intellect;
		player.name = player.chosenCharacter.name;
		ui.hpLabelNbr.setText(""+player.hp);
		ui.sanityLabelNbr.setText(""+player.sanity);
		ui.agilityLabelNbr.setText(""+player.agility);
		ui.intelligenceLabelNbr.setText(""+player.intellect);
	}
	public void amandaBeach() {
		ui.mainTextArea.setText("You stand on a beach, you wonder where you are and how\n you got there."
				+ "\nYou look around for a while, you see a strange \n'man' stairing at you. To the east is a \nvillage and"
				+ "to the north is what looks to be a forest.\n \nWhat do you do?");
		ui.choice1.setText("Talk to the 'man'");
		ui.choice2.setText("Walk towards the village");
		ui.choice3.setText("Attack the hideous 'man'");
		ui.choice4.setText("Walkt towards the forest");
		
		game.nextPosition1 = "talkMan";
		game.nextPosition2 = "walkVillage";
		game.nextPosition3 = "attackMan";
		game.nextPosition4 = "walkForest";
		player.chosenCharacter = new Character_AmandaSharpe();
				
		player.hp = player.chosenCharacter.hp;
		player.sanity = player.chosenCharacter.sanity;
		player.agility = player.chosenCharacter.agility;
		player.intellect = player.chosenCharacter.intellect;
		player.name = player.chosenCharacter.name;
		ui.hpLabelNbr.setText(""+player.hp);
		ui.sanityLabelNbr.setText(""+player.sanity);
		ui.agilityLabelNbr.setText(""+player.agility);
		ui.intelligenceLabelNbr.setText(""+player.intellect);
	}
	public void darrelBeach() {
		ui.mainTextArea.setText("You stand on a beach, you wonder where you are and how\n you got there."
				+ "\nYou look around for a while, you see a strange \n'man' stairing at you. To the east is a \nvillage and"
				+ "to the north is what looks to be a forest.\n \nWhat do you do?");
		ui.choice1.setText("Talk to the 'man'");
		ui.choice2.setText("Walk towards the village");
		ui.choice3.setText("Attack the hideous 'man'");
		ui.choice4.setText("Walkt towards the forest");
		
		game.nextPosition1 = "talkMan";
		game.nextPosition2 = "walkVillage";
		game.nextPosition3 = "attackMan";
		game.nextPosition4 = "walkForest";
		player.chosenCharacter = new Character_DarrelKane();
				
		player.hp = player.chosenCharacter.hp;
		player.sanity = player.chosenCharacter.sanity;
		player.agility = player.chosenCharacter.agility;
		player.intellect = player.chosenCharacter.intellect;
		player.name = player.chosenCharacter.name;
		ui.hpLabelNbr.setText(""+player.hp);
		ui.sanityLabelNbr.setText(""+player.sanity);
		ui.agilityLabelNbr.setText(""+player.agility);
		ui.intelligenceLabelNbr.setText(""+player.intellect);
	}
	public void ursulaBeach() {
		ui.mainTextArea.setText("You stand on a beach, you wonder where you are and how\n you got there."
				+ "\nYou look around for a while, you see a strange \n'man' stairing at you. To the east is a \nvillage and"
				+ "to the north is what looks to be a forest.\n \nWhat do you do?");
		ui.choice1.setText("Talk to the 'man'");
		ui.choice2.setText("Walk towards the village");
		ui.choice3.setText("Attack the hideous 'man'");
		ui.choice4.setText("Walkt towards the forest");
		
		game.nextPosition1 = "talkMan";
		game.nextPosition2 = "walkVillage";
		game.nextPosition3 = "attackMan";
		game.nextPosition4 = "walkForest";
		player.chosenCharacter = new Character_UrsulaDowns();
				
		player.hp = player.chosenCharacter.hp;
		player.sanity = player.chosenCharacter.sanity;
		player.agility = player.chosenCharacter.agility;
		player.intellect = player.chosenCharacter.intellect;
		player.name = player.chosenCharacter.name;
		ui.hpLabelNbr.setText(""+player.hp);
		ui.sanityLabelNbr.setText(""+player.sanity);
		ui.agilityLabelNbr.setText(""+player.agility);
		ui.intelligenceLabelNbr.setText(""+player.intellect);
	}
	public void talkMan() {
		ui.mainTextArea.setText("The man stairs at you and says \n"
				+ "'We will meet on this beach\n soon again' " +player.name+
				" \nThen he emitts a strange screach and you fall to the ground");
		
		player.sanity = player.sanity -1;
		ui.sanityLabelNbr.setText(""+ player.sanity);
		sanityCheck();
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "beachSec";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void walkVillage() {
		ui.mainTextArea.setText("You arrive at the village, \nthe streets are empty but you can se movement in the houses and shops.\n\nWhat do you do?");
		
		ui.choice1.setText("Investigate the village");
		ui.choice2.setText("Go back to the beach");
		ui.choice3.setText("");
		ui.choice4.setText("");
	
		game.nextPosition1 = "investVillage";
		game.nextPosition2 = "beachSec";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void attackMan() {

		ui.mainTextArea.setText("You run at the man with your knife.\n"
				+ "The man stairs at you as you drive your Knife in to his chest.\n"
				+ "He utters 'We will meet on this beach\n soon again' " +player.name+","
				+ "\nhe smiles and takes his last breath!\n"
				+ "You wonder why you did what you did and\n what his words meant.\n"
				+ "What's next?");
		
		ui.choice1.setText("Go to village");
		ui.choice2.setText("Go to firest");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "walkVillage";
		game.nextPosition2 = "walkForest";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void walkForest() {
		ui.mainTextArea.setText("The forest seems to get further away the more you walk towards it. \n "
				+ "You begin to get thirsty.\n "
				+ "What do you do?");
		ui.choice1.setText("Go back");
		ui.choice2.setText("Keep walking");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "beachSec";
		game.nextPosition2 = "keepWForest";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
}
	public void keepWForest() {
		ui.mainTextArea.setText("The forest still seems to get further away the more you walk towards it.\n"
				+ "Then, all of a sudden, you arive at the edge of the forest.\n"
				+ "The forest is dark, you wonder if it's a good idea to enter it\n"
				+ "What do you do? ");
		
		ui.choice1.setText("Enter");
		ui.choice2.setText("Go back");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestEn";
		game.nextPosition2 = "beachSec";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestEn() {
		ui.mainTextArea.setText("As you enter the forest line you gaze upon\n"
				+ "an onholy town. The inhabitants look sicky and frail.\n"
				+ "You have no choice but to aproach the town!");
		ui.choice1.setText("Enter");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestTownEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestTownEn() {
		ui.mainTextArea.setText("You stand in the middle of the town.\n"
				+ "The inhabitants avoid you and walk around you.\n"
				+ "");
		ui.choice1.setText("Investigate");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestTownInvest";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestTownInvest() {
		ui.mainTextArea.setText("As you look around you see a shop of sorts and a bar.\n"
				+ "What do you do?");
		ui.choice1.setText("Enter Shop");
		ui.choice2.setText("Enter Bar");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestShopEn";
		game.nextPosition2 = "forestBarEn";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestShopEn() {
		ui.mainTextArea.setText("You walk up to the shop. A strange sound emmits form \n"
				+ "the inside of the shop. The door is ajar and you see lights\n"
				+ "flickering.");
		ui.choice1.setText("Go inside");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestShop";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestShop() {
		ui.mainTextArea.setText("You enter the shop to see to your suprise that it's emty.\n"
				+ "In the back of the shop there is another door. What ever \n"
				+ "is behind the door seems to be the source of the light\n"
				+ "you saw erlier.\n"
				+ "You see a rifle on the floor and pick it up.\n"
				+ "(You obtain a rifle!)");
		ui.choice1.setText("Enter");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		player.currentWeapon = new Weapon_Rifle();
		ui.weaponLabelName.setText(player.currentWeapon.name);
		ui.accuracyLabelNbr.setText(""+player.currentWeapon.accuracy);
		
		game.nextPosition1 = "portal";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void portal() {
		ui.mainTextArea.setText("As you enter the room, you see a gateway of some sort.\n"
				+ "You have never seen anything like it before but you can.\n"
				+ "tell that it's unnatual.\n"
				+ "You come to the understanding that this gate was not man made\n"
				+ "and was not ment to exist in the human dimension!");
		ui.choice1.setText("Destroy it");
		ui.choice2.setText("Leave");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "portalDestroy";
		game.nextPosition2 = "forestTownInvest";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void portalDestroy() {
		ui.mainTextArea.setText("Attack the gateway with you "+player.currentWeapon.name+"\n"
				+"and it disapears.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "figthDarkSpawn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void fightDarkSpawn() {
		ui.mainTextArea.setText("After the gate disapears you see that a grotesque\n"
				+ "abomination stands before you.\n"
				+ "Formless protoplasm able to mock and reflect \n"
				+ "all forms and organs and processes.\n"
				+ "The sight of this beeing frightens you to the core! ");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		fightPosition = "shopClue";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shopClue() {
		ui.mainTextArea.setText("After defeating the horriable abomination\n"
				+ "you see a map on the floor. \n"
				+ "The map shows a part of the deeper side of the forest\n"
				+ "with a red circle drawn in a specific area.");
		ui.choice1.setText("Follow Map");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		
		
		game.nextPosition1 = "forestCenter";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestCenter() {
		ui.mainTextArea.setText("After some time navigating the dense forest,\n"
				+ "you see an opening.\n"
				+ "You sense that there is comotion and sneak crairfuly forward.\n"
				+ "As you come closer you see a massive pile of human bodies and \n"
				+ "strange drawings of blood on the ground.\n"
				+ "You see a enourmus creature.");
		ui.choice1.setText("Walk forward");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "summoningEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void summoningEn() {
		ui.mainTextArea.setText("You try to get a better look on the monster.\n"
				+ "Since it's night time you can't see that well.\n"
				+ "You need to get even closer to see what it is!");
		ui.choice1.setText("Go closer");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "stopSummoning";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void stopSummoning() {
		ui.mainTextArea.setText("As you get closer you accedentaly\n" + 
				"step on a broken bottle.\n"
				+ "The large monster hears the noice and slowly turs to you.\n"
				+ "");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "fightGug";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void fightGug() {
		ui.mainTextArea.setText("It was a paw, fully two meters and a half across, \n"
				+ "and equipped with formidable talons. \n"
				+ "Then two pink eyes shone, \n"
				+ "and the head of the awakened gug sentry, large as a barrel,\n"
				+ "wabbled into view. The eyes jutted two centimeters from \n"
				+ "each side, shaded by bony protuberances overgrown \n"
				+ "with coarse hairs. But the head was chiefly terrible\n"
				+ " because of the mouth. That mouth had great yellow \n"
				+ "fangs and ran from the top to the bottom of the head,\n"
				+ " opening vertically instead of horizontally.\n"
				+ "The beast charges at you!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		enemy = new Enemy_Gug();
		fightPosition = "forestWin";
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestWin() {
		ui.mainTextArea.setText("You have defeated the summoned beast and stoped the cultist's plan.\n"
				+ "You have stopped whatever they were planing to do with it,\n"
				+ "but the sight of the bodies and the monster will forever scar\n"
				+ "your fragile mind!");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestBarEn() {
		ui.mainTextArea.setText("You stand outside of the bar.\n"
				+ "The bar is in bad shape but it seems to \n"
				+ "be popular with the locals.\n"
				+ "What do you do?");
		ui.choice1.setText("Enter");
		ui.choice2.setText("Go back");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestBar";
		game.nextPosition2 = "forestTownInvest";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestBar() {
		ui.mainTextArea.setText("All the locals are drinking in silence.\n"
				+ "You feel that something is wrong and\n"
				+ "the localse are looking at you in a strange way\n"
				+ "You see a stairway going down and a lady that looks \n"
				+ "apart from the other locals.");
		ui.choice1.setText("Go down");
		ui.choice2.setText("Talk Lady");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestBarTalk";
		game.nextPosition2 = "forestBarCellar";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestBarTalk() {
		ui.mainTextArea.setText("You walk towards the lady but befor you can even\n"
				+ "utter a word she tells you that there is something going on\n"
				+ "in the town's shop. Then she tells you to stay away from a strange man that \n"
				+ "roams the beach and walk away.");
		ui.choice1.setText("Go to shop");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "forestShopEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestBarCellar() {
		ui.mainTextArea.setText("You walk down the stairs to end up in a cellar.\n"
				+ "The cellar walls are covered in some kind \n"
				+ "of red fungus. You see a cultist collecting some of the \n"
				+ "fungus.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cellarAttack";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cellarAttack() {
		ui.mainTextArea.setText("The cultist catches sight of you and instantly\n"
				+ "charges at you with his knife.\n"
				+ "");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		enemy = new Enemy_Cultist();
		fightPosition = "infecter";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void infected() {
		ui.mainTextArea.setText("After a hard fought you notice that the fungus\n"
				+ "release spores in the air.\n"
				+ "The cultist drops a map with makeres for a meeting place.\n"
				+ "On the way out of the cellar you accedentaly inhale\n"
				+ "some of the spores!");
		ui.choice1.setText("Follow Map");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		player.currentWeapon = new Weapon_Shotgun();
		ui.weaponLabelName.setText(player.currentWeapon.name);
		ui.accuracyLabelNbr.setText(""+player.currentWeapon.accuracy);
		
		game.nextPosition1 = "forestCenter2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestCenter2() {
		ui.mainTextArea.setText("After some time navigating the dense forest,\\n\"\r\n" + 
				"				+ \"you see an opening.\\n\"\r\n" + 
				"				+ \"You sense that there is comotion and sneak crairfuly forward.\\n\"\r\n" + 
				"				+ \"As you come closer you see a massive pile of human bodies and \\n\"\r\n" + 
				"				+ \"strange drawings of blood on the ground.\\n\"\r\n" + 
				"				+ \"You see a enourmus creature.\n"
				+ "You also start to feel sick!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "summoningEn2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void summoningEn2() {
		ui.mainTextArea.setText("You try to get a better look on the monster.\\n\"\r\n" + 
				"				+ \"Since it's night time you can't see that well.\\n\"\r\n" + 
				"				+ \"You need to get even closer to see what it is!\n"
				+ "You now notice that some of the fungus from the cellar \n"
				+ "has started to grow from your arm!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "stopSummoning2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void stopSummoning2() {
		ui.mainTextArea.setText("As you get closer you accedentaly\\n\" + \r\n" + 
				"				\"step on a broken bottle.\\n\"\r\n" + 
				"				+ \"The large monster hears the noice and slowly turs to you.\\n\"\r\n" + 
				"				+ \"\"");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "fightGug2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void fightGug2() {
		ui.mainTextArea.setText("It was a paw, fully two meters and a half across, \\n\"\r\n" + 
				"				+ \"and equipped with formidable talons. \\n\"\r\n" + 
				"				+ \"Then two pink eyes shone, \\n\"\r\n" + 
				"				+ \"and the head of the awakened gug sentry, large as a barrel,\\n\"\r\n" + 
				"				+ \"wabbled into view. The eyes jutted two centimeters from \\n\"\r\n" + 
				"				+ \"each side, shaded by bony protuberances overgrown \\n\"\r\n" + 
				"				+ \"with coarse hairs. But the head was chiefly terrible\\n\"\r\n" + 
				"				+ \" because of the mouth. That mouth had great yellow \\n\"\r\n" + 
				"				+ \"fangs and ran from the top to the bottom of the head,\\n\"\r\n" + 
				"				+ \" opening vertically instead of horizontally.\\n\"\r\n" + 
				"				+ \"The beast charges at you!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		enemy = new Enemy_Gug(); 
		fightPosition = "forestWin2";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void forestWin2() {
		ui.mainTextArea.setText("After the fight you fall to the ground, not due\n"
				+ "to the fight but the fungus is over taking you.\n"
				+ " You can only hope that no one finds your body!\n"
				+ "At least you stopped the cultists. ");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void beachSec() {
		ui.mainTextArea.setText("You are at the beach where you woke up.\n"
				+ "The strange man is nowhere to be found \n What do you do?");
		ui.choice1.setText("");
		ui.choice2.setText("Walk towards the village");
		ui.choice3.setText("");
		ui.choice4.setText("Walkt towards the forest");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "walkVillage";
		game.nextPosition3 = "";
		game.nextPosition4 = "walkForest";
	}
	public void investVilage() {
		ui.mainTextArea.setText("You look around for a while,\n the town looks like it's in rough shape.\n You have spoted a mansion of sorts and a goods trader.\n What do you do? ");
		ui.choice1.setText("Go to mansion");
		ui.choice2.setText("Go to shop");
		ui.choice3.setText("Go back");
		ui.choice4.setText("");
		
		game.nextPosition1 = "mansionDoor";
		game.nextPosition2 = "shopDoor";
		game.nextPosition3 = "walkVillage";
		game.nextPosition4 = "";
	}
	public void mansionDoor() {
		ui.mainTextArea.setText("You walk up to the mansion doors and knock, you wait for a while....\n Nothing hapends! \nWhat do you do?");
		ui.choice1.setText("Kick down the door");
		ui.choice2.setText("Go back");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "mansionEn";
		game.nextPosition2 = "investVillage";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void mansionEn() {
		ui.mainTextArea.setText("Kick open the door. Walk inside and is met with\n "
				+ "a coridore leading both to your left and right.\n"
				+ "The walls have tear marks all over them.\n "
				+ "The stench of rot fills your nose.\n "
				+ "Where do you go?");
		ui.choice1.setText("Right");
		ui.choice2.setText("Left");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		
		game.nextPosition1 = "mansionRight";
		game.nextPosition2 = "mansionLeft";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		fightPosition = "mansionEn2";
		runPosition = "mansionEn2";
		
		
	}
	public void mansionEn2() {
		ui.mainTextArea.setText("You are back at the entrance!\n"
				+ "Where do you go?");
		
		ui.choice1.setText("Right");
		ui.choice2.setText("Villalge");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "mansionRight2";
		game.nextPosition2 = "investVillage";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void mansionRight() {
		ui.mainTextArea.setText("You end up in a empty room exept for a latch on the floor.\n "
				+ "You open the latch and find a tunnel leading to an "
				+ "\nunknown location. \n "
				+ "What do you do?");
		ui.choice1.setText("Enter Tunnel");
		ui.choice2.setText("Leave it and go left");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "TunnelEn";
		game.nextPosition2 = "mansionLeft";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void mansionRight2() {
		ui.mainTextArea.setText("You end up in a empty room exept for a latch on the floor.\n "
				+ "You open the latch to find a tunnel leading to an "
				+ "\nunknown location. \n "
				+ "What do you do?");
		ui.choice1.setText("Enter Tunnel");
		ui.choice2.setText("Leave");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "TunnelEn";
		game.nextPosition2 = "mansionEn2";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void mansionLeft() {
		
	ui.mainTextArea.setText("You see and pick up a revolver"
			+ "\n but sees something further down in the coridor but it's to dark to tell. \n"
			+ "What do you do?");
	player.currentWeapon = new Weapon_Revolver();
	ui.weaponLabelName.setText(player.currentWeapon.name);
	ui.choice1.setText("Go forth");
	ui.choice2.setText("Turn back");
	ui.choice3.setText("Go right");
	ui.choice4.setText("");
	
	game.nextPosition1 = "mansionAttack";
	game.nextPosition2 = "mansionEn";
	game.nextPosition3 = "mansionRight";
	game.nextPosition4 = "";
	}
	public void mansionAttack() {
		
		enemy = new Enemy_HalfDeepOne();
		ui.mainTextArea.setText("A strange mix of fish and human creature\n"
				+ " charges at you!\n"
				+ "It has bulging glassy dead looking eyes, lacks any ears \n"
				+ "and has strange folds on it's neck.\n"
				+ "You try not to cower in fear.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tunnelEnter() {
		ui.mainTextArea.setText("You enter the tunnel,\n "
				+ "it is weakly lit bly candels along the walls, do you keep walking?");
		ui.choice1.setText("Yes");
		ui.choice2.setText("No, turn back");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tunnelMidWay() {
		ui.mainTextArea.setText("You have lost track of time in the dark tunnel and\n"
				+ "you hear a strange sound coming from the wall.\n"
				+ "You see that there is a hole in the wall."
				+ "\n\n"
				+ "What do you do? ");
		ui.choice1.setText("Look through the hole");
		ui.choice2.setText("Ignore it");
		ui.choice3.setText("Turn back");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tunnelEnd() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("Enter City");
		ui.choice2.setText("Go Back");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tunnelLookHole() {
		ui.mainTextArea.setText("You look through the hole.\n "
				+ "You witness some kind of occult scrifice.\n "
				+ "You see things humans are not made to comprehend\n "
				+ "(You lose 2 Sanity!) ");
		player.sanity = player.sanity -2;
		ui.sanityLabelNbr.setText(""+ player.sanity);
		sanityCheck();
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityEn() {
		ui.mainTextArea.setText("You come through the tunnel a vast underground city.\n"
				+ "You see alot of movement in the city but can't tell what's"
				+ "\n going on");
		ui.choice1.setText("Enter city");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cityStart";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityStart() {
		ui.mainTextArea.setText("You stand on the edge of the city, \nevery part of you tells you to just leave.\n"
				+ "How do you proceed?");
		ui.choice1.setText("Enter Building");
		ui.choice2.setText("Go Crowd");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cityBuilding";
		game.nextPosition2 = "cityCrowd1";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityBuilding() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("Investigate");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		cluePosition = "cityBuildingFight";
			
		game.nextPosition1 = "clueCheck";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		
		
	}
	public void cityBuildingFight() {
		enemy = new Enemy_SpawnOfYog();
		ui.mainTextArea.setText("");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		fightPosition = "cityBuildingClue";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityBuildingClue() {
		ui.mainTextArea.setText("");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cityCrowd2";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		
	}
	public void cityCrowd2() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("Draw the sign");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cityElderSign";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityElderSign() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		enemy = new Enemy_CultLeader();
		
		fightPosition = "cityWin";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityWin() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityCrowd1() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("Stay hidden");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cityWatch";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityWatch() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "cityTalkSlave";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void cityTalkSlave() {
		ui.mainTextArea.setText("");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		enemy = new Enemy_CultLeaderBuffed();
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shopDoor() {
		
		ui.mainTextArea.setText("You stand outside the shop, the main door is ajar."
				+ "\nThe shop has a dock and it you note that it seems to be a boat shop."
				+ "\nWhat do you do?");
		ui.choice1.setText("Go inside");
		ui.choice2.setText("Go back");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "shopInDoors";
		game.nextPosition2 = "investVillage";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shopInDoors() {
		
		ui.mainTextArea.setText("You can see the dock and a boat conntcted to it.\n"
				+ "The boat at first glance looks to be in OK shape.\n"
				+ "What's next?");
		ui.choice1.setText("Sneak to the boat");
		ui.choice2.setText("Investigate shop");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "shopSneak";
		game.nextPosition2 = "shopInvest";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shopInvest() {
		runPosition = "investVillage";
		
		enemy = new Enemy_Ghast();
		
		ui.mainTextArea.setText("You look around for a while, you see a wardrobe and \n"
				+ "open the door!\n"
				+ "As you reach for the handle a "+enemy.name+" jumps out!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "shopAttack";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shopAttack() {
		
		enemy = new Enemy_Ghast();
		
		ui.mainTextArea.setText("The Ghast charges at you, the monster looks to be \n"
				+ "some kind of disfigured humanoid \n"
				+ "whose face is so curiously human despite the absence\n "
				+ "of a nose,a forehead, and other important particulars.!\n"
				+ "It truely is a repulsive being!\n"
				+ "It made a coughing gutturals sound, you brace yourself and\n try to keep it together.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		fightPosition = "shopSneak";
		
	}
	public void shopSneak() {
		
		ui.mainTextArea.setText("You stand on the dock besides the boat.\n "
				+ "You note that it seems intact.\n"
				+ "You see a Ghast chasing afer you and by \n"
				+ "reflex you jump to the boat and start it.");
		ui.choice1.setText("Drive");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "boatEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void boatEn() {
		ui.mainTextArea.setText("You drive away on pure instinct, \n"
				+ "like you already know where you are going, almoast\n"
				+ "like your drawn to a specific location.\n"
				+ "After some time you turn off the engien on the open\n"
				+ "sea, you notice a scuba kit.\n"
				+ "You feel drawn to the bottom of the ocean.\n"
				+ "what do you do?");
		ui.choice1.setText("Dive down");
		ui.choice2.setText("Go to beach");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "oceanEn";
		game.nextPosition2 = "beachSec";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
		
	}
	public void oceanEn() {
		ui.mainTextArea.setText("You put on the scuba gear. \n"
				+ "You stand on the boat all dressed and prepared to dive.\n"
				+ "You feel a strange urge to just sink down to the bottom.\n"
				+ "After some time you dive in and begin to go down.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "reef";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";

	}
	public void reef() {
		ui.mainTextArea.setText("After some time, you reach the dark and lonely sea bottom. \n"
				+ "You turn on your flashlight and look around.\n"
				+ "You see a sunken shipwreck and further away you see a cave.\n"
				+ "Where do you go?");
		ui.choice1.setText("Shipwreck");
		ui.choice2.setText("cave");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "shipwreckEn";
		game.nextPosition2 = "caveEn";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shipwreckEn() {
		ui.mainTextArea.setText("You swim to the shipwreck.\n"
				+ "The shipwreck seems to be a old 16th century ship.\n"
				+ "You look around and see something move in the corner of your eye");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "shipwreckAttack";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shipwreckAttack() {
		enemy = new Enemy_ElderSpawn();
		ui.mainTextArea.setText("You turn to check what it was.\n"
				+ "Infront of you is a huge unknown creature.\n"
				+ "The creature looks like a barrel with five \n"
				+ "bulging ridges in place of staves\n"
				+ "Lateral breakages, as of thinnish stalks, \n"
				+ "are at equator in middle of these ridges\n"
				+ " In furrows between ridges are curious growths\n"
				+ " combs or wings that fold up and spread out like fans");
		
		fightPosition = "shipwreckInvest";
		
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shipwreckInvest() {
		ui.mainTextArea.setText("After the fight against one of the Elder Things \n"
				+ "You are free to investigate the wreck.\n"
				+ "Some thing in the wreck is calling to you,\n"
				+ "You need to find it quick, you see a carving on one of the walls\n"
				+ "you hope it leeds you to whatever is calling you.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		cluePosition = "shipwreckArtifact";
		failPosition = "shipwreckRifle";
		
		game.nextPosition1 = "clue";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shipwreckArtifact() {
		player.currentWeapon = new Weapon_Artifact();
		ui.mainTextArea.setText("You open one of the chests and uncover the artifact weapon "+player.currentWeapon.name
				+"as you hold it in your hand, you feel unstoppable.\n"
				+ "You see a latch in the floor of the wreck,\n"
				+ "You decide to go down");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "waterCityEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void shipwreckRifle() {
		player.currentWeapon = new Weapon_Rifle();
		ui.mainTextArea.setText("You still find a Rifle but you dont have much air\n"
				+ "in your tanks. You see a latch in the floor of the wreck,\n"
				+ "You decide to go down");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "waterCityEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void caveEn() {
		ui.mainTextArea.setText("You swim to the cave, you can see that it leeds down.\n"
				+ "You feel something is calling to you,\n"
				+ " you have the urge to dive deeper.\n");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "waterCityEn";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void waterCityEn() {
		ui.mainTextArea.setText("After some time, you end up in a air filled cave system.\n"
				+ "Within this enormous cave is a city. There is\n"
				+ "no movement within the city but you still feel drawn to\n"
				+ "some location.");
		ui.choice1.setText("Enter");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "waterCityInvest";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void waterCityInvest() {
		ui.mainTextArea.setText("You walk around for some time in the city.\n"
				+ "As you walk around you look at some\n"
				+ " of the tablets that has sciptures on them.\n"
				+ "The biggest of these tablets automaticly translates to english \n"
				+ "from whatever un-godly language they were writen in.\n"
				+ "It says 'The nightmare corpse-city of R'lyeh\n"
				+ " was built in measureless eons behind history by the vast, \n"
				+ "loathsome shapes that seeped down from the dark stars. \n"
				+ "There lay great Cthulhu and his hordes, \n"
				+ "hidden in green slimy vaults until the end.' ");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "waterCityObelisk";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void waterCityObelisk() {
		ui.mainTextArea.setText("As you keep walking you end up at\n"
				+ "a obelisk in front of waht looks to be a tempel.\n"
				+ "You note that it's the origin of the power\n"
				+ "that emited the drawing sensation.\n"
				+ "A feeling of wanting to pray to the obelisk\n"
				+ "fills you. \n"
				+ "What do you do?");
		ui.choice1.setText("Destroy it");
		ui.choice2.setText("Pray to it");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "waterCityFight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void waterCityFight() {
		
		enemy = new Enemy_DeepOne();
		
		ui.mainTextArea.setText("You push the obelisk and it falls to the ground,\n"
				+ "You hear strange screems from every corner of the city.\n"
				+ "A fish-like creature runs at you!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		fightPosition = "TempelEnD";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tempelEnD() {
		ui.mainTextArea.setText("After defeating the enemy you run inside the tempel.\n"
				+ "The entire city is now shaking.\n"
				+ "You hear loud footsteps coming from deeper inside the tempel.");
		ui.choice1.setText("Go deeper");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "ctFight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void tempelEnP() {
		ui.mainTextArea.setText("After praying to the obelisk for a unknown time,\n"
				+ "you decide to enter the tempel. You see strange fish-like \n"
				+ "beeings bowing to you. You walk further into the tempel.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void ctFight() {
		enemy = new Enemy_SpawnOfCthulhu();

		ui.mainTextArea.setText("Infront of you stands a abomination made\n"
				+ "entirely of tentacles. The abomination roars at you.");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		fightPosition = "stopCthulhu";
		
		game.nextPosition1 = "fight";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void Rlyeh() {
		ui.mainTextArea.setText("The entire city is now acending at a rapid pace.\n"
				+ "You have awaken Cthulhu from his slumber and \n"
				+ "brought about the end times!\n"
				+ "Your acctions have brought madness to the world,\n"
				+ "you alone have doomed them all!");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void stopCthulhu() {
		ui.mainTextArea.setText("You have single handedly stoped the return of Rlyeh.\n"
				+ "The human race will never know about their savior but \n"
				+ "atleast they are still alive until the next time \n"
				+ "Cthulhu wakes!");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	
	public void hpOver() {
		ui.mainTextArea.setText("You have taken too much damage and\n have failed to stop the end of the world!\n"
				+ "No one will ever know of you or what you set out to do!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "characterChoice";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void hpCheck() {
		if (player.hp <= 0) {
			hpOver();
		}
	}
	public void sanityOver() {
		ui.mainTextArea.setText("You have seen to many things that humans are not \n "
				+ "to comprehend!\n"
				+ "All the ungodly sights have driven you insane and you have \n "
				+ "failed to stop the end-times!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "characterChoice";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void sanityCheck() {
		if (player.sanity <= 0) {
			sanityOver();
		}
	}
	public void fight() {
		ui.mainTextArea.setText(enemy.name+" HP: "+enemy.hp + "\nWhat do you do?");
		ui.choice1.setText("attack");
		ui.choice2.setText("run");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "playerAttack";
		game.nextPosition2 = "run";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void playerAttack() {
		int playerDamage = player.currentWeapon.damage;
		int a = 0;
		for(int i = 0; i <= 1; i++) {
			 a = 0;
			 a = rand.nextInt(101);
		}
		
		int accuracy = player.currentWeapon.accuracy;
		if(a <= accuracy) {
			ui.mainTextArea.setText("You attack the " +enemy.name+ " and deal " + playerDamage +" damage!\n"
					+ "");
			enemy.hp = enemy.hp - playerDamage;
		}else {
			ui.mainTextArea.setText("You attack the " +enemy.name+ " and miss!\n"
					+ "The "+enemy.name+" seems invulnerable to your attacks! \n"
							+ "Your will decreases and you doubt yourself.\n"
							+ "(You lose 1 sanity)");
			player.sanity = player.sanity -1;
			ui.sanityLabelNbr.setText(""+player.sanity);
		}
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		
		
		if(enemy.hp <= 0) {
			game.nextPosition1 = "win";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
		else {
			game.nextPosition1 = "enemyAttack";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
		}
	public void enemyAttack() {
		int enemyDamage = enemy.damage;
		int enemySanityDamage = enemy.sanityDamage;
		int ea = 0;
		for(int i = 0; i <= 1; i++) {
			ea = 0;
			ea = rand.nextInt(101);
			
		}
		int enemyAccuracy = enemy.accuracy;
		if(ea <= enemyAccuracy) {
			ui.mainTextArea.setText("The " + enemy.name + " attacks you and you lose\n "+ enemyDamage
					+" health and "+ enemySanityDamage + " sanity!");
			player.hp = player.hp - enemyDamage;
			player.sanity = player.sanity - enemySanityDamage;
			ui.hpLabelNbr.setText(""+player.hp);
			ui.sanityLabelNbr.setText(""+player.sanity);
			hpCheck();
		}else {
			ui.mainTextArea.setText("The "+enemy.name+" misses!");
		}
		
		if(player.hp <= 0) {
			game.nextPosition1 = "hpOver";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}else if(player.sanity <= 0) {
			game.nextPosition1 = "sanityOver";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}else {
			game.nextPosition1 = "fight";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
		
		
	}
	public void win() {
		ui.mainTextArea.setText("You defeated the "+ enemy.name+"."+"\n"
				+ "A slight feeling of hope fills your body!");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = fightPosition;
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		game.nextPosition4 = "";
	}
	public void runCheck() {
		int a = rand.nextInt(101);
		int agility = player.agility;
		if(a <= agility) {
			ui.mainTextArea.setText("You successfully run away form the enemy!\n"
					+ "The sight of the "+enemy.name+" frightens you to the core!\n"
							+ "(You lose 1 sanity!)" );
			player.sanity = player.sanity -1;
			ui.sanityLabelNbr.setText(""+player.sanity);
			
			ui.choice1.setText(">");
			ui.choice2.setText("");
			ui.choice3.setText("");
			ui.choice4.setText("");
			
			game.nextPosition1 = runPosition;
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}else {
			ui.mainTextArea.setText("You fail to run away from the "+ enemy.name+" !\n"
					+ "You know that you are no match for the "+enemy.name+" !\n"
							+ "Your falure causes you to panik (You lose 2 sanity!)");
			player.sanity = player.sanity -2;
			ui.sanityLabelNbr.setText(""+player.sanity);
			
			ui.choice1.setText(">");
			ui.choice2.setText("");
			ui.choice3.setText("");
			ui.choice4.setText("");
			
			game.nextPosition1 = "fight";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
			
	
	}
	public void clueCheck() {
		int c = rand.nextInt(101);
		int intellect = player.intellect;
		if(c <= intellect) {
			ui.mainTextArea.setText("You decipher the clue and gain greater knowledge!\n"
					+ "You now see the bigger picture but at what cost?\n"
					+ "With this new knowledge you now know how to proceed but you are\n"
					+ "one step closer to insanity(You lose 2 sanity!)");
			player.sanity = player.sanity - 2;
			ui.sanityLabelNbr.setText(""+player.sanity);
			
			ui.choice1.setText(">");
			ui.choice2.setText("");
			ui.choice3.setText("");
			ui.choice4.setText("");
			if(player.hp <= 0) {
				game.nextPosition1 = "hpOver";
				game.nextPosition2 = "";
				game.nextPosition3 = "";
				game.nextPosition4 = "";
			}else if(player.sanity <= 0) {
				game.nextPosition1 = "sanityOver";
				game.nextPosition2 = "";
				game.nextPosition3 = "";
				game.nextPosition4 = "";
			}else {
				game.nextPosition1 = cluePosition;
				game.nextPosition2 = "";
				game.nextPosition3 = "";
				game.nextPosition4 = "";
				}
		
			
		}else {
			ui.mainTextArea.setText("You try to decipher the clue but fail miserably.\n"
					+ "From what little the clue gave you, you now see how insignificant you truely are. \n"
					+ "You lose hope! (You lose 5 sanity!) ");
			player.sanity = player.sanity -5;
			ui.sanityLabelNbr.setText(""+player.sanity);
			
			ui.choice1.setText(">");
			ui.choice2.setText("");
			ui.choice3.setText("");
			ui.choice4.setText("");
			
			game.nextPosition1 = failPosition;
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			
		}
		if(player.hp <= 0) {
			game.nextPosition1 = "hpOver";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}else if(player.sanity <= 0) {
			game.nextPosition1 = "sanityOver";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}else {
			game.nextPosition1 = failPosition;
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
		}
	}
	
}
