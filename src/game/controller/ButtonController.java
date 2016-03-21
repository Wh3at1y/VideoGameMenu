package game.controller;

public class ButtonController
	{
		private GameController baseController;
		private boolean isMainMenuShowing;

		public ButtonController(GameController baseController)
			{
				this.baseController = baseController;
				this.isMainMenuShowing = true;
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
						baseController.getMainMenuPanel().setVisible(false);
						baseController.getOptionsPanel().setVisible(true);
						isMainMenuShowing = false;
					}
				else
					{
						baseController.getMainMenuPanel().setVisible(true);
						baseController.getOptionsPanel().setVisible(false);
						isMainMenuShowing = true;
					}
			}

		public void exitButtonOperation()
			{
				System.exit(0);
			}
	}
