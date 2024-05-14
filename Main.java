import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String BASE_CURRENCY = "USD";
    private static final String[] TARGET_CURRENCIES = {"BRL", "COP", "DOP"};

    public static void main(String[] args) {
        try {
            ExchangeRateService rateService = new ExchangeRateService();
            Map<String, Double> rates = rateService.getRates();
            CurrencyConverter converter = new CurrencyConverter(rates);
            Scanner scanner = new Scanner(System.in);

            boolean continueRunning = true;

            while (continueRunning) {
                System.out.println("Seleccione la dirección de la conversión:");
                System.out.println("1. USD a otra moneda");
                System.out.println("2. Otra moneda a USD");
                System.out.println("3. Salir");
                System.out.print("Opción: ");
                int directionOption = scanner.nextInt();

                if (directionOption == 3) {
                    continueRunning = false;
                    System.out.println("Saliendo del programa...");
                    break;
                }

                if (directionOption < 1 || directionOption > 2) {
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    continue;
                }

                System.out.println("Seleccione la moneda:");
                System.out.println("1. Real brasileño (BRL)");
                System.out.println("2. Peso colombiano (COP)");
                System.out.println("3. Peso dominicano (DOP)");
                System.out.print("Opción: ");
                int currencyOption = scanner.nextInt();

                if (currencyOption < 1 || currencyOption > 3) {
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    continue;
                }

                String targetCurrency = TARGET_CURRENCIES[currencyOption - 1];
                double amount, result;

                if (directionOption == 1) {
                    System.out.print("Ingrese la cantidad en USD: ");
                    amount = scanner.nextDouble();
                    result = converter.convert(BASE_CURRENCY, targetCurrency, amount);
                    System.out.printf("%.2f USD es igual a %.2f %s\n", amount, result, targetCurrency);
                } else {
                    System.out.printf("Ingrese la cantidad en %s: ", targetCurrency);
                    amount = scanner.nextDouble();
                    result = converter.convert(targetCurrency, BASE_CURRENCY, amount);
                    System.out.printf("%.2f %s es igual a %.2f USD\n", amount, targetCurrency, result);
                }

                System.out.print("¿Desea realizar otra conversión? (s/n): ");
                char continueOption = scanner.next().toLowerCase().charAt(0);
                if (continueOption != 's') {
                    continueRunning = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
