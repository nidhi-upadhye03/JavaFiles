package com.tns.finaldemo;
final class FinalClassDemo
{
    void show() {
        System.out.println("Final class cannot be inherited");
    }
}
 
public class FinalClass {
    public static void main(String[] args) {
        FinalClassDemo f= new FinalClassDemo();//object creation is possble
        f.show();//accessing data is also possible
    
    }

}
