public class KonversiNumber {
    public static void main(String[] args) {

        byte iniByte = 100;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFLoat2 = (float) iniDouble;
        long iniLong2 = (long) iniFLoat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

    }
}
