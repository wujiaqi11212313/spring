package animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    @Autowired
    public Dog dog;
    public void run(){
        System.out.println("cat run");
        dog.run();
    }
}
