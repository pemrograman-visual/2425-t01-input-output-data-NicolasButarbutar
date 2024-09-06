// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHAEAN
import java.util.*;
import java.lang.Math;

public class  T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String judul;

        judul = input.nextLine();
        String penulis;

        penulis = input.nextLine();
        int tahun;

        tahun = Integer.parseInt(input.nextLine());
        String penerbit;

        penerbit = input.nextLine();
        String format;

        format = input.nextLine();
        double harga;

        harga = Double.parseDouble(input.nextLine());
        double margin;

        margin = Double.parseDouble(input.nextLine());
        int stok;

        stok = Integer.parseInt(input.nextLine());
        double rating;

        rating = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating);
    }
}
