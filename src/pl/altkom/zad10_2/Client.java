package pl.altkom.zad10_2;

enum Language {
    EN, GR;
}

public class Client {
    public static void main(String[] args) {
        TranslatorFactory factory = null;
        Language l = Language.EN;

        if (l == Language.EN) {
            factory = new EnglishTranslatorFactory();
        } else {
            factory = new GermanTranslatorFactory();
        }

        System.out.println(factory.createTranslator().translate("piłka"));
        System.out.println(factory.createTranslator().translate("głowa"));

    }
}
