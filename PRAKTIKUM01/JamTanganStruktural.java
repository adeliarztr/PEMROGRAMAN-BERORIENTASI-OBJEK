public class JamTanganStruktural{
    public static void main(String[] args) {
        String merek1, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
        String tipe1, tipe2, tipe3;
        String warna1, warna2, warna3, warna4;

        merek1 = "Casio";
        tipe1 = "Digital";
        warna1 = "Hitam";

        merek2 = "Seiko";
        tipe2 = "Analog";
        warna2 = "Silver";

        merek3 = "Huwawei";
        tipe3 = "Smartwatch";
        warna3 = "Hitam";

        merek4 = "Huwawei";
        tipe3 = "Smartwatch"; 
        warna4 = "Silver";  
        
        merek5 = "Digitac";
        tipe2 = "Analog";
        warna4 = "Biru";

        merek6 = "Seiko";
        tipe1 = "Digital";
        warna1 = "Hitam";

        merek7 = "Casio";
        tipe2 = "Analog";
        warna2 = "Coklat";

        merek8 = "iwatch";
        tipe3 = "smartwatch";
        warna3 = "Biru";

        merek9 = "iWatch";
        tipe3 = "Smartwatch";
        warna4 = "Hitam";

        merek10 = "Seiko";
        tipe2 = "Analog";
        warna4 = "Biru";

        String waktu1 = tampilkanWaktu(merek1);
        String alarm2 = aturAlarm(merek2, "06:00");

        System.out.println("Merek: " + merek1);
        System.out.println("Tipe: " + tipe1);
        System.out.println("Warna: " + warna1);
        System.out.println("Waktu: " + waktu1);
        System.out.println("-------------------------");

        System.out.println("Merek: " + merek2);
        System.out.println("Alarm: " + alarm2);
        System.out.println("Tipe: " + tipe2);
        System.out.println("Warna: " + warna2);
        System.out.println("-------------------------");

    
    
    }

    public static String tampilkanWaktu(String merekJam) {
        return "Jam tangan " + merekJam + " menunjukkan pukul 10:30 WIB";
    }

    public static String aturAlarm(String merekJam, String waktuAlarm) {
        return "Alarm pada jam tangan " + merekJam + " diatur pukul " + waktuAlarm;
    }
    

}
