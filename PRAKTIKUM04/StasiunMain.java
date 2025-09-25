import java.time.LocalDate;
public class StasiunMain {
    public static void main(String[] args) {
        Kereta kereta1 = new Kereta("KAI1", "Bima Sakti", 100);
        Kereta kereta2 = new Kereta("KAI2", "Maju Jaya", 80);

        Jadwal jadwal1 = new Jadwal("J001", LocalDate.of(2025, 9, 11), kereta1);
        Jadwal jadwal2 = new Jadwal("J002", LocalDate.of(2025, 9, 12), kereta2);

        Penumpang penumpang1 = new Penumpang("P01", "Adelia");
        Penumpang penumpang2 = new Penumpang("P02", "Rahma");

        penumpang1.pesanTiket(jadwal1, 12);
        penumpang2.pesanTiket(jadwal2, 7);

        System.out.println(penumpang1.getInfo());
        System.out.println(penumpang2.getInfo());

        System.out.println(jadwal1.getInfo());
        System.out.println(jadwal2.getInfo());
    }
}