package Chapter01;

import Chapter01.abs.FlyWithWings;
import Chapter01.abs.Quack;
import Chapter01.mainabs.Duck;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display()
    {
        System.out.println("물오리입니다.");
    }

}
