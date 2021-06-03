package com.kastro;

/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

 */
public class Employee {

    private String fio;
    private String title;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee() {
    }

    public Employee(String fio, String title, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + title);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
