package pl.altkom.zad10_2;

public class GermanTranslatorFactory implements TranslatorFactory {
    @Override
    public Translator createTranslator() {
        return new TranslatorProvider.GermanTranslator();
    }
}
