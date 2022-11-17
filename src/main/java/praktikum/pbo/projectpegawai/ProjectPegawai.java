/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectpegawai;

public class ProjectPegawai {

    public static void main(String[] args) {
        
        //instansiasi
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2;
        
        //inisialisasi melalui mutator/setter
        pegawai1.setNip(10102020);
        pegawai1.setNama("Sukijan");
        pegawai1.setAlamat("Jl. Sesama");
        pegawai1.setGajiPokok(10000000);
        pegawai1.setJumlahHariLembur(4);
        pegawai1.setTotalGaji(pegawai1.getJumlahHariLembur(), pegawai1.getGajiPokok());
        
        //tampil
        System.out.println("Data Pegawai 1");
        System.out.println("NIP               : " + pegawai1.getNip());
        System.out.println("Nama              : " + pegawai1.getNama());
        System.out.println("Alamat            : " + pegawai1.getAlamat());
        System.out.println("Jumlah Hari Lembur: " + pegawai1.getJumlahHariLembur());
        System.out.println("Gaji Pokok        : " + pegawai1.getGajiPokok());
        System.out.println("Total Gaji        : " + pegawai1.getTotalGaji());
        System.out.println();
    
        //inisialisasi melalui konstruktor
        pegawai2 = new Pegawai(10103030, "Susanti", "Jl. In Aja Dulu", 2, 6000000);
        
        //tampil
        System.out.println("Data Pegawai 2");
        System.out.println("NIP               : " + pegawai2.getNip());
        System.out.println("Nama              : " + pegawai2.getNama());
        System.out.println("Alamat            : " + pegawai2.getAlamat());
        System.out.println("Jumlah Hari Lembur: " + pegawai2.getJumlahHariLembur());
        System.out.println("Gaji Pokok        : " + pegawai2.getGajiPokok());
        pegawai2.setTotalGaji(pegawai2.getJumlahHariLembur(), pegawai2.getGajiPokok());
        System.out.println("Total Gaji        : " + pegawai2.getTotalGaji());
        System.out.println();
    }
}
