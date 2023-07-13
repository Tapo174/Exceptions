package Hm_3;

public class SexExeption extends Exception {
    public SexExeption() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
    
}
