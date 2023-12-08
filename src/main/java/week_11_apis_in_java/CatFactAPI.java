package week_11_apis_in_java;

import kong.unirest.Unirest;

public class CatFactAPI {
    public static void main(String[] args) {
        String url = "https://catfact.ninja/fact";
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
        String fact = catFact.fact;
        System.out.println("Random cat fact:\n" + fact);
        int factLength = catFact.length;
        System.out.println("Length of fact: " + factLength);
    }
}

class CatFact {
    public String fact;
    public int length;
}