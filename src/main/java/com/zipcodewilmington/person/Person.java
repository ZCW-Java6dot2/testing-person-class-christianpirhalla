package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String race;
    private String gender;
    private boolean employed;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person(String expectedName, Integer expectedAge, Integer expectedWeight) {
        this.name = expectedName;
        this.age = expectedAge;
        this.weight = expectedWeight;
    }

    public Person(String name, Integer age, Integer weight, Integer height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int age, int weight, int height, String race) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
    }

    public Person(String name, int age, int weight, int height, String race, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
        this.gender = gender;
    }

    public Person(String name, int age, int weight, int height, String race, String gender, Boolean employed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
        this.gender = gender;
        this.employed = employed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public Boolean getEmployed() {
        return employed;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmployed(Boolean expectedEmployed) {
        this.employed = employed;
    }
}
