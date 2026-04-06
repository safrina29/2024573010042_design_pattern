package praktikum_2.latihan.latihan_3;

public class Main {public static void main(String[] args) {
    AkunBank tabungan = new AkunBank(500000);

    // Memanggil method public (Berhasil)
    tabungan.tampilkanSaldo();

    // 2. Mencoba akses atribut saldo langsung (Eror)
    // System.out.println(tabungan.saldo);
}
}
