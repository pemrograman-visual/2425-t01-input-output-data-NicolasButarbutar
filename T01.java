// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHAEAN

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahun;

        tahun = input.nextInt();
        String penerbit;

        penerbit = input.nextLine();
        String format;

        format = input.nextLine();
        double harga;

        harga = input.nextDouble();
        double margin;

        margin = input.nextDouble();
        int stok;

        stok = input.nextInt();
        double rating;

        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
