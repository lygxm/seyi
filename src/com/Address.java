package com;

public class Address implements Cloneable{
    private String address;
    private Integer id;

    public Address(Integer id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
