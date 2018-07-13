import animal.Cat;
import animal.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.dom.DOMCryptoContext;

public class TestClass {


    /**
     * 使用@ComponentScan注解,这个注解能够在Spring中启用组件扫描,不需要XML配置文件
     */
    @Test
    public void a(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Cat.class);
        Cat cat = ac.getBean(Cat.class);
        cat.run();
    }

    /**
     * 使用XML配置文件来启用组件扫描
     */
    @Test
    public void b(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = ac.getBean(Cat.class);
        cat.run();
    }

}
