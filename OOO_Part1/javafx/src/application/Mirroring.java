package application;

public class Mirroring extends Cipher 
{	
	@Override
	public String encode(String plaintext) 
	{
		String encoded = "";
		char[] oneWay = plaintext.toCharArray();
		int length = oneWay.length;
		char[] otherWay = new char[length];
		for(int i = 0, j = length - 1; j >= 0; i++, j--)
		{
			otherWay[j] = oneWay[i];
		}
		encoded = new String(otherWay);
		return encoded;
	}

}
