package com.tnsif.usingfinal;

class FinalClass {
    void show() {
        System.out.println("This class can be inherited.");
    }
}

class FinalChildClass extends FinalClass {
    // You can add additional methods or behavior here
}

public class FinalClassDemo {
    public static void main(String[] args) {
        // Create an object of the subclass
        FinalChildClass f1 = new FinalChildClass();
        f1.show();
    }
}
