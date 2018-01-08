package com.studyPro.designPattern;

/**
 * 装饰着模式
 */
public class DecoratorPattern {

    public interface Person {
        void eat();
    }

    public class Man implements Person {
        @Override
        public void eat() {
            System.out.println("男人在吃");
        }
    }

    public abstract class Decorator implements Person {

        protected Person person;

        public void setPerson(Person person) {
            this.person = person;
        }

        @Override
        public void eat() {
            person.eat();
        }
    }


    public class ManDecoratorA extends Decorator {

        @Override
        public void eat() {
            super.eat();
            reEat();
            System.out.println("ManDecoratorA类");
        }

        public void reEat() {
            System.out.println("再吃一顿饭");
        }
    }


    public class ManDecoratorB extends Decorator {
        @Override
        public void eat() {
            super.eat();
            System.out.println("===============");
            System.out.println("ManDecoratorB类");
        }
    }

    public void test(){
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }

    public static void main(String[] args) {
       new DecoratorPattern().test();
    }


}
