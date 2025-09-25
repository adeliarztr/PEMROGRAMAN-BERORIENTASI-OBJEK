import java.util.ArrayList;

public class Penumpang {
    private String idPenumpang;
    private String nama;
    private ArrayList<Tiket> riwayatTiket;

    public Penumpang(String idPenumpang, String nama) {
        this.idPenumpang = idPenumpang;
        this.nama = nama;
        this.riwayatTiket = new ArrayList<>();
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public void setIdPenumpang(String id) {
        this.idPenumpang = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void pesanTiket(Jadwal jadwal, int kursi) {
        Tiket tiket = new Tiket(this, jadwal, kursi);
        riwayatTiket.add(tiket);
        jadwal.tambahTiket(tiket);
    }

    public String getInfo() {
        String info = "";
        info += "ID Penumpang   : " + idPenumpang + "\n";
        info += "Nama           : " + nama + "\n";
        if (!riwayatTiket.isEmpty()) {
            info += "Riwayat Tiket :\n";
            for (Tiket tiket : riwayatTiket) {
                info += tiket.getInfo();
            }
        } else {
            info += "Belum ada riwayat tiket\n";
        }
        return info;
    }
}