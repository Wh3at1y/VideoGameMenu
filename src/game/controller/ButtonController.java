package game.controller;

public class ButtonController extends GameController
	{
		public void startButtonOperation()
		{
			
		}
		
		public void loadButtonOperation()
			{
				
			}
		
		public void optionsButtonOperation()
			{
				this.getFrame().getPanel().getMainMenuPanel().setVisible(false);
				this.getFrame().getPanel().getOptionsMenuPanel().setVisible(true);
			}
		
		public void exitButtonOperation()
			{
				System.exit(0);
			}
	}
