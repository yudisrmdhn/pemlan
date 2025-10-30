/**
 * Class Tugas3 digunakan untuk menghitung gaji karyawan
 * berdasarkan jabatan, kehadiran, dan potongan tetap.
 */
public class Tugas3 {
    private static final double GAJI_UTAMA = 0.1;
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private int jumlahHadir;

    /**
     * Konstruktor untuk membuat objek karyawan
     * @param nama
     * @param jabatan
     * @param gajiPokok
     * @param jumlahHadir
     */
    public Tugas3(String nama, String jabatan, double gajiPokok, int jumlahHadir) {
        this.setNama(nama);
        this.setJabatan(jabatan);
        this.setGajiPokok(gajiPokok);
        this.setJumlahHadir(jumlahHadir);
    }

    /**
     * Menampilkan slip gaji lengkap beserta tunjangan, bonus dan potongan.
     */
    public void displayInfo() {
        double tunjangan = 0;
        if (getJabatan().equals("Manager")) {
            tunjangan = 500000 + 400000 + 600000; // Apa maksud angka-angka ini?
        } else if (getJabatan().equals("Supervisor")) {
            tunjangan = 400000 + 350000 + 450000;
        } else if (getJabatan().equals("Staff")) {
            tunjangan = 300000 + 250000 + 200000;
        } else {
            tunjangan = 200000 + 150000 + 100000;
        }

        double bonus = 0;
        if (getJumlahHadir() >= 22) {
            bonus = getGajiPokok() * GAJI_UTAMA;
        }

        double gajiBersih = getGajiPokok() + tunjangan + bonus - getPotongan();

        System.out.println("=== SLIP GAJI KARYAWAN ===");
        System.out.println("Nama            : " + getString());
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Gaji Pokok      : Rp " + getGajiPokok());
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Bonus Hadir     : Rp " + bonus);
        System.out.println("Potongan        : Rp " + getPotongan());
        System.out.println("---------------------------");
        System.out.printf("Gaji Bersih     : Rp %.0f%n", gajiBersih);
        System.out.println("===========================\n");
    }

    /**
     * Menghitung total potongan tetap
     */
    private static double getPotongan() {
        double potongan = 50000 + 25000;
        return potongan;
    }

    /**
     * Mengambil nama karyawan (pengganti getString()).
     */
    private String getString() {
        return getNama();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getJumlahHadir() {
        return jumlahHadir;
    }

    public void setJumlahHadir(int jumlahHadir) {
        this.jumlahHadir = jumlahHadir;
    }
}