package praktikum_3.bagian_5.abstrak;

abstract class Hewan {
    //atribut
    String nama;

    //method konkret
    void makan(){
        System.out.println(nama + "sedang makan.");
    }
    //method abstrak
    abstract void bersuara();
}
