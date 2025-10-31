package Sebelum; // Menentukan bahwa kelas ini berada dalam package "Sebelum"

import java.util.Scanner; // Mengimpor kelas Scanner untuk menerima input dari keyboard

// Mendeklarasikan kelas HitungNilaiMahasiswa
public class HitungNilaiMahasiswa
{
    private String nama;       // Variabel untuk menyimpan nama mahasiswa
    private String nim;        // Variabel untuk menyimpan NIM mahasiswa
    private double nilaiTugas; // Variabel untuk menyimpan nilai tugas mahasiswa
    private double nilaiUTS;   // Variabel untuk menyimpan nilai UTS mahasiswa
    private double nilaiUAS;   // Variabel untuk menyimpan nilai UAS mahasiswa

    // Method untuk menentukan grade berdasarkan nilai akhir
    public String getGrade() {
        double nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS); // Rumus menghitung nilai akhir

        if (nilaiAkhir >= 85) // Jika nilai akhir ≥ 85, maka grade A
        {
            return "A";
        }
        else if (nilaiAkhir >= 75) // Jika nilai akhir ≥ 75 dan < 85, maka grade B
        {
            return "B";
        }
        else if (nilaiAkhir >= 65) // Jika nilai akhir ≥ 65 dan < 75, maka grade C
        {
            return "C";
        }
        else if (nilaiAkhir >= 55) // Jika nilai akhir ≥ 55 dan < 65, maka grade D
        {
            return "D";
        }
        else // Jika nilai akhir < 55, maka grade E
        {
            return "E";
        }
    }

    // Method untuk menampilkan semua data mahasiswa dan hasil nilai akhir
    public void tampilkanData()
    {
        double nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS); // Menghitung nilai akhir

        System.out.println("\n=== Hasil Nilai Akhir Mahasiswa ==="); // Menampilkan judul output
        System.out.println("Nama Mahasiswa : " + nama); // Menampilkan nama mahasiswa
        System.out.println("NIM            : " + nim); // Menampilkan NIM mahasiswa
        System.out.println("Nilai Tugas    : " + nilaiTugas); // Menampilkan nilai tugas
        System.out.println("Nilai UTS      : " + nilaiUTS); // Menampilkan nilai UTS
        System.out.println("Nilai UAS      : " + nilaiUAS); // Menampilkan nilai UAS
        System.out.println("Nilai Akhir    : " + nilaiAkhir); // Menampilkan nilai akhir
        System.out.println("Grade          : " + getGrade()); // Menampilkan grade akhir
    }

    // Method utama sebagai titik awal eksekusi program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input
        HitungNilaiMahasiswa mhs = new HitungNilaiMahasiswa(); // Membuat objek dari kelas HitungNilaiMahasiswa

        System.out.println("=== Program Menghitung Nilai Akhir Mahasiswa ==="); // Judul program

        System.out.print("Masukkan Nama Mahasiswa : "); // Meminta input nama
        mhs.nama = input.nextLine(); // Menyimpan input nama pengguna ke variabel nama

        System.out.print("Masukkan NIM Mahasiswa  : "); // Meminta input NIM
        mhs.nim = input.nextLine(); // Menyimpan input NIM ke variabel nim

        System.out.print("Masukkan Nilai Tugas    : "); // Meminta input nilai tugas
        mhs.nilaiTugas = input.nextDouble(); // Menyimpan nilai tugas

        System.out.print("Masukkan Nilai UTS      : "); // Meminta input nilai UTS
        mhs.nilaiUTS = input.nextDouble(); // Menyimpan nilai UTS

        System.out.print("Masukkan Nilai UAS      : "); // Meminta input nilai UAS
        mhs.nilaiUAS = input.nextDouble(); // Menyimpan nilai UAS

        mhs.tampilkanData(); // Memanggil method untuk menampilkan hasil data dan nilai akhir

        input.close(); // Menutup Scanner agar tidak terjadi kebocoran sumber daya
    }
}
