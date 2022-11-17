//created by 21343048_Ghenta Alif Alde

package Latihan2_Polymorphism;

public class PolymorphismStatic {
    public static void main(String[] args) {
        //memanggil metode perimeter dengan satu argumen
        System.out.println("Sisi persegi adlaah : 4\nKeliling persegi adalah : "
                            + CompileTime.keliling(4) + "\n");
        //memanggil metode perimeter dengan dua argumen
        System.out.println(
            "Sisi persegi panjang adalah : 10, 13\nKeliling persegi panjang adalah : "
            +CompileTime.keliling(10, 13));
    }
}
