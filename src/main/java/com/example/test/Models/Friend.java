package com.example.test.Models;

public class Friend {
    private int id;
    private String Namn;
    private String Adress;
    private String Phone;

    public Friend(int id, String namn, String adress, String phone) {
        this.id = id;
        Namn = namn;
        Adress = adress;
        Phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return Namn;
    }

    public void setNamn(String namn) {
        Namn = namn;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
