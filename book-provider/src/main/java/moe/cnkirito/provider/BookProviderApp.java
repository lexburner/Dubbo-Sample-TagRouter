package moe.cnkirito.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-03
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "moe.cnkirito.provider")
public class BookProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(BookProviderApp.class, args);
    }
}
