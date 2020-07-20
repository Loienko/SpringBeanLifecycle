package net.ukr.dreamsicle.bean.programmatic_approach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "net.ukr.dreamsicle.bean.programmatic_approach")
public class ProgramApproachConfig {

    @Bean
    public ProgramApproach programApproach(){
        return new ProgramApproach("Believe in Yourself");
    }
}
