
package project_overloading;


public class Anak extends Induk{
    //overloading method Hitung
    public void Hitung(int a,int b){
        System.out.println("Hasil dari jumlah harga 2 barang : "+(a+b));
    }
    //overloading method Hitung
    public void Hitung (int a,int b,int c){
        int total =a+b+c;
        System.out.println("Hasil dari jumlah harga 3 barang : "+(total-total*20/100));
    }
    //overloading method Hitung
    public void Hitung (int a,int b,int c,int d){
        int total =a+b+c; 
        System.out.println("Hasil akhir dari total harga "+ (d-(total-total*20/100)));
    }
}
