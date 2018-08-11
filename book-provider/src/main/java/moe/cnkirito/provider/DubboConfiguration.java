package moe.cnkirito.provider;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.Constants;
import org.apache.dubbo.config.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kirito.moe@foxmail.com
 * Date 2018-08-03
 */
@Configuration
@Slf4j
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-book");
        applicationConfig.setQosEnable(false);
        // instruct tag router
        Map<String,String> parameters = new HashMap<>();
        parameters.put(Constants.ROUTER_KEY, "tag");
        applicationConfig.setParameters(parameters);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfig.setClient("curator");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(@Value("${dubbo.protocol.port}") Integer port) {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setDefault(true);
        protocolConfig.setPort(port);
        protocolConfig.setName("dubbo");
        return protocolConfig;
    }

    @Bean
    public ProviderConfig providerConfig(@Value("${dubbo.provider.tag:}") String tag){
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTag(tag);
        log.info("application tag => {}", tag);
        return providerConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig(){
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setCheck(false);
        return consumerConfig;
    }


}