package util;

public class ConversionCurrency {
	
	public static String convertCurrency (double qtd, double bought) {
		
		return String.format("%.2f", (qtd * bought * 1.06));
		
	}

}
