package Sesudah;

import java.util.Scanner;

/**
 * Kelas MainApp berfungsi sebagai titik awal (entry point) program atau kelas utama.
 * Program akan meminta pengguna memasukkan data mahasiswa seperti:
 * Nama, NIM, Nilai Tugas, Nilai UTS, dan Nilai UAS.
 * Setelah data dimasukkan, program akan menampilkan nilai akhir dan grade mahasiswa.
 */
public class MainApp
{
    /**
     * Method main adalah method utama yang pertama kali dijalankan ketika program berjalan.
     *
     * @param args Array string yang dapat digunakan untuk memasukkan argumen melalui command line (tidak digunakan di program ini).
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HitungNilaiMahasiswa mahasiswa = new HitungNilaiMahasiswa();

        System.out.println("=== Program Menghitung Nilai Akhir Mahasiswa ===");

        System.out.print("Masukkan Nama Mahasiswa : ");
        mahasiswa.setNama(input.nextLine());

        System.out.print("Masukkan NIM Mahasiswa  : ");
        mahasiswa.setNim(input.nextLine());

        System.out.print("Masukkan Nilai Tugas    : ");
        mahasiswa.setNilaiTugas(input.nextDouble());

        System.out.print("Masukkan Nilai UTS      : ");
        mahasiswa.setNilaiUTS(input.nextDouble());

        System.out.print("Masukkan Nilai UAS      : ");
        mahasiswa.setNilaiUAS(input.nextDouble());


        mahasiswa.tampilkanData();
        input.close();
    }
}
