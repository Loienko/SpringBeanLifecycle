package net.ukr.dreamsicle.bean.programmatic_approach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProgramApproachSpringBeanLifeCycleApp {
    public static void main(String[] args) {
        SpringApplication.run(ProgramApproachSpringBeanLifeCycleApp.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProgramApproachConfig.class);

        ProgramApproach programApproach = context.getBean(ProgramApproach.class);
        System.out.println(programApproach.getBookName());

        context.registerShutdownHook();
    }
}
