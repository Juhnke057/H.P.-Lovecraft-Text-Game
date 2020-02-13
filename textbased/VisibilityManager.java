package textbased;

public class VisibilityManager {

	UI ui;

	
	public VisibilityManager(UI userInterface) {
		
		ui = userInterface;
		
	}
	
	public void showTitleScreen() {
		
		//Show the title screen
		ui.titleNamePanel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		
		//hide the game screen
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
	}
	
	public void showGameScreen() {
		
		//Hide the title screen
		ui.titleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		
		//Show the game screen
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
	}
	
}
