import java.util.Scanner; // Mengimpor kelas Scanner untuk input

public class Hello { // Mendefinisikan kelas dengan nama 'Hello' nama harus sesuai dengan nama file

    public static void main(String[] args) {
        //soal1(); // Memanggil metode soal1 untuk menampilkan soal 1
        //soal2();
        //soal3();
        //soal4();
        //soal5();
        soal6();
    }

    //=========================== Soal 1: Deklarasi dan Inisialisasi Variabel ===========================
    public static void soal1() {
        System.out.println("======= Soal No.1: Deklarasi dan Inisialisasi Variabel =======");

        // Deklarasi dan Inisialisasi Variabel
        String nama = "Maulida Cahya";
        int usia = 15;
        double beratBadan = 45;
        float tinggiBadan = 160;
        char golonganDarah = 'F';
        boolean isMahasiswa = true;

        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Golongan Darah: " + golonganDarah);
        System.out.println("Mahasiswa? " + isMahasiswa);
    }
    //===================================================================================================



    //=========================== Soal 2: Menghitung Luas Lingkaran ===========================
    public static void soal2() { // Mendefinisikan metode soal2
        System.out.println("======= Menghitung Luas Lingkaran =======");

        try (Scanner scanner = new Scanner(System.in)) { // Menggunakan try-with-resources untuk Scanner
            double pi = Math.PI; // Mendapatkan nilai pi dari kelas Math
            System.out.print("Masukkan jari-jari: "); // Menampilkan pesan untuk soal 2
            
            // Membaca input dari pengguna dan mengonversinya ke double
            double jawaban2 = Double.parseDouble(scanner.nextLine()); 
            
            // Mengalikan jawaban dengan pi
            double hasil = jawaban2 * pi; 
            System.out.println("Luas Lingkaran: " +  hasil); // Menampilkan hasil
        } // Scanner akan otomatis ditutup di sini
    }
    //=========================================================================================



    //=========================== Soal 3: Menukar Nilai Variabel ===========================
    public static void soal3() {
        System.out.println("======= Soal No. 3: Menukar Nilai Variabel =======");

        int a = 5, b = 10;

        System.out.println("Sebelum ditukar: " + "a = " + a + " b = " + b);
        System.out.println("Setelah ditukar: " + "a = " + b + " b = " + a);
    }
    //======================================================================================



    //=========================== Soal 4: Konversi Tipe Data ===========================
    public static void soal4() {
        System.out.println("======= Soal No. 4: Konversi Tipe Data =======");
    
        int angka = 10;
        double nilaiDouble = 9.8;
        char huruf = 'A';
        int kodeHuruf = 66;

        System.out.println("int ke double: " + angka + " -> " + (double)angka);
        System.out.println("double ke int: " + nilaiDouble + " -> " + (int)nilaiDouble);
        System.out.println("char ke int: " + huruf + " -> " + (int)huruf);
        System.out.println("int ke char: " + kodeHuruf + " -> " + (char)kodeHuruf);
    }
    //==================================================================================


    //=========================== Soal 5: Membuat Kelas dan Objek ===========================
    public static void soal5() {
        System.out.println("======= Soal 5: Membuat Kelas dan Objek =======");
            
            Mahasiswa mahasiswa1 = new Mahasiswa("Maulida Cahya", "A11.2023.15470", "Teknik Informatika", 2023);
            mahasiswa1.tampilkanInfo();
        }
    }
    
    class Mahasiswa {
        // Atribut
        private String nama;
        private String nim;
        private String prodi;
        private int angkatan;
    
        // Constructor
        public Mahasiswa(String nama, String nim, String prodi, int angkatan) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            this.angkatan = angkatan;
        }
    
        // Metode untuk menampilkan informasi mahasiswa
        public void tampilkanInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Prodi: " + prodi);
            System.out.println("Angkatan: " + angkatan);
        }
    }
    //=======================================================================================

    public static void soal6() {
        System.out.println("======= Soal No. 6: Cek Bilangan Positif atau Negatif =======");
        int bilangan = -5;
        if (bilangan > 0) {
    }
