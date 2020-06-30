package cn.tmz.cloud.study.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: cloud-study
 * @description:
 * @author: tmz
 * @create: 2020-06-30 13:21
 */
@SpringBootApplication(scanBasePackages = {"cn.tmz.cloud.study"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
