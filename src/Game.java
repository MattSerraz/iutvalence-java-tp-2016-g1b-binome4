/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
import java.util.Scanner;
public class Game {
    /** TODO. */
    private int    turn;
    /** TODO. */
    private final Player player;

    private final Tray tray;
    private String typeCard;
    /** TODO. */
    public Game() {
        player = new Player("Toto");
        tray = new Tray();
    }

    /** TODO. */
    public void start() {
        System.out.println("Welcome Toto");
        System.out.println("Chose the type of cards : \n 1 : number \n 2 : color");
       // Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 or 2 :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char carac = str.charAt(0);                
        
        if (carac=='1')
        {
        	this.typeCard="number";
        	System.out.println("You have choose : " + typeCard);
        	System.out.println("Choose the number of cards between 4, 6 and 8");
        	

            str = sc.nextLine();

            carac = str.charAt(0);
            System.out.println("You have choose to play with "+carac+" cards");
            
        }
        
        if (carac=='2')
        {
        	this.typeCard="color";
        	System.out.println("You have choose : " + typeCard);
        }
        
        
        // Afficher le tray
        //tray.print();
        // Demarrer la partie
        //System.out.println("return two cards. Press 1, 2, 3 or 4");
        
        
    }
    
    
}