import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class ExchangeRateService {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/b0873e3439c19ca019dd1a15/latest/USD";

    public Map<String, Double> getRates() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);
        JsonObject ratesObject = jsonObject.getAsJsonObject("conversion_rates");

        return new Gson().fromJson(ratesObject, Map.class);
    }
}
