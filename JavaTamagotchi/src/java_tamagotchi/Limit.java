package java_tamagotchi;
import javax.swing.text.*;



public class Limit extends PlainDocument {

	private int limiteText;

	public Limit(int limiteTextField) {
		super();
		limiteText = limiteTextField;
		
	}
	


	public void insertString (int offset, String str, AttributeSet attr) throws BadLocationException {

		if ((getLength() + str.length()) <= limiteText) {
			super.insertString(offset, str, attr);
		}
	}
}
	
	
	
