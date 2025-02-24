import java.util.Scanner; // Mengimpor kelas Scanner untuk input

public class Hello { // Mendefinisikan kelas dengan nama 'Hello' nama harus sesuai dengan nama file

    public static void main(String[] args) {
        //soal1(); // Memanggil metode soal1 untuk menampilkan soal 1
        //soal2();
        soal3();
    }

    //=========================== Soal 1: Deklarasi dan Inisialisasi Variabel ===========================
    public static void soal1() {
        System.out.println("======= Soal No.1 =======");

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
        System.out.println("======= Soal No. 2 =======");

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
    //===================================================================================================

    

    //=========================== Soal 3: Menukar Nilai Variabel ===========================
    public static void soal3() { // Mendefinisikan metode soal3
        System.out.println("======= Soal No. 3 ======="); // Menampilkan teks untuk soal 3
    }
}


