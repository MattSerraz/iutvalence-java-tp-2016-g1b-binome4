/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
public class Tray {
	/** TODO. */
	public final  Card[][] cards;
	/** TODO. */
	private final int      width;
	/** TODO. */
	private final int      height;

	private int 	pendingCards;

	//public int nb=1;

	/** TODO. */
	public Tray(int carac) {	
		List<Integer> list = new ArrayList<Integer>();
		pendingCards = carac;
		int max = carac/2; // maximum number of the cards
		
		if (carac==4)
		{
			this.height = 2;
			this.width = 2;
		}
		else if (carac==6)
		{
			this.height = 3;
			this.width = 2;
		}
		else if (carac==8)
		{
			this.height = 4;
			this.width = 2;
		}
		else if (carac==12)
		{
			this.height = 4;
			this.width = 3;
		}
		else {
			this.height = 2;
			this.width = 2;
		}
		
		for(int i = 1; i <= max; i++) { //add the cards number in the list
			list.add(i);
			list.add(i);
		}

		// Create the cards with the number in the list
		Random random = new Random();
		cards = new Card[this.width][this.height];
		for (int i = 0; i < this.width; i++) 
		{
			for (int j = 0; j < this.height; j++)
			{
				int index = random.nextInt(list.size());
				int card = list.remove(index);
				cards[i][j] = new Card(card);
			}
		}

	}


	/** TODO. */
	// Print the tray
	public void print() {
		for (int i = 0; i < this.width; i++) 
		{
			for (int j = 0; j < this.height; j++) 
			{
				System.out.print(cards[i][j]);
			}
			System.out.println();
		}
	}

	// return the card
	public void flip(int x, int y) 
	{
		cards[x][y].flip();
	}

	// Compare two cards
	public boolean compare(int x, int y, int x2, int y2) 
	{
		boolean ok = cards[x][y].toString().equals(cards[x2][y2].toString());
		if (ok) {
			pendingCards-=2;
		}
		
		return ok;
	}

	// All the cards are return
	public boolean victory() 
	{
		return this.pendingCards == 0;
	}
}
