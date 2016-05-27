/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
import java.util.Scanner;
public class Game {
	/** TODO. */
	private final Player player;
	private final Tray tray;
	private final Scanner sc;
	private int numberPair=0;
	/** TODO. */
	public Game(String name, int size, Scanner scanner) 
	{
		sc = scanner;
		player = new Player(name);
		tray = new Tray(size);
	}

	/** TODO. */
	public void start() 
	{

		while (!tray.victory()) 
		{
			//print the tray
			tray.print();
			//start the game
			System.out.println("return two cards.");
			System.out.print("X1: ");
			int x = sc.nextInt();
			System.out.print("Y1: ");
			int y = sc.nextInt();

			tray.flip(x,y);
			tray.print();


			System.out.print("X2: ");
			int x2 = sc.nextInt();
			System.out.print("Y2: ");
			int y2 = sc.nextInt();

			tray.flip(x2,y2);
			tray.print();

			// Compare the card 1 with the card 2;
			if (!tray.compare(x, y, x2, y2)) // if the cards are not the same
			{
				try 
				{
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) { }
				
				System.out.println("They are not the same ! Try it again.");
				tray.flip(x, y); // return the cards
				tray.flip(x2, y2);
			}
			else // if the cards are the same
			{
				this.numberPair++;
				System.out.println("You have "+this.numberPair+" pair");
			}

		}
		System.out.printf("Congratulation %s, you won !",player.getName());
	}
}



