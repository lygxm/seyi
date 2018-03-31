package com;

public class User implements Cloneable{
    private String name;
    private Integer age;
    private Address address;


    public User(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        Address address = (Address) this.address.clone();
        user.address = address;
        return user;
    }

    public static void main(String... args) throws CloneNotSupportedException {

        User tom = new User("tom", 3, new Address(3, "address3"));
        User cloneTom = (User) tom.clone();

        System.out.println(tom == cloneTom);

        System.out.println(cloneTom.address == tom.address);

    }

}
