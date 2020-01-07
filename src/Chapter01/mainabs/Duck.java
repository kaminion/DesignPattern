package Chapter01.mainabs;

import Chapter01.Interface.FlyBehavior;
import Chapter01.Interface.QuackBehavior;

public class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void swin()
    {

    }

    public void display()
    {

    }
    public void performFly()
    {
        flyBehavior.fly();
    }

}
