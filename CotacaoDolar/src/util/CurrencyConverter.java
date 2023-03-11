package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double quotation, double dollarAmount) {
		return quotation * dollarAmount * (1.0 + IOF);
	}
}
