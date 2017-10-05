/*
                                                 ,  ,
                                               / \/ \
                                              (/ //_ \_
     .-._                                      \||  .  \
      \  '-._                            _,:__.-"/---\_ \
 ______/___  '.    .--------------------'~-'--.)__( , )\ \
`'--.___  _\  /    |             Here        ,'    \)|\ `\|
     /_.-' _\ \ _:,_          Be Dragons           " ||   (
   .'__ _.' \'-/,`-~`                                |/
       '. ___.> /=,|  Abandon hope all ye who enter  |            
        / .-'/_ )  '---------------------------------'
        )'  ( /(/
             \\ "
              '=='
 
This horrible monstrosity takes a medicare monstrosity and mangles it
into a data structure that can easily be used to create a medicare feed.
It's bloated, confusing, and pretty awful by necessity(for the most part).
*//*
███████████████████████████      
███████▀▀▀░░░░░░░▀▀▀███████
████▀░░░░░░░░░░░░░░░░░▀████
███│░░░░░░░░░░░░░░░░░░░│███
██▌│░░░░░░░░░░░░░░░░░░░│▐██
██░└┐░░░░░░░░░░░░░░░░░┌┘░██
██░░└┐░░░░░░░░░░░░░░░┌┘░░██
██░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░██
██▌░│██████▌░░░▐██████│░▐██
███░│▐███▀▀░░▄░░▀▀███▌│░███
██▀─┘░░░░░░░▐█▌░░░░░░░└─▀██
██▄░░░▄▄▄▓░░▀█▀░░▓▄▄▄░░░▄██
████▄─┘██▌░░░░░░░▐██└─▄████
█████░░▐█─┬┬┬┬┬┬┬─█▌░░█████
████▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐████
█████▄░░░└┴┴┴┴┴┴┴┘░░░▄█████
███████▄░░░░░░░░░░░▄███████
██████████▄▄▄▄▄▄▄██████████
███████████████████████████
*/
/*
 ── ── ── ── ── ── ██ ██ ██ ██ ██ ── ██ ██ ── ── 
── ── ── ── ██ ██ ▒▒ ░░ ░░ ░░ ░░ ██ ▒▒ ░░ ██ ── 
── ── ── ██ ▒▒ ░░ ░░ ██ ░░ ██ ░░ ░░ ██ ░░ ░░ ██ 
── ── ██ ▒▒ ░░ ░░ ░░ ██ ░░ ██ ░░ ░░ ░░ ▒▒ ░░ ██ 
── ── ██ ░░ ░░ ░░ ░░ ██ ░░ ██ ░░ ░░ ░░ ▒▒ ▒▒ ██ 
── ██ ░░ ░░ ░░ ▒▒ ▒▒ ░░ ░░ ░░ ▒▒ ▒▒ ░░ ░░ ▒▒ ██ 
██ ▒▒ ░░ ░░ ░░ ░░ ░░ ░░ ██ ░░ ░░ ░░ ░░ ░░ ░░ ██ 
██ ░░ ░░ ▒▒ ░░ ░░ ░░ ░░ ██ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ 
██ ░░ ░░ ▒▒ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ██ ── 
── ██ ██ ██ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ── 
██ ▒▒ ▒▒ ▒▒ ██ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ── 
██ ▒▒ ▒▒ ▒▒ ▒▒ ██ ░░ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ── ── 
██ ▒▒ ▒▒ ▒▒ ▒▒ ██ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ██ ── ── 
── ██ ▒▒ ▒▒ ▒▒ ▒▒ ██ ▒▒ ▒▒ ▒▒ ██ ██ ▒▒ ▒▒ ██ ── 
── ── ██ ▒▒ ▒▒ ██ ██ ██ ██ ██ ▒▒ ▒▒ ▒▒ ▒▒ ▒▒ ██ 
── ── ── ██ ██ ██ ── ── ── ██ ██ ██ ██ ██ ██ ──
  *//*
  ████████████████████████████████████████████████████████████████████████████████████████
█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█
█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░██░░▄▀░░█████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█
█░░▄▀░░░░░░░░░░█░░▄▀▄▀▄▀▄▀▄▀░░██░░▄▀░░█████████░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░░░▄▀░░██░░▄▀░░░░█
█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░██░░▄▀░░█████████░░▄▀░░█░░▄▀░░██░░▄▀░░███░░▄▀▄▀░░▄▀▄▀░░███
█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█████████░░▄▀░░█░░▄▀░░██░░▄▀░░███░░░░▄▀▄▀▄▀░░░░███
█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█████████░░▄▀░░█░░▄▀░░██░░▄▀░░█████░░░░▄▀░░░░█████
█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░░░░░██░░▄▀░░█░░▄▀░░██░░▄▀░░███████░░▄▀░░███████
█░░▄▀░░█████████░░▄▀░░██░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░███████░░▄▀░░███████
█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░███████░░▄▀░░███████
█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░███████░░▄▀░░███████
█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░███████░░░░░░███████
████████████████████████████████████████████████████████████████████████████████████████
*/
package player;


import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javazoom.jl.decoder.*;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class Music 
 {
	public static String music;
	String check = "no";
	String greeting;
	String yes;
	String name;
	String path;
	String yo;
	String uni;
	File playlist;
	File nameOf;
	JTextField text = new JTextField("" + greeting);
	JButton button = new JButton("Yo,Click me!");
	JRadioButton radio = new JRadioButton("" + greeting);
	JPanel panel = new JPanel();
	JLabel label = new JLabel("" + greeting);
	public static AdvancedPlayer player;
	
	public void frame(){
		JFrame frame = new JFrame();
		frame.getContentPane().add(BorderLayout.NORTH,button);
		frame.getContentPane().add(BorderLayout.EAST,radio);
		frame.getContentPane().add(BorderLayout.SOUTH,text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(360,360);
		frame.setVisible(true);
		panel.add(label);
	}

	public void text() {
		JFrame frame = new JFrame();
		frame.getContentPane().add(BorderLayout.SOUTH,text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(360,360);
		frame.setVisible(true);
		if(check.equals("yes")){
			frame.setVisible(false);
		}
	}
	
	public void play() {
		//System.out.println("Do you want to play?");
		text.setText("Do you want to play?");
		text();
		String choice  = text.getText();
		choice.toLowerCase();
		//System.out.println("Which song do you want to play?");
		text.setText("Which song do you want to play?");		
		String qwerty = name + "\\" +text.getText()+".mp3";
		music = qwerty;
		if(choice.equals("yes")){
		try {
			FileInputStream file = new FileInputStream(music);
			try {
				player = new AdvancedPlayer(file);
				player.play();
				
				} catch (JavaLayerException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}
		
	}
	
	public String playList() throws IOException, InterruptedException{
		//System.out.println("What is the name of your playlist?");
		greeting = "What is the name of your playlist?";
		String path = text.getText();
		name = "C:\\Users\\yasir_000\\workspace\\player\\" + path;
		playlist = new File("C:\\Users\\yasir_000\\workspace\\player\\usual");
		nameOf = new File(name);
		playlist.mkdir();
		//System.out.println("Do you want a custom playlist or default playlist?");
		greeting = "Do you want a custom playlist or default playlist?";
		String choiceOfPlay = text.getText();
		if(choiceOfPlay.equals("default")){
			Process process = Runtime.getRuntime().exec("cmd /c start CopyNewToMP3.bat");
			int exitVal = process.waitFor();
			if(exitVal == 0){
				System.out.println("Did it work?");
				Scanner scanner2 = new Scanner(System.in);
				String choice4 = scanner2.nextLine();
				if(choice4.equals("yes")){
					playlist.renameTo(nameOf);
			}
		}
			
		}
		 yo  = path;
	 
		return yo;


	}
	
	public void renameFile(){
		File key = new File("C:\\Users\\yasir_000\\workspace\\player\\" + yo);
		File key2 = new File("C:\\Users\\yasir_000\\workspace\\player\\usual");
		if(yes.equals("add")){
			key2.renameTo(key);
		}else{
			System.out.println("Enter the new name:");
			Scanner newName = new Scanner(System.in);
			String brandNew = newName.nextLine();
			File key3 = new File("C:\\Users\\yasir_000\\workspace\\player\\" + brandNew);
			key.renameTo(key3);
			name = "C:\\Users\\yasir_000\\workspace\\player\\" + brandNew;
		}
	}

	public void addSongs() throws IOException, InterruptedException{
		  System.out.println("What songs do you want to add?");
		  Scanner listOf = new Scanner(System.in);
		  String list2 = listOf.nextLine();
		  String list[] = new String[20];
		  	if (list2.contains(",")) {
			    // Split it.
			  String[] parts = list2.split(",");
			  for(int i = 0;i<parts.length;i++){
			   list[i] = parts[i] + ".mp3";
			   System.out.println(list[i]);
			  }
			} else {
			    throw new IllegalArgumentException("String " + list2 + " does not contain ,");
			}
		  int counter = 0;
		  for (int i = 0; i < list.length; i ++){
		  	    if (list[i] != null)
		  	        counter ++;	
		  	    }	
		  for(int j =0;j<counter;j++){
			  File file1 = new File("C:\\Music 2017\\" + list[j]);
			  Path sourcePath = file1.toPath();
			  String fileName = file1.getName();
			  Path targetPath = Paths.get("C:\\Users\\yasir_000\\workspace\\player\\usual",fileName);
			  Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
		  }
	}
	
	public boolean remove(){
		System.out.println("What do you want to remove?");
		Scanner choiceOfRemove = new Scanner(System.in);
		String remove = choiceOfRemove.nextLine();
		File path = new File("C:\\Users\\yasir_000\\workspace\\player\\" + remove);
		    if (path.exists()) {
		        File[] files = path.listFiles();
		        for (int i = 0; i < files.length; i++) {
		            if (files[i].isDirectory()) {
		                files[i].delete();
		            } else {
		                files[i].delete();
		            }
		        }
		    }
		    return (path.delete());
		}
	
	
	public void playNet() throws MalformedURLException, IOException {
       String song = "http://mp3goo.co//download/attention-charlie-puth/Attention.mp3";

       URLConnection connection = new URL("http://songolum.com/file/gpqeFwZxOZ2fsex6DxOI7a76Mhw4hm_YKUcsdriRIOs/Attention.mp3?r=idz&dl=311&ref=attention-charlie-puth").openConnection();
 	  	InputStream is = connection.getInputStream();

	    OutputStream outstream = new FileOutputStream(new File("C:\\Music\\mysong2.mp3"));

   	byte[] buffer = new byte[4096];
   	int length;
   	while ((length = is.read(buffer)) > 0) {
       	outstream.write(buffer, 0, length);
   	}
		System.out.println("The download is completed.");
		outstream.close();
}
	

		}

	
	

