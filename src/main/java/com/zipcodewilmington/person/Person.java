package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private double height = Double.MAX_VALUE;
    private double weight = Double.MAX_VALUE;
    private int friends = Integer.MAX_VALUE;
    private int shoes = Integer.MAX_VALUE;
    private int waterBottles = Integer.MAX_VALUE;

    public Person() {

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

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age, double height, double weight, int shoes){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.shoes = shoes;
    }

    public Person(String name, int age, double height, double weight, int shoes, int waterBottles){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.shoes = shoes;
        this.waterBottles = waterBottles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setFriends(int friends){
        this.friends = friends;
    }

    public void setShoes(int shoes){
        this.shoes = shoes;
    }

    public void setWaterBottles(int waterBottles){
        this.waterBottles = waterBottles;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight(){
        return height;
    }

    public Double getWeight(){
        return weight;
    }

    public int getFriends() {
        return friends;
    }

    public int getShoes() {
        return shoes;
    }

    public int getWaterBottles() {
        return waterBottles;
    }
}
