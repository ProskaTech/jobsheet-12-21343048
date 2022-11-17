//created by 21343048_Ghenta Alif Alde

package Latihan3_PolymorphismDynamic;

public class Bank {
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
        return 5.0f;
    }
}
