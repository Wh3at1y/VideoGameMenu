package game.controller;

import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicController
	{
		private GameController baseController;
		private MediaPlayer mainMenuPlayer;
		private MediaPlayer buttonClickPlayer;
		private MediaPlayer buttonHoverPlayer;

		private boolean isButtonClicksOn;
		private boolean isMenuSongPlaying;

		public MusicController(GameController baseController)
			{
				this.baseController = baseController;
				this.isButtonClicksOn = true;
			}

		public void menuMusicStatus()
			{
				if (isMenuSongPlaying)
					{
						mainMenuPlayer.play();
						baseController.getOptionsPanel().getToggleMusicLabel().setText("Toggle Music : On");
						isMenuSongPlaying = false;
					}
				else
					{
						mainMenuPlayer.pause();
						baseController.getOptionsPanel().getToggleMusicLabel().setText("Toggle Music : Off");
						isMenuSongPlaying = true;
					}
			}

		public void buttonClickStatus()
			{
				if (isButtonClicksOn)
					{
						isButtonClicksOn = false;
						baseController.getOptionsPanel().getToggleClicksLabel().setText("Toggle Button Sounds : Off");
					}
				else
					{
						isButtonClicksOn = true;
						baseController.getOptionsPanel().getToggleClicksLabel().setText("Toggle Button Sounds : On");
					}
			}

		public void menuSong()
			{
				URL resource = getClass().getResource("/resources/song.wav");
				Media media = new Media(resource.toString());
				mainMenuPlayer = new MediaPlayer(media);
				mainMenuPlayer.play();
			}

		public void buttonClick()
			{
				URL resource = getClass().getResource("/resources/buttonClick.wav");
				Media media = new Media(resource.toString());
				buttonClickPlayer = new MediaPlayer(media);
				buttonClickPlayer.setVolume(.35);
				buttonClickPlayer.play();
			}

		public void buttonHover()
			{
				URL resource = getClass().getResource("/resources/click.wav");
				Media media = new Media(resource.toString());
				buttonHoverPlayer = new MediaPlayer(media);
				buttonHoverPlayer.setVolume(.2);
				buttonHoverPlayer.play();
			}

		public boolean getButtonClicks()
			{
				return isButtonClicksOn;
			}
	}
