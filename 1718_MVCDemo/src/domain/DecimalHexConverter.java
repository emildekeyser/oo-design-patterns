package domain;

import java.util.Observable;

public class DecimalHexConverter extends Observable implements Converter {
	
	private String hexadecimal = "";
	

	@Override
	public void setDecimal(int decimal) throws DomainException {
		if(decimal < 0){
			throw new DomainException("Only Positive decimals are supported");
		}
		convert(decimal);		
		setChanged();
		notifyObservers();
	}

	@Override
	public String getResult() {
		return hexadecimal;
	}
	
	private void convert(int decimal) {
		hexadecimal = Integer.toHexString(decimal);
	}

}
