package com.wanhao.parrern.principle;

/**
 * Created by LiuLiHao on 2019/7/24 0024 上午 08:54
 * @author : LiuLiHao
 * 描述：依赖倒转原则
 * 低层模块尽量使用接口
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.say(new WeChat());

        Person2 person2 = new Person2(new WeChat());
        person2.say();

        Person3 person3 = new Person3();
        person3.setiSender(new Email());
        person3.say();
    }

    /**
     * 定义一个接口
     */
    interface ISender{
        String sendMsg();
    }

    static class WeChat implements ISender{

        public String sendMsg() {
            return "from wechat";
        }
    }

    static class Email implements ISender{

        public String sendMsg() {
            return "from email";
        }
    }

    static class Person1{
        /**
         * 方法中使用接口
         * @param iSender
         */
        public void say(ISender iSender){
            System.out.println(iSender.sendMsg());
        }
    }

    static class Person2{
        ISender iSender;

        public Person2(ISender iSender) {
            this.iSender = iSender;
        }
        /**
         * 构造中设置
         */
        public void say(){
            System.out.println(iSender.sendMsg());
        }
    }


    static class Person3{
        ISender iSender;

        public void setiSender(ISender iSender) {
            this.iSender = iSender;
        }

        /**
         * 构造中设置
         */
        public void say(){
            if (iSender!=null){
                System.out.println(iSender.sendMsg());
            }
        }
    }

}
