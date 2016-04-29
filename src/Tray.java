/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Tray {
    /** TODO. */
    public static final int WIDTH = 2;
    /** TODO. */
    public static final int HEIGHT = 2;
    /** TODO. */
    private final  Card[][] cards;
    /** TODO. */
    private final int      width;
    /** TODO. */
    private final int      height;

    /** TODO. */
    public Tray() {
        width = this.WIDTH;
        height = this.HEIGHT;

        cards = new Card[WIDTH][HEIGHT];
        for (int i = 0; i < Tray.WIDTH; i++) 
        {
            for (int j = 0; j < Tray.HEIGHT; j++)
            {
				cards[i][j] = new Card(i);
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
}
