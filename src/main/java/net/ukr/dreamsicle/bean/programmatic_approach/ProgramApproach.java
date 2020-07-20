package net.ukr.dreamsicle.bean.programmatic_approach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ProgramApproach implements InitializingBean, DisposableBean {

    private String bookName;

    public ProgramApproach() {
        System.out.println("Constructor of Book bean is called !! ");
    }

    public ProgramApproach(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method of Book bean called !! ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method of Book bean is called !! ");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
