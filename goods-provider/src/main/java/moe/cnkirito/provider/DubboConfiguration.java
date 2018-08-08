package moe.cnkirito.provider;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-goods");
        applicationConfig.setQosEnable(false);
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


}