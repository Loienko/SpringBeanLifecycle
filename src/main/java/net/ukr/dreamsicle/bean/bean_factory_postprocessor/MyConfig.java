package net.ukr.dreamsicle.bean.bean_factory_postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    MyConfigBean myConfigBean () {
        return new MyConfigBean();
    }
}
