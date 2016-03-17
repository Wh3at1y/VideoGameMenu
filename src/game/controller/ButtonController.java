package game.controller;

public class ButtonController
	{
		private GameController baseController;
		private boolean isMainMenuShowing;
		private boolean isMusicPlaying;

		public ButtonController(GameController baseController)
			{
				this.baseController = baseController;
				this.isMainMenuShowing = true;
				this.isMusicPlaying = true;
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
		
		public void toggleMusicOperation()
		{
			if(isMusicPlaying)
				{
					baseController.musicStatus(false);
					isMusicPlaying = false;
				}
			else
				{
					baseController.musicStatus(true);
					isMusicPlaying = true;
				}
		}
		
		public void exitButtonOperation()
			{
				System.exit(0);
			}
	}
