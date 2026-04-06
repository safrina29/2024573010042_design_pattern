package praktikum_3.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {

        Motor m1 = new Motor();
        m1.setMerk("Honda");
        m1.setTahun(2022);

        System.out.println("Merk: " + m1.getMerk());
        System.out.println("Tahun: " + m1.getTahun());

    }
}
