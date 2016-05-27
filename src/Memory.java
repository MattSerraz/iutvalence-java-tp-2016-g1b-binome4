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
    public static void main(final String... args) 
    {
    	System.out.println("please, enter your name");
	    Scanner sc1 = new Scanner (System.in);
	    String name = sc1.nextLine();
    	System.out.println("welcome "+name);
    	System.out.println("Choose the number of cards between 4, 6, 8 and 12");
	    int carac = sc1.nextInt();	    
	    System.out.println("You have choose to play with "+carac+" cards");
    	Game game = new Game(name, carac,sc1);
        game.start();
        sc1.close();
    }
}
