package pt.tlopes.effective.java.chapter.chapter1;

public enum Item3Singleton {
    // implementation of a singleton
    INSTANCE;

    public static final String THIS_IS_SINGLETON = "this is singleton";

    public String something() {
        return THIS_IS_SINGLETON;
    }
}
