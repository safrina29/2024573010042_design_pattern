# Laporan Modul 1: Review Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Design Pattern
**Nama:** [Safirina]  
**NIM:** [2024573010042]  
**Kelas:** [TI 2A]

---

## Abstrak
Laporan ini membahas pengenalan dasar tentang pemrograman berorientasi objek (OOP) dan alasan penggunaan bahasa Java. Dijelaskan juga kelebihan Java, komponen penting yang diperlukan seperti JDK, JRE, dan IDE, serta gambaran umum tentang persiapan praktikum. Selain itu, laporan menyinggung troubleshooting umum yang mungkin terjadi dan pedoman penulisan laporan praktikum.

1. Mendokumentasikan hasil pembelajaran awal tentang OOP dan Java.
2. Menunjukkan pemahaman teori serta ekosistem Java.
3. Membuktikan kesiapan menggunakan tools yang diperlukan.
4. Menjadi bukti keberhasilan menjalankan program sederhana.
5. Melatih penyusunan laporan dengan format ilmiah dan terstruktur.

---

## 1. Pendahuluan
- Java dipilih sebagai bahasa pemrograman karena memiliki banyak keunggulan. Salah satunya adalah platform independence dengan konsep “write once, run anywhere” yang memungkinkan program dijalankan di berbagai sistem operasi tanpa perubahan kode. Selain itu, Java merupakan strongly typed language dengan sistem pemeriksaan tipe yang ketat sehingga meminimalkan error saat runtime. Java juga dilengkapi rich library yang menyediakan berbagai pustaka siap pakai, mulai dari manipulasi string, networking, hingga koneksi database. Dukungan dari komunitas besar memudahkan pembelajaran dan pemecahan masalah, sementara statusnya sebagai industry standard menjadikan penguasaan Java sangat penting dalam dunia kerja.

Untuk mendukung pengembangan, diperlukan beberapa tools utama dalam ekosistem Java, yaitu:

JDK (Java Development Kit) → paket lengkap berisi compiler, library, dokumentasi, dan debugging utilities untuk menulis serta mengompilasi kode Java.

JRE (Java Runtime Environment) → lingkungan runtime berisi JVM dan core libraries, digunakan untuk menjalankan aplikasi Java yang sudah dikompilasi.

JVM (Java Virtual Machine) → inti dari platform Java yang mengeksekusi bytecode, mengelola memori dengan garbage collector, serta melakukan optimisasi performa melalui JIT compiler.

IDE (Integrated Development Environment) → software seperti IntelliJ IDEA yang menyediakan editor, debugger, manajemen proyek, dan fitur otomatisasi untuk mempermudah pengembangan aplikasi Java.

---

## 2. Pengenalan Java dan Lingkungan Pengembangan
- Java adalah bahasa pemrograman berorientasi objek yang populer dan banyak digunakan untuk pengembangan aplikasi desktop, web, dan mobile. Java menggunakan sintaks yang mirip dengan C++ tetapi dirancang untuk lebih mudah dipahami dan digunakan.

Untuk memulai pemrograman Java, Anda perlu:

1.JDK (Java Development Kit): Berisi compiler dan tools untuk mengembangkan program Java.
2.IDE (Integrated Development Environment): Seperti IntelliJ IDEA, Eclipse, atau NetBeans untuk menulis dan menjalankan kode.

## Langkah praktikum 1

1.Pastikan JDK dan Intellij IDE Community Edition sudah terinstal. Jika belum, kunjungi url berikut untuk mengunduh JDK Amazon Correto dan Intellij
2.Pastikan Anda memilih versi yang sesuai dengan arsitektur sistem operasi:
3.buat repository pada github dengan nama:
    nama:ti_design pattern
    location: disesuaikan
    build:intelij
    JDK: amazon correto
    hilangkan centang pada bagian add sample code
![gambar1](./gambar/gambar1.png)
4.Buat sebuah package baru didalam folder src, beri nama modul_1.
5.buat sebuah class didalam package modul_1, beri nama HelloWorld.
isi dengan kode dibawah ini:
````
package praktikum_1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
````
6.jalankan program, tekan tombol run untuk menjalankan program.
output:
![gambar2](./gambar/gambar2.png)

## 3. Variable dan Tipe Data
Variabel digunakan untuk menyimpan data dalam program. Setiap variabel memiliki tipe data yang menentukan jenis nilai yang dapat disimpan. Tipe data dasar di Java:

1.int: Bilangan bulat (contoh: 10, -5)
2.double: Bilangan desimal (contoh: 3.14, -0.5)
3.boolean: Nilai true atau false
4.char: Karakter tunggal (contoh: 'A', '1')
5.String: Teks (contoh: "Hello")
## Langkah Praktikum 2
1.buat sebuah class baru dalam modul_1, beri nama variable
2.tuliskan kode berikut:
````
package praktikum_1;

public class variable {
    public static void main(String[] args) {
    int umur = 20;
    double tinggi = 1.75;
    boolean isMahasiswa = true;
    char jenisKelamin = 'L';
    String nama = "Budi";

    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur);
    System.out.println("Tinggi: " + tinggi);
    System.out.println("Mahasiswa: " + isMahasiswa);
    System.out.println("Jenis Kelamin: " + jenisKelamin);
}
}
````
output:
![gambar3](./gambar/gambar3.png)

3.kerjakan latihan ini
Buatlah program untuk menampilkan data diri anda yang lengkap dengan attribut seperti berikut:
Nama Lengkap, Tempat Lahir, Tanggal Lahir, Golongan Darah, Umur,
Tinggi Badan, Jenis Kelamin, Agama, Pekerjaan, gunakan tipe data yang tetap untuk setiap variable.
4.buat sebuah package bernama latihan di dalam modul_1, kemudian buat sebuah class beri nama data diri.
````
package praktikum_1.latihan;

public class datadiri {
    public static void main(String[] args) {
        String namaLengkap = "Safrina";
        String tempatLahir = "Tambon Tunong";
        String tanggalLahir = "29 Juli 2005";
        String golonganDarah = "A";
        int umur = 20; // sesuaikan jika perlu
        double tinggiBadan = 160; // ganti sesuai tinggi kamu (cm)
        char jenisKelamin = 'P'; // P = Perempuan, L = Laki-laki
        String agama = "Islam"; // ganti jika berbeda
        String pekerjaan = "Mahasiswa"; // ganti jika perlu

        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Golongan Darah: " + golonganDarah);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Agama: " + agama);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
````
output:
![gambar4](./gambar/gambar4.png)

## 4.Operator dan Expressi
Operator digunakan untuk melakukan operasi pada variabel dan nilai. Jenis operator:

1.Aritmatika: +, -, *, /, % 
2.Perbandingan: ==, !=, >, <, >=, <=
3.Logika: && (AND), || (OR), ! (NOT)

## Langkah praktikum 3
1.buatlah sebuah class baru dalam packagemodul_1 beri nama operator
tuliskan kode berikut:
````
package praktikum_1;

public class operator {
    public static void main(String[] args) {
    int a = 10;
    int b = 5;

    System.out.println("a + b = " + (a + b));
    System.out.println("a > b? " + (a > b));
    System.out.println("a == b? " + (a == b));
}
}
````
output:
![gambar5](./gambar/gambar5.png)
3.kerjakan latihan berikut ini:
4.buat sebuah class beri nama luaspersegipanjang.
Buat program untuk menghitung luas persegi panjang (panjang * lebar)
````
package praktikum_1.latihan;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
    int panjang = 10;  // ganti sesuai kebutuhan
    int lebar = 5;     // ganti sesuai kebutuhan

    int luas = panjang * lebar;

    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar: " + lebar);
    System.out.println("Luas Persegi Panjang: " + luas);
}
}
````
output:
![gambar6](./gambar/gambar6.png)

## 5.Percabangan (if-else dan switch-case)
Percabangan digunakan untuk mengambil keputusan berdasarkan kondisi.
If-Else:
````
if (kondisi) {
    // Blok kode jika kondisi true
} else {
    // Blok kode jika kondisi false
}
````
switch-case
````
switch (variabel) {
    case nilai1:
        // Blok kode jika variabel == nilai1
        break;
    case nilai2:
        // Blok kode jika variabel == nilai2
        break;
    default:
        // Blok kode jika tidak ada case yang sesuai
}
````
## langkah praktikum 4
1.Buat sebuah class baru di dalam package modul_1 dan beri nama Percabangan
2.Tuliskan kode berikut:
````
package praktikum_1;

public class percabangan {
    public static void main(String[] args) {
    int nilai = 85;

    if (nilai >= 75) {
        System.out.println("Anda lulus!");
    } else {
        System.out.println("Anda tidak lulus.");
    }
}
}
````
output:
![gambar7](./gambar/gambar7.png)
3.kerjakan latihan ini:
Buat program untuk menentukan apakah suatu bilangan genap atau ganjil.
4.buat class didalam package latihan beri nama genapganjil
````
package praktikum_1.latihan;

public class GenapGanjil {
    public static void main(String[] args) {
        int angka = 7; // ganti dengan angka yang ingin dicek

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");
        }
    }
}
````
output:
![gambar8](./gambar/gambar8.png)

## 6.Perulangan(for, while, do-while)
Perulangan digunakan untuk mengulang blok kode.
For:
````
for (inisialisasi; kondisi; update) {
    // Blok kode yang diulang
}
````
while:
````
for (inisialisasi; kondisi; update) {
    // Blok kode yang diulang
}
````
do-while
````
do {
    // Blok kode yang diulang
} while (kondisi);
````
## langkah praktikum 5
1.Buat sebuah class baru di dalam package modul_1 dan beri nama Perulangan
2.Tuliskan kode berikut:
````
package praktikum_1;

public class perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }
    }
}
````
output:
![gambar9](./gambar/gambar9.png)
3.kerjakan latihan berikut ini:
Buat program untuk mencetak bilangan ganjil dari 1 hingga 20. Buat 3 program dengan menggunakan for, while, do-while.
4.buat tiga class dalam package latihan beri nama for, while, do while.
for:
````
package praktikum_1.latihan;

public class ganjilfor {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
````
output:
![gambar10](./gambar/gambar10.png)
while:
````
package praktikum_1.latihan;

public class ganjilwhile {
    public static void main(String[] args) {
    int i = 1;
    while (i <= 20) {
        if (i % 2 != 0) {
            System.out.print(i + " ");
        }
        i++;
    }
}
}
````
output:
![gambar11](./gambar/gambar11.png)
do-while:
````
package praktikum_1.latihan;

public class ganjildowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
````
output:
![gambar12](./gambar/gambar12.png)

## 7.Practicw Problem dan Solusinya
Practice Problem:
1Buat program untuk menghitung faktorial dari suatu bilangan.
2.Buat program untuk mengecek apakah suatu bilangan adalah bilangan prima.
3.Buat program untuk mencetak pola segitiga menggunakan *.

Solusi:
1.Buat sebuah class baru di dalam package modul_1 dan beri nama Factorial dan isikan kode berikut. Kemudian jalankan untuk melihat hasilnya.
````
package praktikum_1;

public class faktorial {
    public static void main(String[] args) {
    int n = 5;
    int hasil = 1;

    for (int i = 1; i <= n; i++) {
        hasil *= i;
    }

    System.out.println("Faktorial dari " + n + " adalah " + hasil);
}
}
````
output:
![gambar13](./gambar/gambar13.png)
2.Buat sebuah class baru di dalam package modul_1 dan beri nama Prima dan isikan kode berikut. Kemudian jalankan untuk melihat hasilnya
````
package praktikum_1;

public class prima {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrima = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrima = false;
                break;
            }
        }

        System.out.println(n + (isPrima ? " adalah bilangan prima." : " bukan bilangan prima."));
    }
}
````
output:
![gambar14](./gambar/gambar14.png)
3.Buat sebuah class baru di dalam package modul_1 dan beri nama Segitiga dan isikan kode berikut. Kemudian jalankan untuk melihat hasilnya.
````
package praktikum_1;

public class segitiga {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
````
output:
![gambar15](./gambar/gambar15.png)

note:Commit semua code yang anda buat dan beri pesan quick review - pemrograman java dasar.

## 4. Referensi
Module 1 - Review Dasar Pemrograman Java-https://hackmd.io/@mohdrzu/BkBn4sEcyl
w3school-https://www.w3schools.com/java/java_oop.asp

---