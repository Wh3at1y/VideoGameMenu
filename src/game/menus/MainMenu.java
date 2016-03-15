package game.menus;

import game.controller.GameController;
import javax.swing.*;

public class MainMenu extends JPanel
	{
		private SpringLayout baseLayout;
		private JLabel startLabel;
		private JLabel optionsLabel;
		private JLabel loadLabel;
		private JLabel exitLabel;

		public MainMenu(GameController baseController)
			{
				baseLayout = new SpringLayout();

				startLabel = new JLabel("New Game");
				optionsLabel = new JLabel("Options");
				loadLabel = new JLabel("Load Profile");
				exitLabel = new JLabel("Quit Game");

				baseController.buildButton(startLabel);
				baseController.buildButton(optionsLabel);
				baseController.buildButton(loadLabel);
				baseController.buildButton(exitLabel);

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setOpaque(false);
				setLayout(baseLayout);
				add(startLabel);
				add(optionsLabel);
				add(loadLabel);
				add(exitLabel);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, startLabel, 100, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.NORTH, exitLabel, 50, SpringLayout.NORTH, optionsLabel);
				baseLayout.putConstraint(SpringLayout.WEST, exitLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.WEST, loadLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, optionsLabel, 50, SpringLayout.NORTH, loadLabel);
				baseLayout.putConstraint(SpringLayout.NORTH, loadLabel, 50, SpringLayout.NORTH, startLabel);
				baseLayout.putConstraint(SpringLayout.WEST, optionsLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.WEST, startLabel, 150, SpringLayout.WEST, this);
			}

		public JLabel getStartLabel()
			{
				return startLabel;
			}

		public JLabel getOptionsLabel()
			{
				return optionsLabel;
			}

		public JLabel getLoadLabel()
			{
				return loadLabel;
			}

		public JLabel getExitLabel()
			{
				return exitLabel;
			}
		
	}
