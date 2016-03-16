package game.controller;

public class ButtonController
	{
		private GameController baseController;
		private boolean isMainMenuShowing;

		public ButtonController(GameController baseController)
			{
				this.baseController = baseController;
			}

		public void startButtonOperation()
			{

			}

		public void loadButtonOperation()
			{

			}

		public void optionsButtonOperation()
			{
				if (isMainMenuShowing)
					{
						baseController.getFrame().getPanel().getMainMenuPanel().setVisible(false);
						baseController.getFrame().getPanel().getOptionsMenuPanel().setVisible(true);
						isMainMenuShowing = false;
					}
				else
					{
						baseController.getFrame().getPanel().getMainMenuPanel().setVisible(true);
						baseController.getFrame().getPanel().getOptionsMenuPanel().setVisible(false);
						isMainMenuShowing = true;
					}
			}
		
		public void exitButtonOperation()
			{
				System.exit(0);
			}
	}
