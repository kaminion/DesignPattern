package Chapter01.abs;

import Chapter01.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly");
    };
}
