package moe.cnkirito.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-08-07
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "moe.cnkirito.provider")
public class GoodsProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(GoodsProviderApp.class, args);
    }
}
