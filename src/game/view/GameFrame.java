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
				this.setUndecorated(true);
				this.setExtendedState(JFrame.MAXIMIZED_BOTH);
				this.setContentPane(basePanel);
				this.setVisible(true);
				this.basePanel.updateBackgroundImage(this.getWidth(), this.getHeight());
			}

		public GamePanel getPanel()
			{
				return basePanel;
			}

	}
