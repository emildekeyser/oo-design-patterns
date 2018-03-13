package domain;


import javax.swing.JOptionPane;

public class CipherUI 
{
	private Codec factory;

	public CipherUI()
	{
		this.factory = new Codec();
	}
	
	public void encoding_dialog()
	{
		String[] choices = this.factory.get_ciphers();

		int encodingChoice = JOptionPane.showOptionDialog(null, "Which cipher would you like to use?", "Cipher",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, null);
		String plaintext = JOptionPane.showInputDialog("Text to encode: ");
		
		String encoded = this.factory.encode(choices[encodingChoice], plaintext);
		JOptionPane.showMessageDialog(null, encoded);
	}
	
}
