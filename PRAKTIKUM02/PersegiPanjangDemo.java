public class PersegiPanjangDemo { 
   public static void main(String[] args) {
      PersegiPanjang pp1 = new PersegiPanjang(); //Membuat objek baru dari kelas PersegiPanjang
      pp1.panjang = 10; //Mengisi atribut-atribut objek
      pp1.lebar = 5;

      pp1.displayInfo(); //Memanggil method untuk menampilkan info persegi panjang

      System.out.println("Luas: " + pp1.getLuas());  //memanggil method menghitung luas

      System.out.println("Keliling: " + pp1.getKeliling()); //memanggil method menghitung keliling
   } 
}
