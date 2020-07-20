package net.ukr.dreamsicle.bean.xml;

public class XMLBeanLifeCycle {
    public void init() throws Exception {
        System.out.println("Bean XMLBeanLifeCycle has been instantiated in the init() method");
    }

    public void destroy() throws Exception {
        System.out.println("XMLBeanLifeCycle has been closed and in the destroy() method");
    }
}
