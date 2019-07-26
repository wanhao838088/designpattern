package com.wanhao.parrern.principle;

/**
 * Created by LiuLiHao on 2019/7/25 0025 上午 09:02
 * @author : LiuLiHao
 * 描述：李氏替换原则
 */
public class Liskov {

    public static void main(String[] args) {
        Student student = new Student();
        student.say();

        B b = new B();
        b.aSay();
    }

    static class Person{
        public void say(){
            System.out.println("p say");
        }
    }

    static class Student extends Person{
        /**
         * 尽量不要重写父类的方法
         */
        @Override
        public void say() {
            System.out.println("s say");
        }
    }

    /**
     * 继承这个更基础的类
     */
    static class Base{

    }

    static class A extends Base{
        public void say(){
            System.out.println("a say");
        }
    }

    static class B extends Base{
        private A a = new A();

        public void say(){
            System.out.println("b say");
        }

        public void aSay(){
            a.say();
        }
    }

}
