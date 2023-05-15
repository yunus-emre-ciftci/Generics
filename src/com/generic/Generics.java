package com.generic;

import com.generic.tests.GenericsUsefulClass;
import com.generic.tests.GenericsUsefullMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        //genericsClass();
        //genericsMethods();
        //genericsMethod2();
        genericsMethod3();
    }

    public static void genericsClass() {
        /* generic basit kullanım: class, method, List, Arrays
        GenericUsefulClass sınıfı <G> tipinden referans alan bir sınıftır. Bu sayede başka sınıflarda kullanılırken
        farklı veri türleriyle referans edebiliriz. İlla G harfi olmak zorunda değil herhangi bir keyword olmayan kelime
        olabilir.
        */

        // İki nesnenin de tipini class adının yanına yazarak belirledik
        GenericsUsefulClass<String> genericsUsefulClass = new GenericsUsefulClass<>("Çok güzel");
        GenericsUsefulClass<Integer> genericsUsefulClass1 = new GenericsUsefulClass<>(3);
        genericsUsefulClass.getData();
        genericsUsefulClass1.getData();


        // Burada nesne oluşturuken refere edecek bir şey yazmadık. Hata verecek. Çünkü GenericsUsefulClass G tipinden referans almaktadır. Neyden referans
        // aldığı belirtilmezse hata alınacaktır. Java nasıl bir nesne oluşturacağını bilemez.
        // GenericsUsefulClass genericsUsefulClass2 = new GenericsUsefulClass<>();
        //genericsUsefulClass2.getData();
    }

    public static void genericsMethods() {
        GenericsUsefullMethods genericsUsefullMethods = new GenericsUsefullMethods();
        String fullName = "Yunus Emre Çiftçi";
        int myAge = 23;
        genericsUsefullMethods.printMethod(fullName);
        genericsUsefullMethods.printMethod(myAge);
        //genericMethod metodumuza biz parametre olarak hangi veri tipinde değer verirsen ona göre işlem yapar.
        // Generic'lerin en önemli özelliklerinden birisi de aynı kodu farklı veri tiplerinde kullanabilme imkanı sağlamasıdır.
        // Bu durum olmasaydı farklı farklı metodlar yazmak durumunda kalacaktık.
    }

    public static void genericsMethod2() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");

        GenericsUsefullMethods genericsUsefullMethods = new GenericsUsefullMethods();

        genericsUsefullMethods.printMethod2(arrayList);
        //Bu metod çalışır çünkü Integer sınıfı Number sınıfını extends ediyor.


        //genericsUsefullMethods.printMethod2(arrayList1);
        //Bu kod hata verir çünkü String tipinde bir arraylist bu.
        //Ama biz printMethod2 metoduna verilen dışarıdan herhangi bir tipin sadece Number sınıfına denk veya alt sınıfı olmasını istedik.

    }

    public static void genericsMethod3() {
        GenericsUsefullMethods genericsUsefullMethods = new GenericsUsefullMethods();
        List list = new ArrayList();
        genericsUsefullMethods.printMethod3(list,2);
        genericsUsefullMethods.printMethod(list);

        // ? super Integer ile Integer ya da Integer'in üst sınıflarıyla işlem yapabilirsiniz. Bir nevi taban sınıf Integer
        // tavan sınıf Integer'ın en üst noktası.
    }
}
