package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String... args){
        Collection collection = new ArrayList<Integer>();

        System.out.println(32 >> 1);//右移一位除以2，右移两位除以两次2(4)
        System.out.println(2 << 1 );//左移一位乘以2，左移两位乘以两次2(4)

        collection.add(7);
        collection.add(3);
        collection.add(4);
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(8);
        collection.add(9);

        Iterator<Integer> interator = collection.iterator();
        
        while(interator.hasNext()){
            System.out.println(interator.next());
            //forEach循环实际上在后台就是使用的迭代器。这与for循环有本质区别
            //迭代器的效果效率更高且更通用

           /* collection.forEach(System.out::println);//java 8
           collection.forEach(e->{
              System.out.println("item: ")
              System.out.println(e)
           });//java 8  */
        }
    }
}
