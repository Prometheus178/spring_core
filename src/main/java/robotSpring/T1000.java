package robotSpring;

import robot.interfaces.Hand;
import robot.interfaces.Head;
import robot.interfaces.Leg;
import robot.interfaces.Robot;

public class T1000 implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public T1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public T1000() {
    }


    public void action() {
        System.out.println("go to sleep");
    }

    public void dance(){
        System.out.println("robot is dancing");
    }
}
