package introducaoPOO.ExcFix4.utils;

public class CurrencyConverter {
    public static final double percentage = 0.06;
    public static double dollarPrice;
    public static double dollarSeller;

    

    public static double calcAmount() {
        double total = CurrencyConverter.dollarPrice * CurrencyConverter.dollarSeller;

        return total * CurrencyConverter.percentage + total;
    }
}
