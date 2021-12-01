package pt.tlopes.effective.java.chapter.chapter3;

public class Item12OverrideToString {


    private final short areaCode;
    private final short prefix;
    private final short lineNum;

    public Item12OverrideToString(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    /**
     * Failing to override the toString() will result in the class name followed by an “at” sign (@)
     * and the unsigned hexadecimal representation of the hash code, example: Item12OverrideToString@13ud2983d
     */
    @Override
    public String toString() {
        return "Item12OverrideToString{" +
            "areaCode=" + areaCode +
            ", prefix=" + prefix +
            ", lineNum=" + lineNum +
            '}';
    }
}
