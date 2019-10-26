package pl.altkom.zad10_2;

public class EnglishTranslatorFactory implements TranslatorFactory{

    @Override
    public Translator createTranslator() {
        return new TranslatorProvider.EnglishTranslator();
    }
}
