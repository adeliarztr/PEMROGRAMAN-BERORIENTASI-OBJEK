import java.time.LocalDate;
import java.util.ArrayList;

public class Jadwal {
    private String idJadwal;
    private LocalDate tanggal;
    private Kereta kereta;
    private ArrayList<Tiket> daftarTiket;

    public Jadwal(String idJadwal, LocalDate tanggal, Kereta kereta) {
        this.idJadwal = idJadwal;
        this.tanggal = tanggal;
        this.kereta = kereta;
        this.daftarTiket = new ArrayList<>();
    }

    public String getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(String id) {
        this.idJadwal = id;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Kereta getKereta() {
        return kereta;
    }

    public void setKereta(Kereta kereta) {
        this.kereta = kereta;
    }

    public void tambahTiket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    public String getInfo() {
        String info = "Jadwal: " + idJadwal + ", Tanggal: " + tanggal + "\n";
        info += kereta.getInfo();
        if (!daftarTiket.isEmpty()) {
            info += "Daftar Tiket:\n";
            for (Tiket tiket : daftarTiket) {
                info += tiket.getInfo();
            }
        } else {
            info += "Belum ada tiket\n";
        }
        return info;
    }
}
