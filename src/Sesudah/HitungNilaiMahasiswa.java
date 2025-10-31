package Sesudah;

/**
 * Kelas ini digunakan untuk menyimpan data mahasiswa dan menghitung nilai akhirnya.
 * Nilai akhir dihitung dari:
 * - Nilai Tugas (30%)
 * - Nilai UTS (30%)
 * - Nilai UAS (40%)
 * Setelah nilai akhir dihitung, kelas ini juga menentukan grade (A-E).
 */
public class HitungNilaiMahasiswa {

    // Bobot nilai
    public static final double BOBOT_TUGAS = 0.3;
    public static final double BOBOT_UTS = 0.3;
    public static final double BOBOT_UAS = 0.4;

    // Data mahasiswa
    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    /**
     * Method ini menghitung nilai akhir mahasiswa berdasarkan rumus bobot nilai.
     * @return nilai akhir dalam bentuk angka desimal.
     */
    private double hitungNilaiAkhir() {
        return (BOBOT_TUGAS * nilaiTugas) + (BOBOT_UTS * nilaiUTS) + (BOBOT_UAS * nilaiUAS);
    }

    /**
     * Method ini menentukan grade berdasarkan nilai akhir.
     * @return grade huruf A, B, C, D, atau E.
     */
    public String tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 85) {
            return "A";
        }
        else if (nilaiAkhir >= 75) {
            return "B";
        }
        else if (nilaiAkhir >= 65) {
            return "C";
        }
        else if (nilaiAkhir >= 55) {
            return "D";
        }
        else {
            return "E";
        }
    }

    /**
     * Menentukan status kelulusan berdasarkan grade.
     * @return "Lulus" jika grade A, B, atau C. Jika tidak, "Tidak Lulus".
     */
    public String tentukanStatusKelulusan() {
        String grade = tentukanGrade();
        if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    /**
     * Method ini menampilkan data mahasiswa beserta nilai akhir dan grade.
     */
    public void tampilkanData() {
        double nilaiAkhir = hitungNilaiAkhir();

        System.out.println("\n=== Hasil Nilai Akhir Mahasiswa ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Nilai Tugas    : " + nilaiTugas);
        System.out.println("Nilai UTS      : " + nilaiUTS);
        System.out.println("Nilai UAS      : " + nilaiUAS);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + tentukanGrade());
        System.out.println("Status         : " + tentukanStatusKelulusan());
    }

    /**
     * Mengambil nama mahasiswa yang disimpan.
     * @return Nama mahasiswa dalam bentuk String.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengisi atau mengubah nilai nama mahasiswa.
     * @param nama Nama mahasiswa yang akan disimpan.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengambil NIM mahasiswa yang disimpan.
     * @return NIM mahasiswa dalam bentuk String.
     */
    public String getNim() {
        return nim;
    }

    /**
     * Mengisi atau mengubah nilai NIM mahasiswa.
     * @param nim NIM mahasiswa yang akan disimpan.
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * Mengambil nilai tugas mahasiswa.
     * @return Nilai tugas dalam bentuk angka (double).
     */
    public double getNilaiTugas() {
        return nilaiTugas;
    }

    /**
     * Mengisi nilai tugas mahasiswa.
     * @param nilaiTugas Nilai tugas yang diinputkan (0 - 100).
     */
    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    /**
     * Mengambil nilai UTS mahasiswa.
     * @return Nilai UTS dalam bentuk angka (double).
     */
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    /**
     * Mengisi nilai UTS mahasiswa.
     * @param nilaiUTS Nilai UTS yang diinputkan (0 - 100).
     */
    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    /**
     * Mengambil nilai UAS mahasiswa.
     * @return Nilai UAS dalam bentuk angka (double).
     */
    public double getNilaiUAS() {
        return nilaiUAS;
    }

    /**
     * Mengisi nilai UAS mahasiswa.
     * @param nilaiUAS Nilai UAS yang diinputkan (0 - 100).
     */
    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

}
