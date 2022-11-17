/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectpegawai;

public class Pegawai {
    
    //attributes
    private int nip;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private int gajiPokok;
    private int totalGaji;

    //constructor with no argument/parameter
    public Pegawai() {
    }

    //constructor with arguments/parameter
    public Pegawai(int nip, String nama, String alamat, int jumlahHariLembur, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahHariLembur = jumlahHariLembur;
        this.gajiPokok = gajiPokok;
    }
    
    //accessor & mutator (getter & setter)
    
    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    //overloading
    public void setTotalGaji(int jumlahHariLembur, int gajiPokok) {
        this.totalGaji = (int) (gajiPokok + (gajiPokok * jumlahHariLembur * 0.01));
    }
    
    //overloading
    public void setTotalGaji(int jumlahHariLembur, int gajiPokok, double pajak) {
        this.totalGaji = (int) (gajiPokok + (gajiPokok * jumlahHariLembur * pajak));
    }
}
