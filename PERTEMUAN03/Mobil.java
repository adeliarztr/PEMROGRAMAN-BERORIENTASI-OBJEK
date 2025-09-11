public class Mobil {
    private String merek;
    private int kecepatan;
    
    public Mobil(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }


    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}