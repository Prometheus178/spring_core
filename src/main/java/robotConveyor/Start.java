package robotConveyor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robot.interfaces.Robot;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conveyor.xml");
        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("robotConveyor");
        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        System.out.println("terminator 1 " + terminator1);
        System.out.println("terminator 2 " + terminator2);
        System.out.println("terminator 3 " + terminator3);
        terminator1.action();
    }
}
