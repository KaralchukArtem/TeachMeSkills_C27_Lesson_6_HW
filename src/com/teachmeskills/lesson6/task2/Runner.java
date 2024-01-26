package com.teachmeskills.lesson6.task2;

import com.teachmeskills.lesson6.task2.student.Student;

public class Runner {

    public static void main(String[] args) {

        Student[]student = new Student[]{
                new Student("Артём","Астапчик","11111111111","C-27",16),
                new Student("Алина","Илькевич","22222222222","C-27",17),
                new Student("Анастасия ","Иргалиева ","33333333333","C-27",18),
                new Student("Артём","Каральчук ","44444444444","C-27",19),
                new Student("Никита ","Крайко ","55555555555","C-27",20),
                new Student("Олег ","Манеев ","66666666666","C-27",21),
                new Student("Иван ","Михновецкий ","77777777777","C-27",22),
                new Student("Кирилл ","Паляница ","88888888888","C-27",23),
                new Student("Руслан ","Рябухин ","99999999999","C-27",32),
        };

        for (Student agr: student){
            System.out.println(
                "Имя:  - " + agr.name + "\n" +
                "Фамилия:  - " +     agr.surename + "\n" +
                "Номер паспорта:  - " +     agr.passportID + "\n" +
                "Название группы:  - " +     agr.className + "\n" +
                "Возраст:  - " +     agr.age + "\n"
            );

        }

    }

}
