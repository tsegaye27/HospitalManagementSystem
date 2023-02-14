package hms;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private int age;
    private String sex;
    private int roomNo;

    public List<Patient> patients = new ArrayList<Patient>();

    public Patient(int id, String name, int age, String sex, int roomNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.roomNo = roomNo;
    }

    public Patient(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void  addPatient(Patient patient){
        patients.add(patient);
    }
    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void payBill(Bill bill) {
        System.out.println("Patient " + name + " has paid a bill of $" + bill.getAmount() + " with card number  " + bill.getCardNo());
    }
}