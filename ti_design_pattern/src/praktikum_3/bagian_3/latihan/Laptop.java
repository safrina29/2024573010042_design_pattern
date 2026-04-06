package praktikum_3.bagian_3.latihan;

public class Laptop {
    private Processor processor;
    private RAM ram;

    public Laptop() {
        processor = new Processor();
        ram = new RAM();
    }

    void nyalakanLaptop() {
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop siap digunakan.");
    }
}
