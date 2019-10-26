package pl.altkom.zad10_2;

enum Language {
    EN, GR;
}

public class Client {
    public static void main(String[] args) {
        Translator t =
                TranslatorProvider
                        .createTranslator(Language.EN);

        System.out.println(t.translate("piłka"));
        System.out.println(t.translate("głowa"));
    }
}
