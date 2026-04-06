package praktikum_2.bagian_5;

public class Person {
    private String nama;
    private int umur;

    //default constructtor
    public Person(){
        nama = "Unknow";
        umur = 0;
    }
    //parameterized consructor
    public Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //method
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
