/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Card {
    /** TODO. */
    private final int     symbole;
    /** TODO. */
    public        String  back;
    /** TODO. */
    private       boolean showFace;

    /** TODO. */
    public Card(int symbole) {
        this.showFace = false;
        this.symbole = symbole;
    }

    /** TODO. */
    public void showCard() {
        if (showFace) {
            // afficher symbole
        }
        else {
            // ne pas afficher
        }
    }

    /** TODO. */
    public void updateShowFace() {
        this.showFace = !showFace;
    }
}
