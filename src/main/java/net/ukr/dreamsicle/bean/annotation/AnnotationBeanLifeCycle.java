package net.ukr.dreamsicle.bean.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationBeanLifeCycle {

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Bean XMLBeanLifeCycle has been instantiated in the init() method");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("XMLBeanLifeCycle has been closed and in the destroy() method");
    }
}
