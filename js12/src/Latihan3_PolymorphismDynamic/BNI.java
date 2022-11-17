//created by 21343048_Ghenta Alif Alde

package Latihan3_PolymorphismDynamic;

public class BNI extends Bank {
    //overriding sukuBunga method
    float sukuBunga(){
        return 10.9f;
    }
}
class Mandiri extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 9.5f;
    }
}
