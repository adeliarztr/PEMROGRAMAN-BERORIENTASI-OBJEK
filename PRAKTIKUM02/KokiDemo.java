public class KokiDemo {
    public static void main(String[] args) {
        //Membuat objek dari kelas Koki
        Koki koki1 = new Koki();                        //Membuat objek baru dari kelas Koki
        koki1.nama = "Adelia";                          //Mengisi atribut-atribut objek
        koki1.umur = 25;
        koki1.spesialisMasakan = "Masakan Nusantara";
        koki1.masakanYangDibuat = 50;

        koki1.displayInfo(); //Memanggil method untuk menampilkan info koki
        koki1.memasak();    //memanggil method untuk memasak
      

        int TambahMasakan = koki1.TambahMasakan(3);  //memanggil method untuk menambah masakan dengan parameter 3
        System.out.println("Pengalaman setelah menambah masakan: " + TambahMasakan + "  Masakan"); //menampilkan hasil penambahan masakan

        int beratBahan = koki1.TimbangBahan(250); //memanggil method untuk menimbang bahan dengan parameter 250
        System.out.println("Berat bahan yang ditimbang: " + beratBahan + " gram"); //menampilkan hasil penimbangan bahan

        koki1.cicipiMasakan(); //memanggil method untuk mencicipi masakan

        
    }
    
}
