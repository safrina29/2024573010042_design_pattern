package praktikum_2.latihan.latihan_2;

public class Main {
    public static void main(String[] args) {
        // 3. Membuat object dari class Lingkaran
        Lingkaran bundar = new Lingkaran();

        // Mengisi nilai atribut jariJari
        bundar.jariJari = 7;

        // Memanggil method hitungLuas() dan menampilkan hasilnya
        System.out.println("Jari-jari lingkaran: " + bundar.jariJari);
        System.out.printf("Hasil Luas Lingkaran: %.2f\n", bundar.hitungLuas());
    }
}
