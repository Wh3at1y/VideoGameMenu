package game.controller;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.JLabel;
import game.menus.MainMenu;
import game.menus.OptionsMenu;
import game.view.GameFrame;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.*;

public class GameController
	{
		private GameFrame baseFrame;
		private ButtonController buttonController;
		private MusicController playSound;

		public GameController()
			{
				new JFXPanel();
				baseFrame = new GameFrame(this);
				buttonController = new ButtonController(this);
				playSound = new MusicController(this);
				playSound.menuSong();
			}

		public void buildButton(JLabel button)
			{
				button.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 35));
				button.setEnabled(false);
				button.setForeground(Color.WHITE);
				mainButtonListeners(button);
			}

		/**
		 * 
		 * @param button
		 *            : The button the user clicks on
		 */
		public void mainButtonListeners(JLabel button)
			{
				button.addMouseListener(new MouseListener()
					{
						public void mouseClicked(MouseEvent clicked)
							{
								
							}

						public void mousePressed(MouseEvent e)
							{
								if (button == getMainMenuPanel().getOptionsLabel() || button == getOptionsPanel().getBackLabel()) // Options and Back Button
									buttonController.optionsButtonOperation(); // Load the options operations
								if (button == getMainMenuPanel().getStartLabel()) // Start Button
									buttonController.startButtonOperation(); // Load start button operations
								if (button == getMainMenuPanel().getLoadLabel()) // Load Button
									buttonController.loadButtonOperation(); // Load the load game operations
								if (button == getMainMenuPanel().getExitLabel()) // Exit Button
									buttonController.exitButtonOperation(); // Load the exit button operations
								if (button == getOptionsPanel().getToggleMusicLabel())
									buttonController.toggleMenuMusic();
								//if(button == getOptionsPanel().getToggleClicksLabel())
								
								
								/**
								 * ------------- Options Menu Listeners
								 */
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

		/*
		 * --------Getters
		 */
		public MainMenu getMainMenuPanel()
			{
				return baseFrame.getPanel().getMainMenuPanel();
			}

		public OptionsMenu getOptionsPanel()
			{
				return baseFrame.getPanel().getOptionsMenuPanel();
			}
		
		public MusicController getMusicController()
		{
			return playSound;
		}
	}
