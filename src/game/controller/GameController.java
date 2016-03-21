package game.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import game.menus.*;
import game.view.GameFrame;
import javafx.embed.swing.JFXPanel;

public class GameController
	{
		private GameFrame baseFrame;
		private ButtonController buttonController;
		private MusicController playSound;

		public GameController()
			{
				new JFXPanel();	//Starts JFXPanel for MP3 Audio
				baseFrame = new GameFrame(this);
				buttonController = new ButtonController(this);
				playSound = new MusicController(this);
				playSound.menuSong();	//Starts the MainMenu song
			}

		public void buildButton(JLabel button)
			{
				button.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 35));
				button.setEnabled(false);
				button.setForeground(Color.WHITE);
				mainButtonListeners(button);	//passes the button into the listener
			}

		/**
		 * @param button
		 *            : The button the user clicks on
		 *            Makes listeners for all the buttons that call for it
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
								if (playSound.getButtonClicks() == true)	//Checks the toggle clicks status
									playSound.buttonClick();	//Plays the sound
								if (button == getMainMenuPanel().getOptionsLabel() || button == getOptionsPanel().getBackLabel()) // Options and Back Button
									buttonController.optionsButtonOperation(); // Load the options operations
								if (button == getMainMenuPanel().getStartLabel()) // Start Button
									buttonController.startButtonOperation(); // Load start button operations
								if (button == getMainMenuPanel().getLoadLabel()) // Load Button
									buttonController.loadButtonOperation(); // Load the load game operations
								if (button == getMainMenuPanel().getExitLabel()) // Exit Button
									buttonController.exitButtonOperation(); // Load the exit button operations

								/**
								 * ------------- Load Menu Listeners
								 */
								if(button == getMainMenuPanel().getLoadLabel())
									baseFrame.getPanel().getLoadMenu().showFileChooser();
								/**
								 * ------------- Options Menu Listeners
								 */
								if (button == getOptionsPanel().getToggleMusicLabel())	//Toggle Music Button
									playSound.menuMusicStatus();	//Toggles the sound
								if (button == getOptionsPanel().getToggleClicksLabel())	//Toggle Button click sounds
									playSound.buttonClickStatus();	//Toggles the sound
							}

						public void mouseReleased(MouseEvent e)
							{

							}

						public void mouseEntered(MouseEvent e)
							{
								if (playSound.getButtonClicks() == true)
									playSound.buttonHover();
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
