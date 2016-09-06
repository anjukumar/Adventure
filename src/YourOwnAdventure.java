import java.util.Scanner;

public class YourOwnAdventure {

	public static void main(String[] args) {
		String response;
		System.out.println("You are in a creepy house!  Would you like to go upstairs or into the kitchen");
		Scanner keyboard = new Scanner (System.in);
		response= keyboard.next();		
		if(response.equals("upstairs"))
		{
			System.out.println("There is a zombie upstairs and It is going to Kill you. Would you like to run back to the kitchen?");
			System.out.println("Yes/No");
			String response6 = keyboard.next();
		
				
		}

		else if(response.equals("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you\'d expect, a refrigerator. You may open the \"refrigerator\"\n or look in a \"cabinet ");
			String response1= keyboard.next();

			if(response1.equals("refridgerator"))
			{

				System.out.println("There is wine bottle with a key at the bottom , an old sandwich , lime juice. Which one would you like to pick up");

				String response2= keyboard.next();
				if(response2.equals("bottle"))
				{
					System.out.println("You must drink this whole bottle of wine to get to the key.. CHUG CHUG CHUG..You are too drunk to play this ");
				}
				else if (response2.equals("old sandwich"))
				{
					System.out.println("This sandwich is as Stale as your life. You may go back to being Pointless. Would you like to try another choice?");
					String response3= keyboard.next(); 

					{					
						if (response3.equals("bottle"))
						{
							System.out.println("You must drink this whole bottle of wine to get to the key.. CHUG CHUG CHUG.. Now get yourself together and find your way to the Basement");
							System.out.println("Once you enter the enter the basement you find  a pile of bones and old lady. Would you like to speak to the old lady , sit on the rocking chair or dig through the pile of bones  ");
							String response5 =keyboard.next();
							if(response5.equals("Bones"))
							{
								System.out.println("You are dead");
							}
							else
								System.out.println("The old lady kills you");
						}
						else if (response3.equals("limejuice"))
						{
							System.out.println(" The bottom of the lime juice reads \" Find the map with and use this and the pair of three colour glasses to read the map\" ");
						}
					}
				}
				else if (response2.equals("lime juice"))
				{
					System.out.println(" The bottom of the lime juice reads \" Find the map to the basement. Would you like to go to the cabinates");
					String response3= keyboard.next();
					if (response3.equals("yes"))
					{
						System.out.println("You can either look around underneath, above or inside the cabinets. Which one would you like to pick");

						String response4= keyboard.next();
						if(response4.equals("underneath"))
						{
							System.out.println("Haha GOT YOU!. There is a hidden door to the basement.. Once you enter the enter the basement you find a rocking chair , a pile of bones and old lady. Would you like to speak to the old lady , sit on the rocking chair or dig through the pile of bones  ");
						}
						else if (response4.equals("inside"))
						{System.out.println("Its sad that you are not tall enough to look Above. There is a hidden door to the basement.. Once you enter the enter the basement you find a rocking chair , a pile of bones and old lady. Would you like to speak to the old lady , sit on the rocking chair or dig through the pile of bones ");

						}
						else if (response4.equals("above"))
						{
							System.out.println(" You see a dusty old map. It is written with invisible , the only way to read this map is to go back to the kitchen and use the Lime Juice ");
						}
						else 
							System.out.println("Invalid Request");


					}
				}
				else 
					System.out.println("Invalid Request");



			}
			else if(response1.equals("Cabinet"))
			{

				System.out.println("You can either look around underneath, above or inside the cabinets. Which one would you like to pick");

				String response2= keyboard.next();
				if(response2.equals("underneath"))
				{
					System.out.println("Haha GOT YOU!. There is a hidden door to the basement.. Once you enter the enter the basement you find a rocking chair , a pile of bones and old lady. Would you like to speak to the old lady , sit on the rocking chair or dig through the pile of bones  ");
				}
				else if (response2.equals("inside"))
				{System.out.println("Its sad that you are not tall enough to look Above. There is a hidden door to the basement.. Once you enter the enter the basement you find a rocking chair , a pile of bones and old lady. Would you like to speak to the old lady , sit on the rocking chair or dig through the pile of bones ");

				}
				else if (response2.equals("above"))
				{
					System.out.println(" You see a dusty old map. It is written with invisible , the only way to read this map is to go back to the kitchen and use the Lime Juice ");
				}
				else 
					System.out.println("Invalid Request");



			}
		}



		else 
			keyboard.close();

	}

}
