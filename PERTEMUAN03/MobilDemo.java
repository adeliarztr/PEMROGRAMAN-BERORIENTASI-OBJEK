public class MobilDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Ferrari");

        mobil1.setKecepatan(250);
        System.out.println("Merk Mobil: " + mobil1.getMerek());
        mobil1.tampilkanInfo();
    }
}