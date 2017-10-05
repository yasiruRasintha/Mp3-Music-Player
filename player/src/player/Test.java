package player;

import java.io.IOException;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		//launch(args);
		// TODO Auto-generated method stub
		Music player = new Music();
		int time = 0;
		while(time == 0){
		System.out.println("What do you want to do?");
		Scanner choiceOf = new Scanner(System.in);
		String toDo = choiceOf.nextLine();
		switch(toDo){
			case "play"   : player.play();
					    	break;
					  
			case "create" : player.playList();
							break;
						
			case "add"    : player.addSongs();player.yes = "add";player.renameFile();player.yes = "nope";
							break;	
					
			case "rename" : player.renameFile();
							break;
					 
			case "done"	  : time = time + 1;
					    	break;
					   
			case "remove" : player.remove();
							break;
						
			case "Net"	  :	player.playNet();
							break;
							
		}
		}

		
		
	}

	
	
	
}
