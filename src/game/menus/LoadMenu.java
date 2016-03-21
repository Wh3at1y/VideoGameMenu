package game.menus;

import game.controller.GameController;
import javax.swing.*;

public class LoadMenu extends JPanel
	{
		private SpringLayout baseLayout;
		private JLabel userNameLabel;
		private JLabel highScoreLabel;
		private JLabel backLabel;
		private JFileChooser openFileChooser;
		
		public LoadMenu(GameController baseController)
		{	
			baseLayout = new SpringLayout();
			openFileChooser = new JFileChooser();
			userNameLabel = new JLabel("UserName :");
			highScoreLabel = new JLabel("High-Score : ");
			backLabel = new JLabel("Back");
			buildPanel();
		}
		
		private void buildPanel()
		{
			setLayout(baseLayout);
			add(userNameLabel);
			add(highScoreLabel);
			add(backLabel);
		}
		
		public void showFileChooser()
		{
			openFileChooser.showOpenDialog(null);
		}
	}
