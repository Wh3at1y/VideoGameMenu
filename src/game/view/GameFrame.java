package game.view;

import game.controller.GameController;
import javax.swing.JFrame;

public class GameFrame extends JFrame
	{
		private GamePanel basePanel;
		
		public GameFrame(GameController baseController)
		{
			basePanel = new GamePanel(baseController);
			buildFrame();
		}
		
		private void buildFrame()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(1280,800);
			this.setResizable(false);
			this.setTitle("Pixels");
			this.setContentPane(basePanel);
			this.setVisible(true);
		}
		
		public GamePanel getPanel()
		{
			return basePanel;
		}
	}
