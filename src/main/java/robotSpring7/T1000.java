package robotSpring7;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import robot.BaseModel;
import robot.interfaces.Hand;
import robot.interfaces.Head;
import robot.interfaces.Leg;
import robot.interfaces.Robot;

public class T1000 extends BaseModel implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method init()");
    }

    private Head head;
    private Hand hand;
    private Leg leg;
    private String color;
    private int made;
    private boolean sound;



    public T1000(String color, int made, boolean sound) {
        this.color = color;
        this.made = made;
        this.sound = sound;
    }

    public T1000(Head head, Hand hand, Leg leg, String color, int made, boolean sound) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.made = made;
        this.sound = sound;
    }

    public T1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public T1000() {
    }

    public void action() {
       head.voice();
       hand.handUp();
       leg.go();
        System.out.println("Color " + color);
        System.out.println("Made "+ made);
        System.out.println("Can play sound " +sound);

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
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMade() {
        return made;
    }

    public void setMade(int made) {
        this.made = made;
    }

    public boolean isSound() {
        return sound;
    }

    public void initObjetc(){
        System.out.println("init");
    }

}
