/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Tray {



	public static final int WIDTH = 2;

	public static final int HEIGHT = 2;

	private int width;

	private int height;

	public Card[][] cards;


	public Tray() 
	{
		width = this.WIDTH;
		height = this.HEIGHT;
		//cards = new Card[1][1];
		//cards = new Card[1][2];
		//cards = new Card[2][1];
		//cards = new Card[2][2];

		// TODO Remplir cards
		cards = new Card[WIDTH][HEIGHT];
		for(int i=0;i<Tray.WIDTH;i++)
		{
			for(int j=0;j<Tray.HEIGHT;j++)
			{
				cards[i][j] = new Card(i);
			}
		}
	}

	public void print() 
	{
		for(int i=0;i<Tray.WIDTH;i++)
		{
			for(int j=0;j<Tray.HEIGHT;j++)
			{
				System.out.println(cards[i][j]);
			}
		}
	}
}
