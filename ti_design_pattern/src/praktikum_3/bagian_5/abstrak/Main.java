package praktikum_3.bagian_5.abstrak;

public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Kucing();
        Kucing.nama = "Kitty";
        Kucing.makan(); //method konkret dari abs class
        Kucing.bersuara(); //met abs yg di override

        Hewan Anjing = new Anjing();
        Anjing.nama = "Doggy";
        Anjing.makan(); //method konkret dari abs class
        Anjing.bersuara(); //met abs yg di override
    }
}
