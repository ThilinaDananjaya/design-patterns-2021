package com.company.singleton;

public class Main {

    public static void main(String[] args) {

        ClipBoard clipBoard1 = ClipBoard.getInstance();
        ClipBoard clipBoard2 = ClipBoard.getInstance();

        clipBoard1.copy("abc");
        clipBoard1.paste(); //abc

        clipBoard1.paste();

        clipBoard2.copy("xyz");
        clipBoard1.paste();
        clipBoard2.paste();
        clipBoard1.copy("pqr");
        clipBoard2.paste();

    }
}
