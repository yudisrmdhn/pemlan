/**
 * Class MainApp berfungsi sebagai program utama
 * untuk menampilkan hasil perhitungan gaji karyawan.
 */
public class MainApp {

    /**
     * Method main menjalankan program dan menampilkan slip gaji beberapa karyawan.
     */
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("  SISTEM KALKULATOR GAJI KARYAWAN");
        System.out.println("====================================\n");

        Tugas3 karyawan1 = new Tugas3("yudis", "Manager", 8000000, 23);
        Tugas3 karyawan2 = new Tugas3("Niam", "Staff", 5000000, 20);
        Tugas3 karyawan3 = new Tugas3("Altop", "Supervisor", 6500000, 22);
        Tugas3 karyawan4 = new Tugas3("Riqi", "Magang", 50000000, 21);
        Tugas3 karyawan5 = new Tugas3("Bagti", "Manager", 8000000, 23);

        karyawan1.displayInfo();
        karyawan2.displayInfo();
        karyawan3.displayInfo();
        karyawan4.displayInfo();
        karyawan5.displayInfo();
    }
}