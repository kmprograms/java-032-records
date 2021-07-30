package com.app;

/*
    W każdej chwili możesz rozbudować rekord o Twoje dodatkowe metody
*/
public record Message(String title, String text) {

    // Dodatkowa implementacja pozwalająca walidować przekazane do automatycznie
    // generowanego konstruktora parametry.
    public Message {
        if (title == null) {
            throw new IllegalArgumentException("Tittle of message is null");
        }
        if (text == null) {
            throw new IllegalArgumentException("Text of message is null");
        }
    }

    // Możliwość implementowania własnych wersji konstruktora
    public Message(String title) {
        this(title, "DEFAULT TEXT");
        // this(title, null); // WYJATEK
    }

    // Możliwość implementowania metod składowych niestatycznych
    public boolean isTitleLongerThanText() {
        return title.length() > text.length();
    }

    // Możliwość implementowania metod skladowych statycznych
    public static Message empty() {
        return new Message("", "");
    }

    public final static String EXTRA_MESSAGE_TITLE = "EXTRA MESSAGE!";
}
