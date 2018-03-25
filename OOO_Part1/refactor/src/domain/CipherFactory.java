package domain;

import java.util.HashMap;

public class CipherFactory 
{
	private HashMap<String, Cipher> ciphers_map;
	
	public CipherFactory()
	{
		char[] simple_alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		this.ciphers_map = new HashMap<String, Cipher>();
		
		ciphers_map.put("Caesar", new Caesar(simple_alfabet));
		ciphers_map.put("Mirroring", new Mirroring());
	}
	
	public String[] get_ciphers()
	{
		return (String[]) this.ciphers_map.keySet().toArray();
	}
	
	public String encode(String cipher, String plaintext)
	{
		if (this.ciphers_map.containsKey(cipher))
		{
			return ciphers_map.get(cipher).encode(plaintext);
		}
		else 
		{
			throw new IllegalArgumentException();
		}
	}
}
