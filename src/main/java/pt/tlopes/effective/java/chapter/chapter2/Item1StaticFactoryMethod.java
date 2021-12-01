package pt.tlopes.effective.java.chapter.chapter2;

public class Item1StaticFactoryMethod {

    private final String aString;
    private final int anInt;

    private Item1StaticFactoryMethod(final String aString, final int anInt) {
        this.aString = aString;
        this.anInt = anInt;
    }

    // static factory method instead of constructor
    public static Item1StaticFactoryMethod of(final String aString, final int anInt) {
        return new Item1StaticFactoryMethod(aString, anInt);
    }

    public String getaString() {
        return aString;
    }

    public int getAnInt() {
        return anInt;
    }
}
