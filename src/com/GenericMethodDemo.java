package com;

public class GenericMethodDemo {

    public static void main(String[] args){
        //可以为静态方法定义泛型类型
        Users<Integer,String ,Integer> user = new Users<>();

        Integer[] integers = {1,2,3,4,5};
        String [] strings = {"London","Paris","NEW York","Austin"};

        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }

    public static <E> void print(E[] list){
        for (int i = 0;i<list.length;i++)
            System.out.println(list[i] +"");
        System.out.println();
    }
}
