package praktikum_3.bagian_4.overriding;

public class Main {
    public static void main (String[] args) {
        Hewan hewan1 = new Kucing(); //pilymorphism
        Hewan hewan2 = new Anjing();
        //output
        hewan1.bersuara();
        hewan2.bersuara();
    }
}
