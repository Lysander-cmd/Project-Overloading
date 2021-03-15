
package project_overloading;


public class Main {

    
    public static void main(String[] args) {
       System.out.println("Selamat datang di kasir online");
       // membuat objek induk
       Induk induk = new Induk();
       // membuat objek anak dan mengisi nilai properti
       Anak anak = new Anak();
        // memanggil method Duabarang
       induk.Duabarang();
       anak.Hitung(10000, 20000);
        // memanggil method Diskon
       induk.Diskon();
       anak.Hitung(10000, 20000, 15000);
        // memanggil method Kembalian
       induk.Kembalian();
       anak.Hitung(10000, 20000, 15000, 50000);
    }
    
}
