package game.menus;

import game.controller.GameController;
import javax.swing.*;

public class NewGameMenu extends JPanel
	{
		private SpringLayout baseLayout;
		private JTextField userNameField;
		private JLabel userNameLabel;
		private JLabel startGameLabel;
		private JLabel backLabel;

		public NewGameMenu(GameController baseController)
			{
				baseLayout = new SpringLayout();
				userNameField = new JTextField();
				userNameLabel = new JLabel("Enter UserName : ");
				startGameLabel = new JLabel("Start Game");
				backLabel = new JLabel("Back");

				baseController.buildLabelOnly(userNameLabel);
				baseController.buildButton(startGameLabel);
				baseController.buildButton(backLabel);

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setVisible(false);
				setOpaque(false);
				setLayout(baseLayout);
				add(userNameField);
				add(startGameLabel);
				add(backLabel);
				add(userNameLabel);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.WEST, backLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, userNameLabel, 200, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, userNameLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, userNameField, 8, SpringLayout.NORTH, userNameLabel);
				baseLayout.putConstraint(SpringLayout.WEST, userNameField, 6, SpringLayout.EAST, userNameLabel);
				baseLayout.putConstraint(SpringLayout.SOUTH, userNameField, 42, SpringLayout.NORTH, userNameLabel);
				baseLayout.putConstraint(SpringLayout.EAST, userNameField, 167, SpringLayout.EAST, userNameLabel);
				baseLayout.putConstraint(SpringLayout.NORTH, backLabel, 50, SpringLayout.NORTH, startGameLabel);
				baseLayout.putConstraint(SpringLayout.NORTH, startGameLabel, 50, SpringLayout.NORTH, userNameLabel);
				baseLayout.putConstraint(SpringLayout.WEST, startGameLabel, 150, SpringLayout.WEST, this);
			}

		public JTextField getUserName()
			{
				return userNameField;
			}

		public JLabel getStartGameLabel()
			{
				return startGameLabel;
			}

		public JLabel getBackLabel()
			{
				return backLabel;
			}
	}
