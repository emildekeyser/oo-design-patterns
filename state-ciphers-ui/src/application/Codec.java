package application;

import java.util.HashMap;
import java.util.Set;

public class Codec 
{
	private HashMap<String, Cipher> ciphers_map;
	
	public Codec()
	{
		char[] simple_alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		this.ciphers_map = new HashMap<String, Cipher>();
		
		ciphers_map.put("Caesar", new Caesar(simple_alfabet));
		ciphers_map.put("Mirroring", new Mirroring());
	}
	
	public Set<String> get_ciphers()
	{
		return this.ciphers_map.keySet();
	}
	
	public String encode(String cipher, String plaintext)
	{
		return ciphers_map.get(cipher).encode(plaintext);
	}
}
