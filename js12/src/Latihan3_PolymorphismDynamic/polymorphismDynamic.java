//created by 21343048_Ghenta Alif Alde

package Latihan3_PolymorphismDynamic;

public class polymorphismDynamic {
    public static void main(String[] args) {
        //creating variabel of bank class
        Bank B;
        B = new BRI();
        System.out.println("tingkat suku bunga BRI adalah: " +B.sukuBunga());
        B = new BNI();
        System.out.println("tingkat suku bunga BNI adalah: " +B.sukuBunga());
        B = new Mandiri();
        System.out.println("tingkat suku bunga Mandiri adalah: " +B.sukuBunga());
    }
}
