package com.studyPro.designPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 范富强
 * @version 1.0
 * @description 观察者模式
 * @date 2017/11/30 10:33
 */
public class ObserverPattern {

    /**
     * 观察者规范接口，定义通知方法
     */
    public interface Observer {
        void update(String message);
    }

    /**
     * 具体的观察者实现
     */
    public class WeixinUser implements Observer {
        private String name;
        public WeixinUser(String name) {
            this.name = name;
        }

        @Override
        public void update(String message) {
            System.out.println(name + "-" + message);
        }
    }

    /**
     * 观察主题接口，定义观察者的添加删除和通知服务
     */
    public interface Subject {
        /**
         * 增加订阅者
         * @param observer
         */
        public void attach(Observer observer);
        /**
         * 删除订阅者
         * @param observer
         */
        public void detach(Observer observer);
        /**
         * 通知订阅者更新消息
         */
        public void notify(String message);
    }

    /**
     * 具体的观察主题实现
     */
    public class SubscriptionSubject implements Subject {
        //储存订阅公众号的微信用户
        private List<Observer> weixinUserlist = new ArrayList<Observer>();
        @Override
        public void attach(Observer observer) {
            weixinUserlist.add(observer);
        }

        @Override
        public void detach(Observer observer) {
            weixinUserlist.remove(observer);
        }

        @Override
        public void notify(String message) {
            for (Observer observer : weixinUserlist) {
                observer.update(message);
            }
        }
    }

    /**
     * Test
     */
    public void Client() {
        Subject subject = new SubscriptionSubject();
        //创建微信用户
        Observer user1 = new WeixinUser("zhangsan");
        Observer user2 = new WeixinUser("李斯");
        Observer user3 = new WeixinUser("旺旺");
        //订阅公众号
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        subject.notify("通知你们");
    }

    public static void main(String args[]) {
        new ObserverPattern().Client();
    }

}
