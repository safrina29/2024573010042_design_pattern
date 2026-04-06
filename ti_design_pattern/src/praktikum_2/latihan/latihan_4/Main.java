package praktikum_2.latihan.latihan_4;

public class Main {public static void main(String[] args) {
    // 3. Membuat object dari class Mahasiswa
    Mahasiswa mhs = new Mahasiswa();

    // Mengisi nilai atribut menggunakan setter
    mhs.setNama("Budi Santoso");
    mhs.setNim("A11.2023.12345");

    // Menampilkan nilai menggunakan getter
    System.out.println("--- Data Mahasiswa ---");
    System.out.println("Nama : " + mhs.getNama());
    System.out.println("NIM  : " + mhs.getNim());
}
}
