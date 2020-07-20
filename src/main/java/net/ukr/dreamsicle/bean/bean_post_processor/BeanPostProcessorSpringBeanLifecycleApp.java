package net.ukr.dreamsicle.bean.bean_post_processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanPostProcessorSpringBeanLifecycleApp {

    public static void main(String[] args) {
        SpringApplication.run(BeanPostProcessorSpringBeanLifecycleApp.class);

        // -------beanpostprocessor------
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beansPostProcessor.xml");
        BookBean bookBean = (BookBean) context.getBean("bookBeanPost");
        context.registerShutdownHook();
        System.out.println(bookBean.getBookName());
    }
}
