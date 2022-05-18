package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private String sex;
        private String hobby;
        private long id;
        
        public Human() {
            this.name = "incognito";
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, long id) {
            this.age = age;
            this.id = id;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        
        public Human(String name, String surname, int age, String sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, String sex,
                     String hobby) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.hobby = hobby;
        }
        
        public Human(String name, String surname, String sex,
                     String hobby) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.hobby = hobby;
        }

        public Human(String name, String surname, int age, String sex,
                     String hobby, long id) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.hobby = hobby;
            this.id = id;
        }
    }
}
