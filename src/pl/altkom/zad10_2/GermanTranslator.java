package pl.altkom.zad10_2;

import java.util.HashMap;
import java.util.Map;

public class GermanTranslator implements Translator {
    Map<String, String> dictionary;

    public GermanTranslator() {
        dictionary = new HashMap<>();

        dictionary.put("głowa", "Kopf");
        dictionary.put("piłka", "Ball");
    }

    @Override
    public String translate(String a) {
        return dictionary.get(a);
    }
}
