/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Game {
    /** TODO. */
    private int turn;
	private Player player;
    
    public void Game()
    {
    	Player player = new Player("Toto");
    	Tray tray = new Tray();
    }
    
    public void start() {
    	System.out.println("Welcome Toto");
    	// Afficher le tray

    	Tray.print();
    	// Démarrer la partie
    }

}
