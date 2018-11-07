package robot;

import robot.interfaces.Hand;
import robot.interfaces.Head;
import robot.interfaces.Leg;

public class Robot implements robot.interfaces.Robot {
    Head head;
    Hand hand;
    Leg leg;


    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void action(){
        head.voice();
        hand.handUp();
        leg.go();
    }
}
