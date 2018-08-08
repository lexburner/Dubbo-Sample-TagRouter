package moe.cnkirito.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 徐靖峰[OF2938]
 * Date 2018-08-07
 */
@SpringBootApplication
@ImportResource("classpath:dubbo.xml")
public class GoodsProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(GoodsProviderApp.class, args);
    }
}
