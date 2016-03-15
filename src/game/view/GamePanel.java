package game.view;

import java.awt.Image;
import game.controller.GameController;
import game.menus.*;
import javax.swing.*;

public class GamePanel extends JPanel
	{
		private SpringLayout baseLayout;
		private MainMenu mainMenuPanel;
		private OptionsMenu optionsMenuPanel;
		private JLabel backgroundImage;

		public GamePanel(GameController baseController)
			{
				baseLayout = new SpringLayout();
				mainMenuPanel = new MainMenu(baseController);
				optionsMenuPanel = new OptionsMenu(baseController);
				
				backgroundImage = new JLabel(new ImageIcon(GamePanel.class.getResource("/colorwave.gif")));

				buildPanel();
				buildWindow();
				buildListeners();
			}

		private void buildPanel()
			{
				setLayout(baseLayout);
				add(mainMenuPanel);
				add(optionsMenuPanel);
				add(backgroundImage);
			}

		private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.NORTH, backgroundImage, 0, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, backgroundImage, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, backgroundImage, 0, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, backgroundImage, 0, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, mainMenuPanel, 0, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, mainMenuPanel, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, mainMenuPanel, 0, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, mainMenuPanel, 0, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, optionsMenuPanel, 0, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, optionsMenuPanel, 0, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, optionsMenuPanel, 0, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, optionsMenuPanel, 0, SpringLayout.EAST, this);
			}

		private void buildListeners()
			{

			}

		public void updateBackgroundImage(int x, int y)
			{
				ImageIcon imageIcon = new ImageIcon("resources/colorwave.gif"); // load the image to a imageIcon
				Image image = imageIcon.getImage(); // transform it
				Image newimg = image.getScaledInstance(x, y, java.awt.Image.SCALE_FAST); // scale it the smooth way
				imageIcon = new ImageIcon(newimg); // transform it back
				backgroundImage = new JLabel(new ImageIcon(GamePanel.class.getResource("/colorwave.gif")));
			}
		
		public MainMenu getMainMenuPanel()
			{
				return mainMenuPanel;
			}
		
		public OptionsMenu getOptionsMenuPanel()
		{
			return optionsMenuPanel;
		}

	}
