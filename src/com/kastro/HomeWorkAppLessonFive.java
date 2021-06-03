package com.kastro;

public class HomeWorkAppLessonFive {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Кастро Надежда Сергеевна", "QA Engineer", "kastro_kastro@mail.ru", "8(985)0000102", 150050, 28);
        employees[1] = new Employee("Смирнов Артем Николаевич", "Developer", "a.smirnov@mail.ru", "8(900)0021002", 99999, 89);
        employees[2] = new Employee("Бобров Максим Максимович", "Delivery Manager", "dm@mail.ru", "8(123)4560102", 250000, 45);
        employees[3] = new Employee("Николаева Елена Михайловна", "Business Analyst", "e.nik@mail.ru", "8(150)1250102", 190550, 58);
        employees[4] = new Employee("Иванов Иван Иванович", "Engineer", "123@mail.ru", "8(985)0000102", 130050, 18);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("///");
                employees[i].printEmployee();
            }
        }
    }
}
