package com.example.demo.information;

public class Information {

    private long id;
    private String name;
    private String family;
    private String email;
    private int age;

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Information(long id, int age, String family, String name, String email) {
        this.id = id;
        this.age = age;
        this.family = family;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }
}
