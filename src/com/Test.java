package com;

interface  Shape{}
class Rectangle implements Shape{}
class Circle implements Shape{}
class T{}

public class Test {
    //受限范型
    public static <E extends Shape> Shape getShape(E shape){
        return shape;
    }

    public static void main(String... args){
        Test.getShape(new Circle());
       /*Test.getShape(new T());*/
    }
}
