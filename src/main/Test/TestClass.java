import animal.B;
import animal.Cat;
import animal.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.dom.DOMCryptoContext;

public class TestClass {

    @Test
    public void a(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(B.class);
        Cat cat = ac.getBean(Cat.class);
        cat.run();
    }

    @Test
    public void b(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = ac.getBean(Cat.class);
        cat.run();
    }

}
