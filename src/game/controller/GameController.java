package game.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import game.view.GameFrame;

public class GameController
	{
		private GameFrame baseFrame;
		private ButtonController buttonController;

		public GameController()
			{
				baseFrame = new GameFrame(this);
				buttonController = new ButtonController();
			}

		public void start()
			{
				//Start Menu Music
			}

		public GameFrame getBaseFrame()
			{
				return baseFrame;
			}

		public void buildButton(JLabel button)
			{
				button.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 30));
				button.setEnabled(false);
				button.setForeground(Color.WHITE);

				mainButtonListeners(button);
			}

		public void mainButtonListeners(JLabel button)
			{
				button.addMouseListener(new MouseListener()
					{
						public void mouseClicked(MouseEvent e)
							{
								if (button == baseFrame.getPanel().getMainMenuPanel().getStartLabel())
									buttonController.startButtonOperation();
								if (button == baseFrame.getPanel().getMainMenuPanel().getLoadLabel())
									buttonController.loadButtonOperation();
								if (button == baseFrame.getPanel().getMainMenuPanel().getOptionsLabel())
									buttonController.optionsButtonOperation();
								if (button == baseFrame.getPanel().getMainMenuPanel().getExitLabel())
									buttonController.exitButtonOperation();
							}

						public void mousePressed(MouseEvent e)
							{

							}

						public void mouseReleased(MouseEvent e)
							{

							}

						public void mouseEntered(MouseEvent e)
							{
								button.setEnabled(true);
							}

						public void mouseExited(MouseEvent e)
							{
								button.setEnabled(false);
							}
					});
			}
		
		public GameFrame getFrame()
		{
			return baseFrame;
		}
	}
