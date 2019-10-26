package pl.altkom.zad10_2;

import java.util.HashMap;
import java.util.Map;

public class EnglishTranslator implements Translator {

    Map<String, String> dictionary;

    public EnglishTranslator(){
        dictionary = new HashMap<>();

        dictionary.put("głowa", "head");
        dictionary.put("piłka", "ball");
    }
    @Override
    public String translate(String word) {
        return dictionary.get(word);
    }
}
