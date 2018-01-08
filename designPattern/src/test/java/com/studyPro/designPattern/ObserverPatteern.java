package com.studyPro.designPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 范富强
 * @description
 * @date 2017/12/8 16:05
 */
public class ObserverPatteern {

    public interface Observer {
        public void update(String message);
    }

    public static class WeixinUser implements Observer {
        private String name;
        public WeixinUser(String name) {
            this.name = name;
        }

        public void update(String message) {
            System.out.println(name + "-" + message);
        }
    }

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

    public static class SubscriptionSubject implements Subject {
        //储存订阅公众号的微信用户
        private List<Observer> weixinUserlist = new ArrayList<Observer>();

        public void attach(Observer observer) {
            weixinUserlist.add(observer);
        }

        public void detach(Observer observer) {
            weixinUserlist.remove(observer);
        }

        public void notify(String message) {
            for (Observer observer : weixinUserlist) {
                observer.update(message);
            }
        }
    }


    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();
        //创建微信用户
        WeixinUser user1=new WeixinUser("zhangsan");
        WeixinUser user2=new WeixinUser("李斯");
        WeixinUser user3=new WeixinUser("旺旺");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("通知你们");
    }



}
