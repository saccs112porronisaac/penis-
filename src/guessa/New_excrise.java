package guessa;
import java.util.Scanner;

public class New_excrise  {

	public static void main(String[] args) {
		{
		Scanner input = new Scanner(System.in);
			int player1;
			int computerMaster; 
			
			player1 = 0;
			computerMaster = 0 +(int)(Math.random()*10);
			
			for (int round = 0 ;round < 5;round++)
		
			{System.out.println("Please enter a number between 1-10");
			
			player1=input.nextInt();
			
			
			System.out.printf("Random number of computermaster is %d\n",computerMaster);
			System.out.printf("Random number of player1 is %d\n",player1 );
			
			
			if (player1 > computerMaster )
			{
				System.out.printf("Your number was too big ");
			}
			
			else if ( player1 < computerMaster ){
				
	
			System.out.printf("Your number was too small  ");
				}
			else 
		
			{
			System.out.printf("your number match ");
				
			}
		
			}
	
	System.out.println ("Thank You for Playing");
	
			}	
	}

	}
