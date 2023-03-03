package model;

import java.util.Date;

public class Employee {
  private int id;
  private String name;
  private Date dob;
  private boolean gender;
  private int HOA;

    public Employee() {
    }

    public Employee(int id, String name, Date dob, boolean gender, int HOA) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.HOA = HOA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getHOA() {
        return HOA;
    }

    public void setHOA(int HOA) {
        this.HOA = HOA;
    }
    
}
