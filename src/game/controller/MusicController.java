package game.controller;

import java.net.URL;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicController
	{
		private MediaPlayer mainMenuPlayer;
		private MediaPlayer buttonClickPlayer;
		private MediaPlayer buttonHoverPlayer;
		
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

		public MediaPlayer getButtonClickPlayer()
			{
				return buttonClickPlayer;
			}

		public MediaPlayer getButtonHoverPlayer()
			{
				return buttonHoverPlayer;
			}

		public MediaPlayer getMainMenuPlayer()
			{
				return mainMenuPlayer;
			}
	}
