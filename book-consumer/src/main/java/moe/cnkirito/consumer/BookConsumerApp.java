package moe.cnkirito.consumer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-07-31
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "moe.cnkirito.consumer")
public class BookConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(BookConsumerApp.class, args);
    }
}
