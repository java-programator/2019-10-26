package pl.altkom.zad10_2;

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
}
