import java.util.Scanner; // Mengimpor kelas Scanner

public class Hello2 { // Mendefinisikan kelas dengan nama 'Main'
    
    public static void main(String[] args) { // Metode utama yang dijalankan saat program dimulai
        soal1(); // Memanggil metode soal1 untuk menampilkan soal 1
        soal2(); // Memanggil metode soal2 untuk meminta input
        soal3(); // Memanggil metode soal3 untuk menampilkan soal 3
    }

    public static void soal1() { // Mendefinisikan metode soal1
        System.out.println("Ini adalah soal 1"); // Menampilkan teks untuk soal 1
    }

    public static void soal2() { // Mendefinisikan metode soal2
        try (Scanner scanner = new Scanner(System.in)) { // Menggunakan try-with-resources untuk Scanner
            double pi = Math.PI; // Mendapatkan nilai pi dari kelas Math
            System.out.print("Masukkan jawaban untuk soal 2: "); // Menampilkan pesan untuk soal 2
            
            // Membaca input dari pengguna dan mengonversinya ke double
            double jawaban2 = Double.parseDouble(scanner.nextLine()); 
            
            // Mengalikan jawaban dengan pi
            double hasil = jawaban2 * pi; 
            System.out.println("Hasil dari " + jawaban2 + " dikali pi (" + pi + ") adalah: " + hasil); // Menampilkan hasil
        } // Scanner akan otomatis ditutup di sini
    }

    public static void soal3() { // Mendefinisikan metode soal3
        System.out.println("Ini adalah soal 3"); // Menampilkan teks untuk soal 3
    }
}