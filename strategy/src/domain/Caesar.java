package domain;


public class Caesar extends Cipher 
{
	
	private char[] alfabet;
	
	public Caesar(char[] alfabet) 
	{
		this.alfabet = alfabet;
	}

	@Override
	public String encode(String plaintext) 
	{
		String encoded = "";
		char newChar;
		for(int i = 0; i < plaintext.length(); i++)
		{
			char oldChar = plaintext.charAt(i);
			int positionOldChar = getPositionChar(oldChar);
			if(positionOldChar >= 0) 
			{
				int positionNewChar = (positionOldChar + 3) % this.alfabet.length;
				newChar = this.alfabet[positionNewChar];
			}
			else 
			{
				newChar = oldChar;
			}
			encoded += newChar;
		}
		
		return encoded;
	}

	private int getPositionChar(char letter) 
	{
		
		int position = -1;
		for(int i = 0; i < this.alfabet.length; i++) 
		{
			if(this.alfabet[i] == letter) 
			{
				position = i;
			}
		}
		return position;
	}

}
