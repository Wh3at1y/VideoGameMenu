package game.menus;

import game.controller.GameController;
import javax.swing.*;

public class LoadMenu extends JPanel
	{
		private SpringLayout baseLayout;
		private JLabel startGameLabel;
		private JLabel chooseProfileLabel;
		private JLabel userNameLabel;
		private JLabel highScoreLabel;
		private JLabel backLabel;
		private JFileChooser openFileChooser;

		public LoadMenu(GameController baseController)
			{
				baseLayout = new SpringLayout();
				openFileChooser = new JFileChooser();
				startGameLabel = new JLabel("Start Game");
				chooseProfileLabel = new JLabel("Select Different Profile");
				userNameLabel = new JLabel("UserName :");
				highScoreLabel = new JLabel("High-Score : ");
				backLabel = new JLabel("Back");

				baseController.buildButton(startGameLabel);
				baseController.buildButton(chooseProfileLabel);
				baseController.buildLabelOnly(userNameLabel);
				baseController.buildLabelOnly(highScoreLabel);
				baseController.buildButton(backLabel);

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setOpaque(false);
				setVisible(false);
				setLayout(baseLayout);
				add(startGameLabel);
				add(chooseProfileLabel);
				add(userNameLabel);
				add(highScoreLabel);
				add(backLabel);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, backLabel, 50, SpringLayout.NORTH, highScoreLabel);
				baseLayout.putConstraint(SpringLayout.WEST, backLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, highScoreLabel, 50, SpringLayout.NORTH, userNameLabel);
				baseLayout.putConstraint(SpringLayout.WEST, highScoreLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.WEST, userNameLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, userNameLabel, 50, SpringLayout.NORTH, chooseProfileLabel);
				baseLayout.putConstraint(SpringLayout.NORTH, chooseProfileLabel, 50, SpringLayout.NORTH, startGameLabel);
				baseLayout.putConstraint(SpringLayout.WEST, chooseProfileLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, startGameLabel, 200, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, startGameLabel, 150, SpringLayout.WEST, this);
			}

		public JLabel getChooseProfileLabel()
			{
				return chooseProfileLabel;
			}

		public JFileChooser getFileChooser()
			{
				return openFileChooser;
			}

		public JLabel getUserNameLabel()
			{
				return userNameLabel;
			}

		public JLabel getHighScoreLabel()
			{
				return highScoreLabel;
			}

		public JLabel getBackLabel()
			{
				return backLabel;
			}
	}
