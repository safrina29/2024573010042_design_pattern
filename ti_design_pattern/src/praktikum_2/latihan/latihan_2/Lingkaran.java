package praktikum_2.latihan.latihan_2;

public class Lingkaran {
    // 1. Atribut
    double jariJari;

    // 2. Method untuk mengembalikan nilai luas
    double hitungLuas() {
        // Menggunakan Math.PI untuk nilai pi yang lebih presisi
        return Math.PI * jariJari * jariJari;
    }
}
