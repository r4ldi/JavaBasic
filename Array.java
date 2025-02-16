import javax.swing.*;

public class Array {
    public static void main(String[] args) {

        String[] nama;
        nama = new String[3];
        nama[0] = "Raden";
        nama[1] = "Raldi";
        nama[2] = "Nugraha";

        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        nama[0] = "Akew";

        System.out.println(nama[0]);

        String[] aku = new String[9];

        String[] namaNama = {
                "Raldi", "Ganteng","Sikma"
        };

        int[] angka = new int[] {
                1,2,23,32,2
        };

        long[] arrayLong = {
                10L,20L,30L
        };

        arrayLong[0] = 0;

        System.out.println(angka.length);

        String[][] Sikma = {
                {"Raden", "Raldi", "Nugraha"},
                {"Sikma", "Gutboy"},
                {"Meong", "Hahay"}
        };

        String[] Sikma1 = Sikma[0];
        System.out.println(Sikma1[0]);

        System.out.println(Sikma[1][0]);
        System.out.println(Sikma[2][1]);
        System.out.println(Sikma[0][0]);
    }
}
