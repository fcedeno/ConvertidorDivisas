import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> rates;

    public CurrencyConverter(Map<String, Double> rates) {
        this.rates = rates;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!rates.containsKey(fromCurrency) || !rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code");
        }

        double fromRate = rates.get(fromCurrency);
        double toRate = rates.get(toCurrency);

        return (amount / fromRate) * toRate;
    }
}
