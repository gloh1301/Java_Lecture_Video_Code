package week_11_apis_in_java;

import kong.unirest.Unirest;
import java.util.Map;

import static input.InputUtils.doubleInput;

public class ExchangeRateConverter {
    public static void main(String[] args) {
        String url = "https://1150-exchange-rates.azurewebsites.net/latest";
        Map<String, Object> queryParameters = Map.of("base", "USD", "symbols", "EUR");
        RateResponse response = Unirest.get(url)
                .queryString(queryParameters)
                .asObject(RateResponse.class)
                .getBody();

        double rate = response.rates.EUR;
        double amountOfDollars = doubleInput("How many US Dollars to convert to Euros?");
        double dollarsToEuros = amountOfDollars * rate;
        System.out.println("On " + response.date + " the exchange rate for USD to EUR is " + rate);
        System.out.println("$" + amountOfDollars + " is equivalent to " + dollarsToEuros + " Euros");
    }
}

class RateResponse {
    public String base;
    public String date;
    public Rates rates;
}

class Rates {
    public double EUR;
}