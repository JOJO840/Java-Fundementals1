package org.example;

public class Person {
    private String name;
    private int age;
    private String gender;
    private boolean isMarried;
    private char drivingLicenseType;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDrivingLicenseType(char drivingLicenseType) {
        this.drivingLicenseType = drivingLicenseType;
    }

    public char getDrivingLicenseType() {
        return drivingLicenseType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }
    public String getGender() {
        return gender;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    public boolean isMarried() {
        return isMarried;
    }
    public void printPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Is Married: " + isMarried);
        System.out.println("Driving License Type: " + drivingLicenseType);
    }


} // class paragraph
