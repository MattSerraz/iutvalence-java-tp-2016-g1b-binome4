/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Game {
    /** TODO. */
    private int    turn;
    /** TODO. */
    private final Player player;

    private final Tray tray;
    /** TODO. */
    public Game() {
        player = new Player("Toto");
        tray = new Tray();
    }

    /** TODO. */
    public void start() {
        System.out.println("Welcome Toto");
        // Afficher le tray
        tray.print();
        // Demarrer la partie
        System.out.println("return two cards. Press 1, 2, 3 or 4");
        
        
    }
}