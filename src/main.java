//Author: Matt Baldwin
import java.io.*;
import javax.swing.*;
import java.util.*;
public class main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		JFrame frame = new JFrame("Night-Day Role-Play: The App Edition");
//		frame.setSize(500, 500);
//		frame.setVisible(true);
		//JPanel panel = new JPanel();
		//panel.setSize(500, 500);
		System.out.println("Night-Day Role-Play: The App Edition");
		addPlayers();
		
	}
	public static void addPlayers()
	{
		HashMap<String, String> players = new HashMap<String, String>();
		List<Object> listOfPlayerNames = new ArrayList<Object>();
		//Player player;
		String playerName;
		Role role;
		int numOfPlayers = 0;
		Scanner reader = new Scanner(System.in);
		String choice = "";
		System.out.println("How many players? ");
		numOfPlayers = reader.nextInt();
		reader.nextLine();
		while(!choice.equalsIgnoreCase("N"))
		{
			System.out.println("Name of player: ");
//			player = new Player(reader.nextLine());
			playerName = reader.nextLine();
			listOfPlayerNames.add(playerName);
			System.out.println("Role: ");
			role = new Role(reader.nextLine());
			//link player and role together somehow
			players.put(playerName, role.getRoleName());
			//connect role functionality
			System.out.println("Add another player? Y/N");
			choice = reader.nextLine();
			while(!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N"))
			{
				System.out.println("Invalid choice.  Try again.");
				System.out.println("Add another player? Y/N");
				choice = reader.nextLine();
			}
		}
		printPlayerRoles(players, listOfPlayerNames);
		reader.close();
	}
	//Prints player's name with their role name
	public static void printPlayerRoles(HashMap<String, String> werewolfPlayers, List<Object> playerNames)
	{
		for(int i = 0; i < playerNames.size(); i++)
		{
			System.out.println(playerNames.get(i) + "'s role: " + werewolfPlayers.get(playerNames.get(i)));
		}
	}
	
	public static boolean beginNightPhase()
	{
		boolean beginNight = false;
		//if user wants night time to begin
		//return true
		return beginNight;
	}
	
	//checks if player needs to wake up to perform role duty
	public static boolean wakePlayerUp()
	{
		boolean wakeup = false;
		return wakeup;
	}
}