package com.studyPro.springboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 范富强
 * @description
 * @date 2018/1/11 15:33
 *
 * **********************
 * 定时任务
 * @Scheduled(fixedRate=2000)：上一次开始执行时间点后2秒再次执行；

 * @Scheduled(fixedDelay=2000)：上一次执行完毕时间点后2秒再次执行；

 * @Scheduled(initialDelay=1000, fixedDelay=2000)：第一次延迟1秒执行，然后在上一次执行完毕时间点后2秒再次执行；

 *  @Scheduled(cron="* * * * * ?")：按cron规则执行。
 *
 * **********************
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /*@Scheduled(fixedRateString = "${jobs.fixedRate}")
    public void getTask1() {
        System.out.println("任务1,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    /*@Scheduled(fixedDelayString = "${jobs.fixedDelay}")
    public void getTask2() {
        System.out.println("任务2,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    /*@Scheduled(initialDelayString = "${jsobs.initialDelay}", fixedRateString = "${jobs.fixedRateInt}")
    public void getTask3() {
        System.out.println("任务3,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    /*@Scheduled(initialDelayString = "${jsobs.initialDelay}", fixedDelayString = "${jobs.fixedDelayInt}")
    public void getTask4() {
        System.out.println("任务4,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    @Scheduled(cron = "${jobs.cron}")
    public void getTask5() {
        System.out.println("任务5,从配置文件加载任务信息，当前时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
