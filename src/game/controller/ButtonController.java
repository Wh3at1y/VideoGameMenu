package game.controller;

public class ButtonController
	{
		private GameController baseController;
		private boolean isMainMenuShowing;
		private boolean isMenuSongPlaying;
		private boolean isButtonClicksOn;

		public ButtonController(GameController baseController)
			{
				this.baseController = baseController;
				this.isMainMenuShowing = true;
				this.isMenuSongPlaying = true;
				this.isButtonClicksOn = true;
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

		public void toggleMenuMusic()
			{
				if (isMenuSongPlaying)
					{
						baseController.getMusicController().menuMusicStatus(false);
						isMenuSongPlaying = false;
					}
				else
					{
						baseController.getMusicController().menuMusicStatus(true);
						isMenuSongPlaying = true;
					}
			}

		public void exitButtonOperation()
			{
				System.exit(0);
			}
	}
