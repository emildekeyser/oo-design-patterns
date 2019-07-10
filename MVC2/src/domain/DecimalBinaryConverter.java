package domain;

import java.util.Observable;

public class DecimalBinaryConverter extends Observable implements Converter {
	
	private String binary = "";
	
	@Override
	public void setDecimal(int decimal) throws DomainException{
		if(decimal < 0){
			// TODO how to communicate this exception to ConverterView  > displayErrorMessage?
			throw new DomainException("Only Positive decimals are supported");
		}
		convert(decimal);
		setChanged();
		notifyObservers();
	}

	@Override
	public String getResult() {
		return binary;
	}
	
	private void convert(int decimal) {
		binary = "";
		while(decimal != 0){
			int rest = decimal % 2;
			binary = rest+binary;
			decimal = (decimal - rest)/2;
		}	
	}
}
