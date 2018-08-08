package moe.cnkirito.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-07-31
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class BookConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(BookConsumerApp.class, args);
    }
}
