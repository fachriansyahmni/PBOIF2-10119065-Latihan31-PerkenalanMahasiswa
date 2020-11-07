package pboif2.pkg10119065.latihan31.perkenalanmahasiswa;


/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program perkenalan mahasiswa 
                          dengan objek
 */
public class PBOIF210119065Latihan31PerkenalanMahasiswa {
    public static void main(String[] args) {
        Mahasiswa Mhs;
        
        Mhs = new Mahasiswa();
        Mhs.nim = 10110269;
        Mhs.nama = "Rizki Adam Kurniawan";
        Mhs.PekenalanDiri();
        
        Mhs.nim = 10110270;
        Mhs.nama = "Asep Fahrezi";
        Mhs.PekenalanDiri();
        
        Mhs.nim = 10110271;
        Mhs.nama = "Robi Maulana";
        Mhs.PekenalanDiri();
        
        Mhs.nim = 10110272;
        Mhs.nama = "Nur Aliudin";
        Mhs.PekenalanDiri();
        
        System.out.println("Developed by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
