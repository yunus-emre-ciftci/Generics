package com.generic;

import com.generic.tests.GenericsUsefulClass;

public class Generics {
    public static void main(String[] args) {

        test1();
    }

    public static void test1() {
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

}
