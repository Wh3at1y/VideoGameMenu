package game.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ButtonController
	{
		private GameController baseController;
		private boolean isMainMenuShowing;

		public ButtonController(GameController baseController)
			{
				this.baseController = baseController;
				this.isMainMenuShowing = true;

				
			}

		public void newGameButtonOperation()
			{

				if (isMainMenuShowing)
					{
						baseController.getMainMenuPanel().setVisible(false);
						baseController.getNewGamePanel().setVisible(true);
						isMainMenuShowing = false;
					}
				else
					{
						baseController.getMainMenuPanel().setVisible(true);
						baseController.getNewGamePanel().setVisible(false);
						isMainMenuShowing = true;
					}
			}

		public void loadButtonOperation()
			{
				if (isMainMenuShowing)
					{
						baseController.getMainMenuPanel().setVisible(false);
						baseController.getLoadPanel().setVisible(true);
						isMainMenuShowing = false;
					}
				else
					{
						baseController.getMainMenuPanel().setVisible(true);
						baseController.getLoadPanel().setVisible(false);
						isMainMenuShowing = true;
					}
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
						baseController.getLoadPanel().setVisible(false);
						baseController.getNewGamePanel().setVisible(false);
						isMainMenuShowing = true;
					}
			}

		public void exitButtonOperation()
			{
				System.exit(0);
			}
	}
