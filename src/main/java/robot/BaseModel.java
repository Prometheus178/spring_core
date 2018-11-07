package robot;

import robot.interfaces.Hand;
import robot.interfaces.Head;
import robot.interfaces.Leg;
import robot.interfaces.Robot;

public abstract class BaseModel implements Robot     {
    private Head head;
    private Hand hand;
    private Leg leg;

    public BaseModel(){
        System.out.println(this + "Base module constructot");
    }

    public BaseModel(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

}
