package Chapter01.abs;

import Chapter01.Interface.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    public void fly()
    {
        System.out.println("로켓추진으로 날아갑니다.");
    }

}
