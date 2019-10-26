package pl.altkom.zad10_2;

public class TranslatorProvider {

    public static Translator createTranslator(Language language){
        if(language == Language.EN){
            return new EnglishTranslator();
        } else if(language == Language.GR){
            return new GermanTranslator();
        } else {
            return null;
        }

    }
}
