package Doktor;

public class Doktor {
    private String name;
    private String surname;
    private int age;
    private String specialist;

    public Doktor(){}

    public Doktor(String name, String surname, int age, String specialist) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.specialist = specialist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
