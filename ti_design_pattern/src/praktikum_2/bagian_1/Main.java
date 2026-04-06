package praktikum_2.bagian_1;

public class Main {
    public static void main(String[] args) {
        //membuat objek dari class mahasiswa
        Mahasiswa mhs1=new Mahasiswa();

        //mengisi nilai atribut
        mhs1.nama = "Budi";
        mhs1.umur = 20;

        //menampilkan nilai atribut
        System.out.println("Nama: "+mhs1.nama);
        System.out.println("Umur: "+mhs1.umur);
    }
}
