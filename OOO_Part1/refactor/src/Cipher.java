

import javax.swing.JOptionPane;

public class Cipher {
	public static int cipherChoice;
	public static char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void main(String[] args) {
		String[] choices = getCiphers();

		int encodingChoice = JOptionPane.showOptionDialog(null, "Which cipher would you like to use?", "Cipher",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, null);
		cipherChoice = encodingChoice;

		String plainText = JOptionPane.showInputDialog("Text to encode: ");
		JOptionPane.showMessageDialog(null, encode(plainText));

	}

	public static String[] getCiphers() {
		String[] ciphers = {"Caesar", "Mirroring"};
		return ciphers;
	}

	public static String encode(String plainText) {
		String encoded;
		if(cipherChoice == 1) {
			char[] oneWay = plainText.toCharArray();
			int length = oneWay.length;
			char[] otherWay = new char[length];
			for(int i = 0, j = length - 1; j >= 0; i++, j--){
				otherWay[j] = oneWay[i];
			}
			encoded = new String(otherWay);
		} else {
			encoded = "";
			
			char newChar;
			for(int i = 0; i < plainText.length(); i++){
				char oldChar = plainText.charAt(i);
				int positionOldChar = getPositionChar(oldChar);
				if(positionOldChar >= 0) {
					int positionNewChar = (positionOldChar + 3) % 26;
					newChar = chars[positionNewChar];
				} else {
					newChar = oldChar;
				}
				encoded += newChar;
			}
		}
		return encoded;
	}

	private static int getPositionChar(char letter) {
		int position = -1;
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] == letter) {
				position = i;
			}
		}
		return position;
	}
}
