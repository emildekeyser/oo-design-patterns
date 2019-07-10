package domain;

import java.util.Observer;

public interface Converter {

	public void setDecimal(int decimal) throws DomainException;
	public String getResult();
	
	public void addObserver(Observer arg0);

}
