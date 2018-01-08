package com.studyPro.designPattern;

/**
 * @author 范富强
 * @description
 * @date 2017/12/8 16:02
 */
public class DecrotorPattern {

    public interface Person {
        void eat();
    }

    public static class Man implements Person {
        public void eat() {
            System.out.println("男人在吃");
        }
    }

    public static abstract class Decorator implements Person {

        protected Person person;

        public void setPerson(Person person) {
            this.person = person;
        }

        public void eat() {
            person.eat();
        }
    }

    public static class ManDecoratorA extends Decorator {

        public void eat() {
            super.eat();
            reEat();
            System.out.println("ManDecoratorA类");
        }

        public void reEat() {
            System.out.println("再吃一顿饭");
        }
    }

    public static class ManDecoratorB extends Decorator {

        public void eat() {
            super.eat();
            System.out.println("===============");
            System.out.println("ManDecoratorB类");
        }
    }



    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }



}
