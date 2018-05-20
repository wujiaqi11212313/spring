package animal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void run(){
        System.out.println("dog run");
    }
}
