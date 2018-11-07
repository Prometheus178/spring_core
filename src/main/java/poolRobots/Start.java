package poolRobots;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("poolRobot.xml");
        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000pool");
        t1000Pool.action();


    }
}
