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
    public String cardFace;
    /** TODO. */
    private boolean showFace;

    /** TODO. */
    public Card(int symbole) {
        this.showFace = false;
        this.symbole = symbole;
        this.cardFace = "[X]";
    }

    /** TODO. */  
    @Override
    public String toString()
    {
    		if (this.showFace) {
    			return "[" + this.symbole + "]";
    		}
    		else {
    			return cardFace;
    		}
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
