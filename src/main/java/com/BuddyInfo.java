package com;

import javax.persistence.*;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String name;
    private String address;
    private String phoneNumber;

    @ManyToOne
    private AddressBook book;

    public BuddyInfo(){
    }

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name =name;
        this.address =address;
        this.phoneNumber= phoneNumber;
    }

    public AddressBook getBook(){
        return this.book;
    }

    public void setBook(AddressBook addressBook){
        this.book = addressBook;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phone){
        this.phoneNumber = phone;
    }

    @Override
    public String toString(){
        String str ="";
        str = this.name + " - Address: "+ this.address +" - Phone Number: " + this.phoneNumber ;
        return str;
    }

}
