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

	private Tray tray;
	private String typeCard;
	public int nb=0;
	public int i;
	public int j;
	/** TODO. */
	public Game(String name, int carac) {
		player = new Player(name);
		tray = new Tray(carac);

		//tray = new Tray();
	}

	/** TODO. */
	public void start() {



		//tray.numberCard(carac);


		Scanner sc = new Scanner(System.in);

		while (!tray.victory()) {
			//Afficher le tray
			tray.print();
			//Demarrer la partie
			System.out.println("return two cards.");





			int x = sc.nextInt();
			int y = sc.nextInt();

			tray.flip(x,y);
			tray.print();


			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			tray.flip(x2,y2);
			tray.print();

			// Comparer la carte 1 avec la carte 2;
			if (!tray.compare(x, y, x2, y2)) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) { }
				System.out.println("They are not the same ! Try it again.");
				tray.flip(x, y);
				tray.flip(x2, y2);
			}

		}
	}

}


