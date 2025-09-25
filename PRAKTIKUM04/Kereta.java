public class Kereta {
    private String kodeKereta;
    private String namaKereta;
    private int kapasitas;

    public Kereta(String kodeKereta, String namaKereta, int kapasitas) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.kapasitas = kapasitas;
    }

    public String getKodeKereta() {
        return kodeKereta;
    }

    public void setKodeKereta(String kode) {
        this.kodeKereta = kode;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String nama) {
        this.namaKereta = nama;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getInfo() {
        return "Kereta: " + namaKereta + " (" + kodeKereta + "), Kapasitas: " + kapasitas + "\n";
    }
}
