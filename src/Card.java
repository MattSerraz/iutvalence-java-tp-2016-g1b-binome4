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
        this.showFace = true;
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
    public void flip() {
        if (this.showFace)
        {
        	this.showFace=false;
        }
        else 
        {
        	this.showFace=true;
        }
    }
}
