package streamTest;

import java.util.HashMap;

public class MainSearchValues {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Search for country
        String questionCapital = "Oslo";
        String answer = searchCountry(capitalCities, questionCapital);

        if (answer != null) {
            System.out.println(answer + " has capital " + questionCapital);
        }
        else {
            System.out.println("No country found for capital " + questionCapital);
        }

        // Search for capital
        String questionCountry = "Norway";
        answer = searchCapital(capitalCities, questionCountry);

        if (answer != null) {
            System.out.println(answer + " is the capital of " + questionCountry);
        }
        else {
            System.out.println("No capital found for country " + questionCountry);
        }

        // System.out.println(capitalCities);
    }

    private static String searchCountry(HashMap<String, String> capitalCites, String nameOfTown) {

        return capitalCites.entrySet()
                .stream()
                .filter(e -> e.getValue().equalsIgnoreCase(nameOfTown))
                .findFirst()
                .map(HashMap.Entry::getKey)
                .orElse(null);
    }

    private static String searchCapital(HashMap<String, String> capitalCites, String nameOfCountry) {

        return capitalCites.entrySet()
                .stream()
                .filter(e -> e.getKey().equalsIgnoreCase(nameOfCountry))
                .findFirst()
                .map(HashMap.Entry::getValue)
                .orElse(null);
    }
}
