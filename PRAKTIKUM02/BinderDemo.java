public class BinderDemo {
    public static void main(String[] args) {
        Binder binder1 = new Binder(); //Membuat objek baru dari kelas Binder
        binder1.Merk = "Kiky";              //Mengisi atribut-atribut objek
        binder1.Warna = "Soft Pink";       
        binder1.JumlahHalaman = 300;
        binder1.Ukuran = 29.7;

        Binder binder2 = new Binder(); //Membuat objek ke 2 dari kelas Binder 
        binder2.Merk = "Bantex";              //Mengisi atribut-atribut objek 2
        binder2.Warna = "Baby Blue";       
        binder2.JumlahHalaman = 150;
        binder2.Ukuran = 17.6;



        binder1.displayInfo(); //Memanggil method untuk menampilkan info binder
        binder1.bukaBinder(); //memanggil method untuk membuka binder

        //memanggil method untuk menambah halaman dengan parameter 20
        System.out.println("Jumlah Halaman setelah ditambah: " + binder1.tambahKertas(20)); 

        //memanggil method untuk mengambil halaman dengan parameter 10
        System.out.println("Jumlah Halaman setelah diambil: " + binder1.AmbilKertas(10));
        
        binder1.tutupBinder(); //memanggil method untuk menutup binder

        System.out.println(); 

        binder2.displayInfo(); //Memanggil method untuk menampilkan info binder 2
        binder2.bukaBinder(); //memanggil method untuk membuka binder 2
        
        //memanggil method untuk menambah halaman binder 2 dengan parameter 20
        System.out.println("Jumlah Halaman setelah ditambah: " + binder2.tambahKertas(10)); 

        //memanggil method untuk mengambil halaman binder 2 dengan parameter 10
        System.out.println("Jumlah Halaman setelah diambil: " + binder2.AmbilKertas(25));
        binder2.tutupBinder(); //memanggil method untuk menutup binder
    } 
    
}
