/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Card {
    /** TODO. */
    private final int symbole;
    /** TODO. */
    public String back;
    /** TODO. */
    private boolean showFace;

    /** TODO. */
    public Card(String backFace, int symbole) {
        this.showFace = false;
        this.symbole = symbole;
        this.back = backFace;
    }

    /** TODO. */
    public String toString() {
        if (showFace) 
        {
            System.out.println(symbole);
        }
        else 
        {
            System.out.println(back);
        }
		return back;
    }

    /** TODO. */
    public void updateShowFace() {
        if (showFace)
        {
        	showFace=false;
        }
        else
        {
        	showFace=true;
        }
    }
}
