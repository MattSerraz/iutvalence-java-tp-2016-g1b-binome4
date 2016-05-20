import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Memory {
    /**
     * TODO.
     *
     * @param args TODO
     */
    public static void main(final String... args) {
		System.out.println("Welcome Toto");

    	System.out.println("Choose the number of cards between 4, 6, 8 and 12");
	    Scanner sc = new Scanner(System.in);               
	    int carac = sc.nextInt();	    
	    System.out.println("You have choose to play with "+carac+" cards");

    	Game game = new Game("Toto", carac);
        game.start();
    }
}
