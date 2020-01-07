package Chapter01.abs;

import Chapter01.Interface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
