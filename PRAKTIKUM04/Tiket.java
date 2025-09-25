public class Tiket {
    private String nomorTiket;
    private Penumpang penumpang;
    private Jadwal jadwal;
    private int nomorKursi;

    public Tiket(Penumpang penumpang, Jadwal jadwal, int nomorKursi) {
        this.penumpang = penumpang;
        this.jadwal = jadwal;
        this.nomorKursi = nomorKursi;
        this.nomorTiket = penumpang.getIdPenumpang() + "-" + jadwal.getIdJadwal() + "-" + nomorKursi;
    }

    public String getNomorTiket() {
        return nomorTiket;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public int getNomorKursi() {
        return nomorKursi;
    }

    public String getInfo() {
        return "\tTiket: " + nomorTiket + ", Kursi: " + nomorKursi + ", Jadwal: " + jadwal.getIdJadwal() + "\n";
    }
}
