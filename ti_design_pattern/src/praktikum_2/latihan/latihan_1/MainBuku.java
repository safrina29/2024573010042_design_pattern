package praktikum_2.latihan.latihan_1;

public class MainBuku {
    public static void main(String[] args) {
        // 2. Membuat object dari class Buku
        Buku buku1 = new Buku();

        // Mengisi nilai atribut
        buku1.judul = "Laskar Pelangi";
        buku1.pengarang = "Andrea Hirata";

        // 3. Menampilkan nilai atribut
        System.out.println("--- Informasi Buku ---");
        System.out.println("Judul     : " + buku1.judul);
        System.out.println("Pengarang : " + buku1.pengarang);
    }
}
