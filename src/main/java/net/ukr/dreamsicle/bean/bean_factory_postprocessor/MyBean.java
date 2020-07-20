package net.ukr.dreamsicle.bean.bean_factory_postprocessor;

public class MyBean {
    private String strProp;

    public void setStrProp(String strProp) {
        this.strProp = strProp;
    }

    public void doSomething() {
        System.out.println("from MyBean:  " + strProp);
    }
}
