package praktikum_2.latihan.latihan_3;

public class AkunBank {
    // 1. Atribut private (hanya bisa diakses di dalam class ini)
    private double saldo;

    // Constructor untuk mengisi saldo awal
    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method public untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp" + saldo);
    }
}
