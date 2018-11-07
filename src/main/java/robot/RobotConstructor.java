package robot;

import robot.ibm.IbmHead;
import robot.ibm.IbmLeg;
import robot.sony.SonyHand;
import robot.sony.SonyLeg;

public class RobotConstructor {
    public static void main(String[] args) {
        IbmHead ibmHead = new IbmHead();
        SonyHand sonyHand = new SonyHand();
        SonyLeg sonyLeg = new SonyLeg();
        IbmLeg ibmLeg = new IbmLeg();
        Robot robot1 = new Robot(ibmHead,sonyHand,sonyLeg);

        robot1.action();


    }
}
