public class Koki {
    //DEKLARASI Atribut
    String nama;
    int umur;
    String spesialisMasakan;
    int masakanYangDibuat;

    //METHOD UNTUK MENAMPILKAN INFO KOKI
    public void displayInfo() {
        System.out.println("-----BIODATA KOKI HOTEL SAVANA------");
        System.out.println("Nama Koki: " + nama);
        System.out.println("Umur Koki : " + umur);
        System.out.println("Spesialis Masakan: " + spesialisMasakan);
        System.out.println("Pengalaman: " + masakanYangDibuat + "masakan");
    }

    public void memasak() { //METHOD UNTUK MEMASAK
        System.out.println(nama + " sedang memasak.");
    }

    public int TambahMasakan (int jumlahMasakan) {      //METHOD UNTUK MENAMBAH MASAKAN BERPARAMETER
        return masakanYangDibuat+ jumlahMasakan;
    }
        

    public int TimbangBahan (int beratBahan) {          //METHOD UNTUK MENIMBANG BAHAN BERPARAMETER
        return beratBahan;
    }

    public void cicipiMasakan() {                            //METHOD UNTUK MENCICIPI MASAKAN      
        System.out.println(nama + " sedang mencicipi masakan.");
    }


}