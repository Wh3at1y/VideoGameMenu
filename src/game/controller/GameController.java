package game.controller;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import game.menus.MainMenu;
import game.menus.OptionsMenu;
import game.view.GameFrame;

public class GameController
	{
		private GameFrame baseFrame;
		private ButtonController buttonController;
		private int screenSize;

		public GameController()
			{
				baseFrame = new GameFrame(this);
				buttonController = new ButtonController(this);
			}

		public void start()
			{
				try
					{
						AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("resources/song.wav").getAbsoluteFile());
						Clip musicClip = AudioSystem.getClip();
						musicClip.open(audioInputStream);
						musicClip.start();
					}
				catch (Exception error)
					{
						System.out.println("Error with playing sound.");
						error.printStackTrace();
					}
			}

		public void buildButton(JLabel button)
			{
				button.setFont(new Font("Microsoft Yi Baiti", Font.PLAIN, 30));
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
						public void mouseClicked(MouseEvent e)
							{
								if (button == getMainMenuPanel().getStartLabel()) // Start Button
									buttonController.startButtonOperation(); // Load start button operations
								if (button == getMainMenuPanel().getLoadLabel()) // Load Button
									buttonController.loadButtonOperation(); // Load the load game operations
								if (button == getMainMenuPanel().getOptionsLabel() || button == getOptionsPanel().getBackLabel()) // Options and Back Button
									buttonController.optionsButtonOperation(); // Load the options operations
								if (button == getMainMenuPanel().getExitLabel()) // Exit Button
									buttonController.exitButtonOperation(); // Load the exit button operations

								/**
								 * ------------- Options Menu Listeners
								 */
								
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

		/*
		 * --------Getters
		 */
		public GameFrame getFrame()
			{
				return baseFrame;
			}

		public MainMenu getMainMenuPanel()
			{
				return baseFrame.getPanel().getMainMenuPanel();
			}

		public OptionsMenu getOptionsPanel()
			{
				return baseFrame.getPanel().getOptionsMenuPanel();
			}

		public int getScreenSize()
			{
				return screenSize;
			}
	}
