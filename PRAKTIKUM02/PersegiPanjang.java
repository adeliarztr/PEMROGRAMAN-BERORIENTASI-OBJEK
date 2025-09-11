
public class PersegiPanjang { //DEKLARASI Atribut
    int panjang;
    int lebar;

    public void displayInfo() { //METHOD UNTUK MENAMPILKAN INFO PERSEGI PANJANG
        System.out.println("-----INFO PERSEGI PANJANG------");
        System.out.println("Panjang PersegiPanjang: " + panjang);
        System.out.println("Lebar PersegiPanjang : " + lebar);
    }
    
    public int getLuas() { // Method menghitung luas
        return panjang * lebar;//Rumus luas Persegi Panjang
    }

    public int getKeliling() { //Method menghitung keliling
        return 2 * (panjang + lebar); //Rumus keliling Persegi Panjang
    }

}
