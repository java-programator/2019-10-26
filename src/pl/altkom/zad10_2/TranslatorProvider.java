package pl.altkom.zad10_2;

import java.util.HashMap;
import java.util.Map;

public class TranslatorProvider {

    public static Translator createTranslator(Language en) {
        if (en == Language.EN) {
            return new EnglishTranslator();
        } else if (en == Language.GR) {
            return new GermanTranslator();
        } else {
            return null;
        }
    }

    public static class EnglishTranslator implements Translator {
        private static Map<String, String> dictionary;

        static {
            dictionary = new HashMap<>();

            dictionary.put("głowa", "head");
            dictionary.put("piłka", "ball");
        }

        public EnglishTranslator() {

        }

        @Override
        public String translate(String a) {
            return dictionary.get(a);
        }
    }

    public static class GermanTranslator implements Translator {
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
}
