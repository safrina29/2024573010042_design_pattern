package praktikum_2.bagian_6;

public class Buku {
    //attribbut(private)
    private String judul;
    private String pengarang;
    private String tahunTerbit;

    //contructor(default)
    public Buku(){
        this.judul = "unknown";
        this.pengarang = "unknown";
        this.tahunTerbit =  0;
    }

    //setter dan getter
    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getJudul(){
        return.judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public String getPengarang(){
        return pengarang;
    }
    public void setTahunTerbit(String tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    public String getTahunTerbit(){
        return tahunTerbit;
    }

    //Method utk menampilkan informasi buku
    public void tampilkanInfo(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("----------------------------");
    }
}
