package praktikum_3.bagian_4.overriding.latihan;

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
