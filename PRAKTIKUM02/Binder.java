public class Binder {
    String Merk;
    String Warna;
    int JumlahHalaman;
    double Ukuran;
    //DEKLARASI Atribut

    public void displayInfo() { //METHOD UNTUK MENAMPILKAN INFO BINDER
        System.out.println("-----INFO BINDER------");
        System.out.println("Merk Binder: " + Merk);
        System.out.println("Warna Binder : " + Warna);
        System.out.println("Jumlah Halaman: " + JumlahHalaman + " halaman");
        System.out.println("Ukuran Binder: " + Ukuran + " cm");
    }

    public void bukaBinder() { //METHOD UNTUK MEMBUKA BINDER
        System.out.println("Binder " + Merk + " Dibuka.");
    }

    public int tambahKertas(int halamanBaru) { //METHOD UNTUK MENAMBAH HALAMAN BERPARAMETER
        return JumlahHalaman + halamanBaru;
    }

    public int AmbilKertas(int halamanDiambil) { //METHOD UNTUK MENGAMBIL HALAMAN BERPARAMETER
        return JumlahHalaman - halamanDiambil;
    }

    public void tutupBinder() {  //METHOD UNTUK MENUTUP BINDER
        System.out.println("Binder " + Merk + " Ditutup.");
    }

    
}
