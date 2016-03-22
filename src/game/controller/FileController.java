package game.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;

public class FileController
	{
		private GameController baseController;
		private FileReader fileRead;
		private BufferedReader br;

		public FileController(GameController baseController)
			{
				this.baseController = baseController;

				File dir = new File(FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/Documents/Pixels");
				if (!dir.exists())
					dir.mkdirs();
			}

		public void makeFile(String userName)
			{
				try
					{
						FileWriter fileWrite = new FileWriter(FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/Documents/Pixels/" + userName + ".txt");
						System.out.println();
						fileWrite.write(baseController.getNewGamePanel().getUserName().getText());
						fileWrite.write("\n");
						fileWrite.write("0");
						fileWrite.close();
					}
				catch (IOException e)
					{
						System.out.println("Error making file");
					}
			}

		public void loadProfile()
			{
				baseController.getLoadPanel().getFileChooser().showOpenDialog(null);
				try
					{
						fileRead = new FileReader(baseController.getLoadPanel().getFileChooser().getSelectedFile());
						br = new BufferedReader(fileRead);
					}
				catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}
				try
					{
						baseController.getLoadPanel().getUserNameLabel().setText("UserName : " + br.readLine());
						baseController.getLoadPanel().getHighScoreLabel().setText("High-Score : " + br.readLine());
					}
				catch (IOException e)
					{
						e.printStackTrace();
					}
			}
	}
