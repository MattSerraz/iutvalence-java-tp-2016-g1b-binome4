/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Tray {
    /** TODO. */
    public final  Card[][] cards;
    /** TODO. */
    private final int      width;
    /** TODO. */
    private final int      height;
    private int Max;
    private int count=0;
    private int nb;

    //public int nb=1;
    
    /** TODO. */
    public Tray(int carac) {
    	if (carac==4)
    	{
    		this.height = 2;
    		this.width = 2;
    	}
    	if (carac==6)
    	{
    		this.height = 3;
    		this.width = 2;
    	}
    	if (carac==8)
    	{
    		this.height = 4;
    		this.width = 2;
    	}
    	if (carac==12)
    	{
    		this.height = 4;
    		this.width = 3;
    	}
    	
        cards = new Card[this.width][HEIGHT];
        
        // Générer une liste de nombres.
        for (int i = 0; i < Tray.WIDTH; i++) 
        {
            for (int j = 0; j < Tray.HEIGHT; j++)
            {
				cards[i][j] = new Card(nb);
			}
        }
        
    }
    

    
    /** TODO. */
    public void print() {
        for (int i = 0; i < Tray.WIDTH; i++) 
        {
            for (int j = 0; j < Tray.HEIGHT; j++) 
            {
                System.out.print(cards[i][j]);
            }
            System.out.println();
        }
    }

	public void flip(int x, int y) {
		cards[y][x].flip();
	}
	
	public boolean compare(int x, int y, int x2, int y2) {
		return cards[y][x].toString().equals(cards[y2][x2].toString());
	}
}
