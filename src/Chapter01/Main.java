package Chapter01;

import Chapter01.mainabs.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
    }
}
