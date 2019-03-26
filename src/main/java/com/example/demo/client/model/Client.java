package com.example.demo.client.model;

import java.util.UUID;

public class Client {

    private UUID id;
    private String name;
    private String surname;
    private Integer age;
    private Double hight;
    private Double weight;


    public Client() {
    }

    public Client(UUID id, String name, String surname, Integer age, Double hight, Double weight) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHight() {
        return hight;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                ", weight=" + weight +
                '}';
    }
}
