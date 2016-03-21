package game.menus;

import game.controller.GameController;
import javax.swing.*;

public class OptionsMenu extends JPanel
	{
		private SpringLayout baseLayout;
		private JLabel toggleMusicLabel;
		private JLabel toggleClicksLabel;
		private JLabel backLabel;

		public OptionsMenu(GameController baseController)
			{
				baseLayout = new SpringLayout();

				toggleMusicLabel = new JLabel("Toggle Music : On");
				toggleClicksLabel = new JLabel("Toggle Button Sounds : On");
				backLabel = new JLabel("Back");

				baseController.buildButton(toggleMusicLabel);
				baseController.buildButton(toggleClicksLabel);
				baseController.buildButton(backLabel);

				buildPanel();
				buildWindow();
			}

		private void buildPanel()
			{
				setVisible(false);
				setOpaque(false);
				setLayout(baseLayout);
				add(toggleMusicLabel);
				add(toggleClicksLabel);
				add(backLabel);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.WEST, backLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, toggleClicksLabel, 50, SpringLayout.NORTH, toggleMusicLabel);
				baseLayout.putConstraint(SpringLayout.WEST, toggleClicksLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, toggleMusicLabel, 200, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, toggleMusicLabel, 150, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, backLabel, 50, SpringLayout.NORTH, toggleClicksLabel);
			}

		public JLabel getToggleMusicLabel()
			{
				return toggleMusicLabel;
			}

		public JLabel getToggleClicksLabel()
			{
				return toggleClicksLabel;
			}

		public JLabel getBackLabel()
			{
				return backLabel;
			}
	}
