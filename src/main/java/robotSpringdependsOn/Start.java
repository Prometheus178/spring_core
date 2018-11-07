package robotSpringdependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependsOn.xml");
        T1000 t1000 = (T1000) context.getBean("t10008");
        System.out.println(t1000);



    }
}
