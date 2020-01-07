package Chapter01.abs;

import Chapter01.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("mute");
    }
}
