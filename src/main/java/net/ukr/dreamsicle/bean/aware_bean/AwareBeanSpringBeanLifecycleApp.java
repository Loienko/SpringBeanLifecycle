package net.ukr.dreamsicle.bean.aware_bean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AwareBeanSpringBeanLifecycleApp {
    public static void main(String[] args) {
        // -------awareinterfaces---------
        ApplicationContext context1 = new ClassPathXmlApplicationContext("awareBean.xml");
        AwareBeanImpl awareBeanImpl = (AwareBeanImpl) context1.getBean("awareBean");
        ((AbstractApplicationContext) context1).registerShutdownHook();
        System.out.println("awareBean: " + awareBeanImpl.toString());
    }
}
