/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Card {
	
	private boolean showFace;
	
	public String back;
	
	private final int symbole;
	
	public Card(int symbole) 
	{
		this.showFace = false;
		this.symbole = symbole;
	}
	
	public void showCard()
	{
		if (showFace)
		{
			// afficher symbole
		}
		else
		{
			// ne pas afficher
		}
	}
	
	public void updateShowFace()
	{
		if (showFace)
		{
			this.showFace = false;
		}
		else
		{
			this.showFace = true;
		}
	}
	
	
}
