package com.generic.tests;
import java.util.List;

public class GenericsUsefullMethods {
    public <T> void printMethod(T objecT){ // T tipinde herhangi bir veri tipinde bir veri istiyoruz.
        System.out.println(objecT); // Bu veriyi ekrana yazdırıyoruz.
    }
    public void printMethod2(List<? extends Number> numbers){
        for (Number number: numbers) {
            System.out.println(number);
        }
    }
    public void printMethod3 (List<? super Integer> numbers, int number){
        numbers.add(number);
    }
}
